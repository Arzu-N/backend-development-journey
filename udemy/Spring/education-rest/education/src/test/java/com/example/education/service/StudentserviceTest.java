package com.example.education.service;

import com.example.education.entity.Student;
import com.example.education.entity.University;
import com.example.education.repo.Customstudentrepo;
import com.example.education.repo.Istudentrepo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.*;
import org.springframework.boot.test.context.SpringBootTest;



import java.util.ArrayList;
import java.util.List;
@SpringBootTest
public class StudentserviceTest {
  @Spy
    Customstudentrepo studentrepo;
    @InjectMocks
    Studentservice studentservice;
    @BeforeClass
    public static void setup(){
        System.out.println("setup called");
    }

    @Before
    public  void before(){
        System.out.println("before called");
        MockitoAnnotations.openMocks(this);
        ArrayList list = new ArrayList();
        Student student = new Student();
        student.setName("test");
        student.setSurname("test");
        student.setEmail("test@gmail.com");
        student.setAge(22);
        student.setUniversity(new University().setId(1));
        list.add(student);
      //  Mockito.doReturn("kitab").when(studentrepo).test();
        Mockito.doReturn(1).when(studentrepo).geti();
Mockito.when(studentrepo.getlist(null,null,null,null,null)).thenReturn(list);
      Mockito.when(studentrepo.getlist("test", "test", "test@gmail.com", 22, 1)).thenReturn(list);
   Mockito.when(studentrepo.findbyemailandpassword(null,null)).thenReturn(null);


        //Mockito.when(studentrepo.test("test", "test", "test@gmail.com", 22, 1)).thenReturn(list);

    }

   /* @Test
public void givennullthentestgetlist(){

        List<Student>getlist = studentservice.getlist(null, null, null, null, null);
        Assert.assertEquals("user size must be 1",1,getlist.size());
        Mockito.verify(studentrepo,Mockito.atLeastOnce()).getlist(null,null,null,null,null);

    }

@Test
public void givennullthentestgetlist(){

    System.out.println(studentrepo.test());

}*/

  @Test
public void givenallparamthenfiltergetlist(){

        List<Student> getlist = studentservice.getlist("test", "test", "test@gmail.com", 22, 1);
        Assert.assertTrue("list size must be grater than 0",getlist.size()>0);
        Student student = getlist.get(0);
        Assert.assertEquals("name wrong","test",student.getName());
        Assert.assertEquals("surname wrong","test",student.getSurname());
Assert.assertEquals("age wrong",22L,(long)student.getAge());
        Mockito.verify(studentrepo,Mockito.atLeastOnce()).getlist("test", "test", "test@gmail.com", 22, 1);
    }
    @Test
    public void testfindbyemailandpassword(){

        List<Student> findbyemailandpassword = studentservice.findbyemailandpassword(null, null);
        Assert.assertNull("list must be null",findbyemailandpassword);
        Mockito.verify(studentrepo,Mockito.atLeastOnce()).findbyemailandpassword(null,null);
    }

}
