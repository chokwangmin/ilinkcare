package com.example.ilinkcare.mapper;

import com.example.ilinkcare.domain.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    // 고객 회원가입
    String insertMember(Member member);

    void updateMember(Member member);

    int dupUserId(Member member);

}
