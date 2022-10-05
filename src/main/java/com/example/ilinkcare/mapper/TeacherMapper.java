package com.example.ilinkcare.mapper;


import com.example.ilinkcare.domain.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper {

    // 교사가입
    void insertTeacher(Teacher teacher);

    List<Teacher> findAllTeacher();

    Teacher selectTeacher(int teacher_no);


    List<CommentDto> selectReview(int teacher_no);

    // 관심교사 등록
    void insertWishlist(Wishlist wishlist);


}
