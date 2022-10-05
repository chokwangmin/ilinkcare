package com.example.ilinkcare.service;

import com.example.ilinkcare.domain.CommentDto;
import com.example.ilinkcare.domain.Teacher;
import com.example.ilinkcare.domain.Wishlist;

import java.util.List;

public interface TeacherService {

    List<Teacher> getTeacherList();

    Teacher getTeacher(int teacher_no);

    List<CommentDto> GetReview(int teacher_no);

    void joinTeacher(Teacher teacher);

    //List<Teacher> GetTeachersByRegion( );

    void CreateWishlist(Wishlist wishlist);
}



