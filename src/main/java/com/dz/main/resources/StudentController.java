package com.dz.main.resources;

import com.codahale.metrics.annotation.Timed;
import com.dz.main.api.Student;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Path("/student")
@Produces(MediaType.APPLICATION_JSON)
@Timed
public class StudentController {

    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    public StudentController(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }
    @Path("/getName")
    @GET
    public String getName(){
        return "Puru";
    }
    @Path("/getAll")
    @GET
    public List<Student> getAllStudent(){
        Student student = new Student();
        student.setDob(121232313333L);
        student.setEmail("puuru@gmail.com");
        student.setFirstName("puru");
        student.setMarks("456");
        List<Student> list = new ArrayList<>();
        list.add(student);
        return list;
    }
}
