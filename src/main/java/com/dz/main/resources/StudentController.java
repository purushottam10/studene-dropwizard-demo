package com.dz.main.resources;

import com.dz.main.api.Student;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/student")
@Produces(MediaType.APPLICATION_JSON)

public class StudentController {
    @Path("/getAll")
    @GET
    public List<Student> getAllStudent(){
        Student student = new Student();

        return null;
    }
}
