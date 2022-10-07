package com.example.ilinkcare.service;

import com.example.ilinkcare.domain.Member;
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

    public void MemberJoin(Member member){
        memberMapper.insertMember(member);
    }

    public void MemberUpdate(Member member){
        memberMapper.updateMember(member);
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
        return new Member(user);
    }
}
