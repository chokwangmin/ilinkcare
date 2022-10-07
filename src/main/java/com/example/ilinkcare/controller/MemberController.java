package com.example.ilinkcare.controller;

import com.example.ilinkcare.domain.Member;
import com.example.ilinkcare.service.MemberService;
import com.example.ilinkcare.service.MemberServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/member")
@Controller
public class MemberController {

    @Autowired
    private MemberServiceImp memberService;

    @PostMapping("/join")
    public String MemberJoin(Member member){
        String RtnVal = "";
        RtnVal = memberService.MemberJoin(member);

        return "redirect:/login";
    }

    @PutMapping("/update")
    public String MemberUpdate(Member member){

        memberService.MemberUpdate(member);

        return "";
    }

}
