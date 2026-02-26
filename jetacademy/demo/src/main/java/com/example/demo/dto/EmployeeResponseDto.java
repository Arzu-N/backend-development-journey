package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class EmployeeResponseDto {
    private Long id;
    private String firstname;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DepartamentResponseDto> departaments;

    public EmployeeResponseDto(Long id, String firstname,List<DepartamentResponseDto> departaments) {
        this.id=id;
        this.firstname=firstname;
        this.departaments=departaments;
    }
    public EmployeeResponseDto( String firstname) {

        this.firstname=firstname;
    }
    public EmployeeResponseDto( Long id,String firstname) {
this.id=id;
        this.firstname=firstname;
    }
}
