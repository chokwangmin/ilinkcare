package com.example.ilinkcare.service;

import com.example.ilinkcare.domain.Member;

import java.util.Map;

public interface MemberService {

    String MemberJoin(Member member);

    String MemberUpdate(Member member);

    Member MemberSelect(Map<String, Object> param);
}
