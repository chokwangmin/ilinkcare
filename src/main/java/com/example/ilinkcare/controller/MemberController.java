package com.example.ilinkcare.controller;

import com.example.ilinkcare.domain.Member;
import com.example.ilinkcare.domain.MemberSecurity;
import com.example.ilinkcare.service.MemberService;
import com.example.ilinkcare.service.MemberServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.Map;


@RequestMapping("/member")
@Controller
public class MemberController {

    @Autowired
    private MemberServiceImp memberService;

    @PostMapping("/join")
    public String MemberJoin(RedirectAttributes redirectAttributes, Member member){
        String RtnVal = "";
        RtnVal = memberService.MemberJoin(member);
        redirectAttributes.addAttribute("resultMsg", RtnVal);

        return "redirect:/login";
    }
    @GetMapping("/update")
    public String MemberUpdate(Model model , Authentication authentication){

        String msg = "";

        try {
            MemberSecurity userDetails = (MemberSecurity) authentication.getPrincipal();

            Map<String, Object> param = new HashMap<String, Object>();
            param.put("userid", userDetails.getUserId());

            Member member = memberService.MemberSelect(param);
            model.addAttribute("update", member );

        } catch (Exception e) {
            msg = "오류가 발생하였습니다.";
        }

        return "memberupdate";
    }
    @PostMapping("/update")
    public String MemberUpdates(Member member){

        memberService.MemberUpdate(member);

        return "mypage";
    }

}
