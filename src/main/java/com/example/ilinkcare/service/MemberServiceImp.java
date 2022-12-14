package com.example.ilinkcare.service;

import com.example.ilinkcare.domain.Member;
import com.example.ilinkcare.domain.MemberSecurity;
import com.example.ilinkcare.domain.User;
import com.example.ilinkcare.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MemberServiceImp implements MemberService, UserDetailsService {
    @Autowired
    private MemberMapper memberMapper;

    public String MemberJoin(Member member){
        String rtnVal = "";

        String Password = member.getPassword();
        Password = new BCryptPasswordEncoder().encode(Password);
        member.setPassword(Password);

        // 회원가입 중복 체크 필요
        int dupCnt = memberMapper.dupUserId(member);
        if(dupCnt > 0)
        {
            // 아이디 중복있음
             rtnVal = "회원가입 아이디가 중복되었습니다";
             return rtnVal;
        }

        int result = memberMapper.insertMember(member);
        if (result > 0) {
            rtnVal = "회원가입이 완료되었습니다.";
        } else {
            rtnVal = "회원가입 도중 오류가 발생하였습니다.";
        }

        return rtnVal;
    }

    @Override
    public String MemberUpdate(Member member) {
        String Password = member.getPassword();
        Password = new BCryptPasswordEncoder().encode(Password);
        member.setPassword(Password);

        int result = memberMapper.updateMember(member);
        String msg = "";

        if (result > 0) {
            msg = "회원정보가 수정되었습니다.";
        } else {
            msg = "회원정보가 수정이 실패하였습니다.";
        }
        return msg;

    }

    public Member MemberSelect(Map<String, Object> param){
        return memberMapper.MemberSelect(param);
    }

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("userId", userId);
        //System.out.println(new BCryptPasswordEncoder().encode("1234"));
        User user = memberMapper.findByUsername(param);
        if (user == null) {
            throw new UsernameNotFoundException("해당 사용자를 찾을수 없습니다.:" + userId);
        }
        return new MemberSecurity(user);
    }
}
