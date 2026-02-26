package com.demo4.mapper;

import com.demo4.dao.entity.Human;
import com.demo4.dto.HumanRequestDto;
import com.demo4.dto.HumanRequestDto1;
import com.demo4.dto.HumanResponseDto;
import com.demo4.dto.HumanResponseDto1;
import jdk.jfr.Name;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HumanMapper {

    HumanResponseDto entityToDto(Human h);
    List<HumanResponseDto> entityToDto(List<Human> h);

    @Mapping(source= "dto",target="fullName",qualifiedByName = "getFullName")
    @Mapping(source= "age",target="age",qualifiedByName = "getAge")
    Human dtoToEntity(HumanRequestDto dto);

    Human dtoToEntity1(HumanRequestDto1 dto);


    @Mapping(source="fullName",target="name",qualifiedByName = "getName")
    @Mapping(source="fullName",target="surname",qualifiedByName = "getSurname")
    HumanResponseDto1 entityToDto1(Human h);
    List<HumanResponseDto1> entityToDto1(List<Human> h);


    @Named("getFullName")
    default String getFullName(HumanRequestDto dto){
        return dto.getName()+" "+dto.getSurname();
    }

    List<String>list1=List.of("bir","bır","1");
    List<String>list2=List.of("iki","2");
    List<String>list3=List.of("uc","uch","üç","3");
    List<String>list4=List.of("dord","dörd","4");
    List<String>list5=List.of("bes","besh","beş","5");

@Named("getAge")
    default Integer getAge(String age){
    String lowerCase = age.toLowerCase();
    if(list1.contains(lowerCase))
        return 1;
    else if(list2.contains(lowerCase))
        return 2;
    else if(list3.contains(lowerCase))
        return 3;
    else if(list4.contains(lowerCase))
        return 4;
    else if(list5.contains(lowerCase))
        return 5;
    else
        return 0;

}

@Named("getName")
    default String  getName(String fullName){
    if(fullName != null){
        String[] split = fullName.trim().split("\\s+");
        return split[0];
    }
   return null;
}
    @Named("getSurname")
    default String  getSurname(String fullName){
        if(fullName != null){
            String[] split = fullName.trim().split("\\s+");
            if(split.length>1)
            return split[1];
        }
        return null;
    }

}


