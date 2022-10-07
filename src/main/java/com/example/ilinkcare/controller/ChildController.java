package com.example.ilinkcare.controller;

import com.example.ilinkcare.domain.Child;
import com.example.ilinkcare.mapper.ChildMapper;
import com.example.ilinkcare.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@Controller
public class ChildController {

    @Autowired
    private ChildService childService;

    @PostMapping("/childinfo") //localhost:8088/api/child/post
    public String ChildCreate(@RequestBody Child child){
        // 마이바티스가 아니고 insert
//        childMapper.insertBaby(child);
        // 마이바티스 연동해서 insert
        childService.ChildCreate(child);

        return "";

    }
//    @GetMapping("/api/child") //localhost:8088/api/child
//    public List<Child> read(){
//        List<Child> child = childService.findAll();
//
//        return child;
//
//    }

//    @GetMapping("/api/child/{child_no}")  //localhost:8088/api/child/5
//    public Child read(@PathVariable int child_no){
//        System.out.println("여기로 들어왔슴abc");
//        Child child = childService.ChildCreate(child_no);
//
//        System.out.println("내이름은abcabc: " + child.getName());
//
//        return child;
//
//    }
}
