package com.example.ilinkcare.mapper;


import com.example.ilinkcare.domain.Child;
import com.example.ilinkcare.domain.CommentDto;
import com.example.ilinkcare.domain.Review;
import com.example.ilinkcare.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper {

    // 교사가입
    void insertTeacher(Teacher teacher);

    List<Teacher> findAllTeacher();

    Teacher selectTeacher(int teacher_no);


    List<CommentDto> selectReview(int teacher_no);

    // 교사사입

}
