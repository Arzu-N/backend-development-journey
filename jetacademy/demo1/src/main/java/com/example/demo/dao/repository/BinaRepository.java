package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Bina;
import com.example.demo.dto.BinaDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BinaRepository extends JpaRepository<Bina,Long>{
    @Query(value = "select bina_adi,mertebe,has_lift,masa_sayi,stul_sayi from bina left join room on bina.id=room.bina_id where bina.deleted=false",nativeQuery = true)
    List<BinaDto>findBina();

}
