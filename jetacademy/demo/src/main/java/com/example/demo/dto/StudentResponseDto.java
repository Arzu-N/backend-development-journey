package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonPropertyOrder({ "id", "firstname", "courses" })
public class StudentResponseDto {
    private  Long id;
    private  String firstname;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private  List<CourseResponseDto>courses;

    public StudentResponseDto(Long id,String firstname){
        this.id=id;
        this.firstname=firstname;
    }
}
