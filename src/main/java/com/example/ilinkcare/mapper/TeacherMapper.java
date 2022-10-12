package com.example.ilinkcare.mapper;


import com.example.ilinkcare.domain.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TeacherMapper {

    // 교사가입
    void insertTeacher(Teacher teacher);

    List<Teacher> findAllTeacher(Map<String, Object> param);

    int findAllTeacherCount(Map<String, Object> param);
//    List<Teacher> findAllTeacher();

    Teacher selectTeacher(int teacher_no);

    List<CommentDto> selectReview(int teacher_no);

    // 관심교사 등록
    void insertWishlist(Wishlist wishlist);

    int registInterest(Map<String, Object> param);

    int selectInterestTeacherCnt(Map<String, Object> param);

}
