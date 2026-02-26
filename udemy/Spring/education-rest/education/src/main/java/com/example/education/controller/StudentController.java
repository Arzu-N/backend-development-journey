package com.example.education.controller;

import com.example.education.CommonDTO.CommonDTO;
import com.example.education.DTO.StudentDTO;
import com.example.education.DTO.UniversityDTO;
import com.example.education.entity.Student;
import com.example.education.entity.University;
import com.example.education.repo.Customstudentrepo;
import com.example.education.repo.Studentrepodata;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.stream.Collectors;
/*public class StudentController {

  private final ApplicationContext context;
    public StudentController( ApplicationContext context) {

        this.context=context;
    }
    @RequestMapping(method=RequestMethod.GET)
    public List<Student> getlist(){
        Studentrepo repo =( Studentrepo)context.getBean("studentrepo");
        return repo.getlist();
    }
}*/
       @RestController
@RequestMapping("/students")
public class StudentController {
    private final Studentrepodata datarepo;
    private final Customstudentrepo studentrepo;
    public StudentController(Studentrepodata datarepo, Customstudentrepo studentrepo) {
        this.datarepo=datarepo;
        this.studentrepo=studentrepo;
    }
 /*  @GetMapping
   public List<Student>getlist(){
        return datarepo.findAll();
   }*/
    @GetMapping
   // @CrossOrigin(origins="http://localhost:63342/")
    public CommonDTO getlist(@RequestParam(required=false)String name, @RequestParam(required=false)String surname, @RequestParam(required=false)String email, @RequestParam(required=false)Integer age, @RequestParam(required=false,name="university_id")Integer universityid){
       return new CommonDTO().setObj((studentrepo.getlist(name, surname, email, age, universityid))
               .stream()
               .map(StudentController::tostudentdto)
               .collect(Collectors.toList())).setDatetime(LocalDateTime.now());

    }

   @PostMapping
 //  @CrossOrigin(origins="http://localhost:63342/")
   public CommonDTO insert(@RequestBody StudentDTO studentdto){
        datarepo.save(toentitystudent(studentdto));
        return new CommonDTO().setDatetime(LocalDateTime.now()).setMessage("succsesfully inserted");
    //   studentrepo.insert(student);
   }
    @PutMapping
    public CommonDTO update(@RequestBody StudentDTO studentdto){
        datarepo.save(toentitystudent(studentdto));
        return new CommonDTO().setDatetime(LocalDateTime.now()).setMessage("succesfully updated");
        //   studentrepo.insert(student);
    }
   @DeleteMapping
    public CommonDTO delete(@RequestParam Integer id){
        datarepo.deleteById(id);
        return new CommonDTO().setDatetime(LocalDateTime.now()).setMessage("succesfully deleted");
        //studentrepo.deleteById(id);
   }
    @GetMapping("{id}")
    public CommonDTO findbyid(@PathVariable("id") Integer id){
            return new CommonDTO().setObj(datarepo.findById(id).map(StudentController::tostudentdto).orElse(new StudentDTO())).setMessage("succesfully fetched").setDatetime(LocalDateTime.now());
        }
   @GetMapping("{id}/universities/{universityid}")
    public University findbyiduniversity(@PathVariable("id") Integer id, @PathVariable("universityid") Integer universityid){
      return  datarepo.findById(id).get().getUniversity();
   }
    private static StudentDTO tostudentdto(Student entitystudent){
        return  new StudentDTO()
                .setId(entitystudent.getId())
                .setName(entitystudent.getName())
                .setSurname(entitystudent.getSurname())
                .setEmail(entitystudent.getEmail())
                .setAge(entitystudent.getAge())
                .setUniversity(
                        new UniversityDTO()
                                .setId(entitystudent.getUniversity().getId())
                                .setName(entitystudent.getUniversity().getName())
                );
    }
    private static Student toentitystudent(StudentDTO studentdto){
        return  new Student()
                .setId(studentdto.getId())
                .setName(studentdto.getName())
                .setSurname(studentdto.getSurname())
                .setEmail(studentdto.getEmail())
                .setAge(studentdto.getAge())
                .setUniversity(
                        new University()
                                .setId(studentdto.getUniversity().getId())
                                .setName(studentdto.getUniversity().getName())
                );
    }
}
