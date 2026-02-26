package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Person;
import com.example.demo.dto.PersonDto;
import com.example.demo.dto.PersonRequestDto;
import com.example.demo.dto.PersonResponseDto;
import com.example.demo.dto.PersonResponseDto1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Long> {
    @Query(value = "select firstname,age from person11",nativeQuery = true)
List<PersonResponseDto> getPersons();


        @Query(value = "select id,firstname,age from person where id=:id",nativeQuery = true)
        PersonResponseDto getPersonById(@Param("id")Long id);

    @Transactional
    @Modifying
    @Query(value = "insert into person (firstname,age) values(:name,:age)",nativeQuery = true)
    void addPerson(@Param("name")String name,@Param("age")Integer age);

    @Query(value = "select id,firstname,age from person where firstname=:name and age=:age",nativeQuery = true)
    List<PersonResponseDto> getPersonByNameandAge(@Param("name")String firstname,@Param("age")Integer age);

@Transactional
    @Modifying
    @Query(value = "update person set firstname=:name where age>:age",nativeQuery = true)
     void updatePerson(@Param("name")String name, @Param("age")Integer age);

    @Transactional
    @Modifying
    @Query(value = "delete from person where age>:age",nativeQuery = true)
    void deletePerson(@Param("age")Integer age);

@Query(value="select count(*) from person",nativeQuery = true)
    Long countPerson();

@Query(value="select age,count(age) from person group by age",nativeQuery = true)
   List<PersonResponseDto1> personGroubByAge();

    @Query(value="select id, firstname,age,balance,country from person order by balance",nativeQuery = true)
    List<PersonResponseDto> personBalance();

    @Query(value="select min(balance) from person ",nativeQuery = true)
    Long personMinBalance();

    @Query(value="select max(balance) from person ",nativeQuery = true)
    Long personMaxBalance();

    @Query(value="select avg(balance) from person ",nativeQuery = true)
    Double personAvgBalance();

    @Query(value="select sum(balance) from person ",nativeQuery = true)
    Long personSumBalance();

    @Query(value="select balance from person  group by balance ",nativeQuery = true)
    List<Double> personGroupBalance();
//
//    @Query(value="select max(total),country  from (select sum(balance) as total from person  group by country) ",nativeQuery = true)
//    PersonDto personMaxSumBalance();

    @Query(value="select max(balance) as total ,country  from  person  group by country order by total desc limit 1",nativeQuery = true)
    PersonDto personMaxSumBalance();
}


// orrder by,max,min,avr,su,group balance sonra en boyuk balans cemi tap