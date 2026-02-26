package com.example.education.controller;

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
}

 */
/*
@RestController
@RequestMapping("/students")
public class StudentController_mapstruct {
    private final Studentrepodata datarepo;
    private final Customstudentrepo studentrepo;
    public StudentController_mapstruct(Studentrepodata datarepo, Customstudentrepo studentrepo) {
        this.datarepo=datarepo;
        this.studentrepo=studentrepo;
    }
   /*@GetMapping
   public List<Student>getlist(){
        return datarepo.findAll();
   }*/
  /*  @GetMapping
    public CommonDTO getlist(@RequestParam(required=false)String name, @RequestParam(required=false)String surname, @RequestParam(required=false)String email, @RequestParam(required=false)Integer age, @RequestParam(required=false,name="university_id")Integer universityid){
       return new CommonDTO().setObj((studentrepo.getlist(name, surname, email, age, universityid))
               .stream()
               .map(StudentMapper.MAPPER::tostudentdto)
               .collect(Collectors.toList())).setDatetime(LocalDateTime.now());

    }

   @PostMapping
   public CommonDTO insert(@RequestBody StudentDTO studentdto){
        datarepo.save(StudentMapper.MAPPER.toentitystudent(studentdto));
        return new CommonDTO().setDatetime(LocalDateTime.now()).setMessage("succsesfully inserted");
    //   studentrepo.insert(student);
   }
    @PutMapping
    public CommonDTO update(@RequestBody StudentDTO studentdto){
        datarepo.save(StudentMapper.MAPPER.toentitystudent(studentdto));
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
            return new CommonDTO().setObj(datarepo.findById(id).map(StudentMapper.MAPPER::tostudentdto).orElse(new StudentDTO())).setMessage("succesfully fetched").setDatetime(LocalDateTime.now());
        }
   @GetMapping("{id}/universities/{universityid}")
    public University findbyiduniversity(@PathVariable("id") Integer id, @PathVariable("universityid") Integer universityid){
      return  datarepo.findById(id).get().getUniversity();
   }
   }
*/