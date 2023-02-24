package com.example.myspringworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "docker", "mahesh"),
                new Course(2, "java", "archana"),
                new Course(3, "selenium", "manish")
        );
    }
}
