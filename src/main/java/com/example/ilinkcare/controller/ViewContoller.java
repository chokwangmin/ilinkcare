package com.example.ilinkcare.controller;

import com.example.ilinkcare.mapper.ChildMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewContoller {

    @Autowired
    ChildMapper childMapper;
    /*메인페이지*/

    /*아이정보*/
    @GetMapping("/childinfo")
    public String childinfo(){

        return "childinfo";
    }
    /*회원가입*/
    @GetMapping("/join")
    public String join(){

        return "join";
    }
    /*로그인*/
    @GetMapping("/login")
    public String login(){

        return "login";
    }
    /*마이페이지*/
    @GetMapping("/mypage")
    public String mypage(){

        return "mypage";
    }

    /*프로필*/
    @GetMapping("/profil")
    public String ProfilView(){

        return "profilview";
    }

    @GetMapping("/profilview") //localhost:8088/api/child
    public String read(Model model){

        model.addAttribute("childList", childMapper.findAll());
        return "profilview";
    }

    @GetMapping("/review")
    public String review(){

        return "review";
    }


    @GetMapping("/userupdate")
    public String UserUpdate(){

        return "userupdate";
    }

    @GetMapping("/wishlist")
    public String WishList(){

        return "wishlist";
    }


}
