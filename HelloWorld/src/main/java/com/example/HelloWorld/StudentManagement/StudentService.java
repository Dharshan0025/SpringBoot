package com.example.HelloWorld.StudentManagement;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {

     ArrayList<Student>list=new ArrayList<>();

     public String addStudent(int id,String name,String course){
       list.add(new Student(id,name,course));
       return "Student added Successfully";
     }
     public ArrayList<Student> get(){
         return list;
     }
     public Student getDetailsByID(int id){
         for(int i=0;i<list.size();i++){
             if(list.get(i).getId()==id){
                 return list.get(i);
             }
         }
         return null;
     }
     public String updateStudent(int id,String name,String course){
         for(int i=0;i<list.size();i++){
             if(list.get(i).getId()==id){
                 list.get(i).setName(name);
                 list.get(i).setCourse(course);
                 break;
             }
         }
         return "student details updated successfully";
     }
     public String deleteStudent(int id){
         for(int i=0;i<list.size();i++){
             if(list.get(i).getId()==id){
                 list.remove(i);
                 break;
             }
         }
         return "student details deleted successfully";
     }

}
