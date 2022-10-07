package com.example.ilinkcare.service;

import com.example.ilinkcare.domain.Member;
import com.example.ilinkcare.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImp implements MemberService{


    @Autowired
    private MemberMapper memberMapper;

    public String MemberJoin(Member member){
        String rtnVal = "";
        // 회원가입 중복 체크 필요
        int dupCnt = memberMapper.dupUserId(member);
        if(dupCnt > 0)
        {
            // 아이디 중복있음
             rtnVal = "회원가입 아이디가 중복되었습니다";
             return rtnVal;
        }

        memberMapper.insertMember(member);

        return rtnVal;
    }

    public void MemberUpdate(Member member){
        memberMapper.updateMember(member);
    }


}
