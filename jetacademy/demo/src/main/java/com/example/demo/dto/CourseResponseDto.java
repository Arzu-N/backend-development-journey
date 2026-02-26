package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonPropertyOrder({ "id", "courseName" })
public class CourseResponseDto {
    private  Long id;
    private  String courseName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
private List<StudentResponseDto>students;
public CourseResponseDto(Long id,String courseName){
    this.id=id;
    this.courseName=courseName;
}
}
