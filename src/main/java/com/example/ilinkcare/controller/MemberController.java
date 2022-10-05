package com.example.ilinkcare.controller;

import com.example.ilinkcare.domain.Member;
import com.example.ilinkcare.service.MemberService;
import com.example.ilinkcare.service.MemberServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping
@Controller
public class MemberController {

    @Autowired
    private MemberServiceImp memberService;

    @PostMapping("/join")
    public String MemberJoin(Member member){

        memberService.MemberJoin(member);

        return "join";
    }

}
