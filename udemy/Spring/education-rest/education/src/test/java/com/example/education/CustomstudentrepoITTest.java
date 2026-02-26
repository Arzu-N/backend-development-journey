package com.example.education;

import com.example.education.entity.Student;
import com.example.education.repo.Customstudentrepo;
import com.example.education.repo.Istudentrepo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)

public class CustomstudentrepoITTest {

    @Autowired
    Istudentrepo repo;
    @Before
    public void before(){

    }
    @Test
    public void getlistTest(){
        List<Student> getlist = repo.getlist(null,null,null,null,null);
        Assert.assertEquals("must be 22",22,getlist.size());
        System.out.println("list "+getlist);

    }
}
