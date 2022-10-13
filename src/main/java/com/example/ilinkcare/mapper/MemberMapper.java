package com.example.ilinkcare.mapper;

import com.example.ilinkcare.domain.Member;
import com.example.ilinkcare.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface MemberMapper {
    // 고객 회원가입
    int insertMember(Member member);

    void updateMember(Member member);

    int dupUserId(Member member);
    
    User findByUsername(Map<String, Object> param);

    Member MemberSelect(Map<String, Object> param);
}
