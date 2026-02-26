package com.example.demo.mapper;

import com.example.demo.dao.entity.Human;
import com.example.demo.dao.entity.Human1;
import com.example.demo.dto.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HumanMapper {
@Mapping(source="age",target="age",qualifiedByName = "getAge")
Human dtoToEntity(Human2RequestDto dto);

    @Mapping(source="dto",target="fullname",qualifiedByName = "getFullnamee")
    Human1 dtoToEntity1(HumanRequestDto1 dto);


    HumanResponseDto entityToDto(Human human);
    List<HumanResponseDto> entityListToDtoList(List<Human> humans);

    HumanResponseDto1 entityToDto1(Human1 human);
    List<HumanResponseDto1> entityListToDtoList1(List<Human1> humans);

@Named("getNamee")
     default String getNamee(String fullname){
        return fullname.trim().split(" ")[0];
    }
    @Named("getSurnamee")
    default String getSurnamee(String fullname){
        return fullname.trim().split(" ")[1];
    }

    @Named("getFullnamee")
    default String getFullnamee(HumanRequestDto1 dto){

        return dto.getName()+" "+dto.getSurname();
    }
    List<String>list1=List.of("bir","bır", "1");
    List<String>list2=List.of("iki","ıkı", "2");
    List<String>list3=List.of("uch","uc","üç","3");
    List<String>list4=List.of("dord","dörd", "4");
    List<String>list5=List.of("bes","besh", "beş", "5");
    @Named("getAge")
    default Integer getAge(String age){
        String agel = age.toLowerCase();
       if(list1.contains(agel))
           return 1;
        else if(list2.contains(agel))
            return 2;
       else if(list3.contains(agel))
           return 3;
       else if(list4.contains(agel))
           return 4;
       else if(list5.contains(agel))
           return 5;
       else
           return 0;
    }}
