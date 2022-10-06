package com.example.ilinkcare.controller;

import com.example.ilinkcare.domain.Child;
import com.example.ilinkcare.domain.Teacher;
import com.example.ilinkcare.mapper.ChildMapper;
import com.example.ilinkcare.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//
//@RestController
//public class RestContoller {
////    @Autowired
////    ChildMapper childMapper;
//
//    @Autowired
//    TeacherMapper teacherMapper;
//
////    @PostMapping("/api/child") //localhost:8088/api/child/post
////    public Child create(@RequestBody Child child){
////        // 마이바티스가 아니고 insert
////        childMapper.insert(child);
////        // 마이바티스 연동해서 insert
////        childMapper.insertBaby(child);
////
////        return child;
////
////    }
////    @GetMapping("/api/child") //localhost:8088/api/child
////    public List<Child> read(){
////       List<Child> child = childMapper.findAll();
////
////       return child;
////
////    }
////
////    @GetMapping("/api/child/{child_no}")  //localhost:8088/api/child/5
////    public Child read(@PathVariable int child_no){
////        System.out.println("여기로 들어왔슴abc");
////        Child child = childMapper.selectChild(child_no);
////
////        System.out.println("내이름은abcabc: " + child.getName());
////
////        return child;
////
////    }
//
//    //교사계정 생성
//    @PostMapping("/api/teacher") //localhost:8088/api/teacher/post
//    public Teacher create(@RequestBody Teacher teacher){
//        teacherMapper.insertTeacher(teacher);
//
//        return teacher;
//
//    }
//
//    @GetMapping("/api/teacher") //localhost:8088/api/teacher
//    public  List<Teacher> teacherRead(){
//        List<Teacher> teacher = teacherMapper.findAllTeacher();
//
//        return teacher;
//
//    }
//
//    @GetMapping("/api/teacher/{teacher_no}")  //localhost:8088/api/teacher/2
//    public Teacher teacherRead(@PathVariable int teacher_no){
//
//        Teacher teacher = teacherMapper.selectTeacher(teacher_no);
//
//        return teacher;
//
//    }
//
//}
