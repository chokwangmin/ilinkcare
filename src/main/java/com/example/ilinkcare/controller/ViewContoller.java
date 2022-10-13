package com.example.ilinkcare.controller;

import com.example.ilinkcare.mapper.ChildMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewContoller {

    @Autowired
    ChildMapper childMapper;
    /*메인페이지*/

    /*아이정보*/
//    @GetMapping("/childinfo")
//    public String childinfo(){
//
//        return "childinfo";
//    }
    /*회원가입*/
    @GetMapping("/join")
    public String join(){

        return "join";
    }
    /*로그인*/
    @GetMapping("/login")
    public String login(Model model, @RequestParam(value = "resultMsg", required = false) String resultMsg){
        model.addAttribute("resultMsg", resultMsg);

        return "login";
    }
    /*마이페이지*/
    @GetMapping("/mypage")
    public String mypage(){

        return "mypage";
    }
    /* 교육(교사신청)*/
    @GetMapping("/order")
    public String Order(){

        return "order";
    }



    /*프로필*/
    @GetMapping("/profile")
    public String ProfileView(){

        return "profileview";
    }

    @GetMapping("/profileview") //localhost:8088/api/child
    public String read(Model model){

//        model.addAttribute("childList", childMapper.findAll());
        return "profileview";
    }

//    @GetMapping("/memberupdate")
//    public String MemberUpdate(){
//
//        return "memberupdate";
//    }

}
