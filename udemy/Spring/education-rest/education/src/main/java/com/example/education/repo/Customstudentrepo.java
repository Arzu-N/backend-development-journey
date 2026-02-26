package com.example.education.repo;
import com.example.education.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/*public class Studentrepo implements Istudentrepo {
   private final EntityManager em;
   public Studentrepo(EntityManager em) {
       this.em = em;
   }
    public  List<Student> getlist() {
        List <Student>resultList = em.createNativeQuery("select * from student", Student.class).getResultList();
        return resultList;
    }
    public void insert(Student obj) {

    }

    public void update(Student obj) {

    }

    public void delete(Integer id) {

    }

    public Student findbiyid(int id) {
return null;
    }
  public List<Student>getlist(String name,String surname,String email,Integer age,String university,String password){
        return null;
       }}*/
/*
@Repository
public class Studentrepo implements Istudentrepo{
    @Autowired     //field injection
    private  EntityManager em;
  /*  public Studentrepo setEm(EntityManager em) { setter injectio
        this.em = em;
        return this;
    }*/
/*
    public  List<Student> getlist() {
        List <Student>resultList = em.createQuery("select s from Mystudent s",Student.class).getResultList();
        return resultList;
    }

    @Override
    public void insert(Student obj) {

    }

    @Override
    public void update(Student obj) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Student findbiyid(int id) {
        return null;
    }

    @Override
    public List<Student> getlist(String name, String surname, String email, Integer age, String university, String password) {
        return List.of();
    }
*/
@Repository
@Primary
public class Customstudentrepo implements Istudentrepo{


   public Customstudentrepo() {
       System.out.println("hello");
   }
   @PersistenceContext
      EntityManager em;

   @Override
    public  List<Student> getlist() {
       System.out.println("hello");
        List <Student>resultList = em.createQuery("select s from Mystudent s",Student.class).getResultList();
        return resultList;
    }
    @Override
@Transactional(timeout=3000,readOnly=true)
    public void insert(Student obj) {
em.persist(obj);
// tx,orm,jdbc  library
    }
    @Override
    public void update(Student obj) {

    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
              final Student s = em.find(Student.class, id);
              if(s!=null){
        em.remove(s);}
           }
    @Override
    public Student findbiyid(int id) {
        return null;
    }

    @Override
    public List<Student> getlist(String name, String surname, String email, Integer age, Integer universityid) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);
        Root<Student> root = cq.from(Student.class);
        List<Predicate>predicates=new ArrayList<>();
        if(name!=null&&!(name.isEmpty())){
            predicates.add(cb.like(root.get("name"),"%"+name+"%"));
        }
        if(surname!=null&&!(surname.isEmpty())){
            predicates.add(cb.like(root.get("surname"),"%"+surname+"%"));
        }
        if(email!=null&&!(email.isEmpty())){
            predicates.add(cb.like(root.get("email"),"%"+email+"%"));
        }
        if(age!=null){
            predicates.add(cb.equal(root.get("age"),age));
        }
        if(universityid!=null){
            predicates.add(cb.equal(root.get("university").get("id"),universityid));
        }
        Predicate array =cb.and(predicates.toArray(new Predicate[0]));
         cq.where(array);
       cq.select(root);
        TypedQuery<Student> query = em.createQuery(cq);
        List<Student> resultList = query.getResultList();
        return resultList;
    }
    public List<Student>findentity(){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);
        Root<Student> root = cq.from(Student.class);
        cq.select(root).where(cb.gt(root.get("age"),23));
        return em.createQuery(cq).getResultList();  // yasi 23den boyuk olan studentler
    }
    public List<Student>findbyemailandpassword(String email,String password){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);
        Root<Student> root = cq.from(Student.class);
        List<Predicate>predicates=new ArrayList<>();
        predicates.add(cb.like(root.get("email"),"%"+email+"%"));
        predicates.add(cb.like(root.get("password"),"%"+password+"%"));
        cq.where(predicates.toArray(new Predicate[0]));
        cq.select(root).where(cb.equal(root.get("password"),password));
        TypedQuery<Student> query = em.createQuery(cq);
        List<Student> resultList = query.getResultList();

        return resultList;
    }
    public Integer geti(){
       return null;
    }
    public String test(){
        Integer i=geti();
        System.out.println("heyva");
       return i.toString();
    }


}


