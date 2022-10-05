package com.example.ilinkcare.service;

import com.example.ilinkcare.domain.Member;
import com.example.ilinkcare.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImp implements MemberService{


    @Autowired
    private MemberMapper memberMapper;

    public void MemberJoin(Member member){
        memberMapper.insertMember(member);
    }


}
