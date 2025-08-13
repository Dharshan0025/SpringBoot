package com.example.HelloWorld.StudentManagement;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/student")
public class StudentController {
    StudentService service;
    StudentController(StudentService service){
        this.service=service;
    }
    @PostMapping("/create")
    public String create(@RequestParam int id, @RequestParam String name,@RequestParam String course){
        return service.addStudent(id,name,course);
    }
    @GetMapping("/getAllStu")
    public ArrayList<Student> getAllStudents(){
        return service.get();
    }
    @GetMapping("/getById/{id}")
    public Student getStuBYId(@PathVariable int id){
        return service.getDetailsByID(id);
    }
    @PutMapping("/updateby/{id}")
    public String update(@PathVariable int id,@RequestParam String name,@RequestParam String course){
        return service.updateStudent(id,name,course);
    }
    @DeleteMapping("/deleteby/{id}")
    public String Delete(@PathVariable int id){
        return service.deleteStudent(id);
    }

}
