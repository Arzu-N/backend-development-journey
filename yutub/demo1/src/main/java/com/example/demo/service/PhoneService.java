package com.example.demo.service;

import com.example.demo.dao.entity.Phone;
import com.example.demo.dao.entity.UserEntity;
import com.example.demo.dao.repository.PhoneRepository;
import com.example.demo.dto.PhoneDto;
import com.example.demo.mapper.Mapper;
import com.example.demo.util.enums.OS;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Data
public class PhoneService {
    private final PhoneRepository repo;
    public void addPhone( PhoneDto dto){
        repo.save(new Phone(dto.getOs(),dto.getModel(),dto.getMarka(), dto.getPrice()));
    }

    public String addPhone1( PhoneDto dto){
        if(dto.getOs().equals(OS.ANDROID)&&dto.getPrice()>2000)
            return "sehv format";
        repo.save(new Phone(dto.getOs(),dto.getModel(),dto.getMarka(), dto.getPrice()));
        return "data elave olundu";
    }

    public void addPhonel( List<PhoneDto> dto){
        repo.saveAll(dto.stream().map(l->new Phone(l.getOs(),l.getModel(),l.getMarka(), l.getPrice())).toList());
    }

    public List<PhoneDto> getPhone(){
        List<Phone> all = repo.findAll();
       return repo.findPhonesByDeleted(false).stream().map(l->new PhoneDto(l.getModel(), l.getOs(),l.getMarka(), l.getPrice())).toList();
    }
    public List<PhoneDto> getPhonePrice(){
        List<Phone> all = repo.findAll();
return all.stream().filter(l->l.getPrice()>=100&&l.getPrice()<=1000).map(l->new PhoneDto(l.getModel(), l.getOs(),l.getMarka(), l.getPrice())).toList();    }

    public List<PhoneDto> getOs(){
        List<Phone> all = repo.findAll();
        return all.stream().filter(l->l.getOs().equals(OS.ANDROID)).map(l->new PhoneDto(l.getModel(), l.getOs(),l.getMarka(), l.getPrice())).toList();    }

    public void deletePhone(Long id){
            Optional<Phone> phone = repo.findById(id);

            phone.ifPresent(u->u.setDeleted(true));
            repo.save(phone.get());
        }
    public void deletePhone1(Long id){
        Optional<Phone> phone = repo.findById(id);

        if(phone.get().getPrice()<=2000){
        phone.ifPresent(u->u.setDeleted(true));
        repo.save(phone.get());
    }}

    public void updateOs(){

            List<Phone> updated = repo.findAll().stream()
                    .filter(p -> p.getPrice() >= 2000)
                    .map(p -> {
                        p.setOs(OS.ANDROID);
                        return p;
                    })
                    .toList();

            repo.saveAll(updated);
        }

    }


