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

    //List<Teacher> GetTeachersByRegion( );

    void CreateWishlist(Wishlist wishlist);

    int registInterest(Map<String, Object> param);

    int selectInterestTeacherCnt(Map<String, Object> param);

    int selectInterestTeacherAllCnt(Map<String, Object> param);

}



