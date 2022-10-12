package com.example.ilinkcare.service;

import com.example.ilinkcare.domain.CommentDto;
import com.example.ilinkcare.domain.Teacher;
import com.example.ilinkcare.domain.Wishlist;

import java.util.List;
import java.util.Map;

public interface TeacherService {

    List<Teacher> getTeacherList(Map<String, Object> param);

    int getTeacherListCount(Map<String, Object> param);

    Teacher getTeacher(int teacher_no);

    List<CommentDto> GetReview(int teacher_no);

    void joinTeacher(Teacher teacher);

    // 관심등록
    int registWishList(Map<String, Object> param);

    // 타겟 관심등록 개수 조회.
    int selectWishListTeacherCnt(Map<String, Object> param);

    // 관심등록 전체개수 조회.
    int selectWishListTeacherAllCnt(Map<String, Object> param);

    List<Teacher> selectWishList(Map<String, Object> param);

}



