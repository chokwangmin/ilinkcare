package com.example.ilinkcare.service;

import com.example.ilinkcare.domain.Teacher;
import com.example.ilinkcare.domain.CommentDto;
import com.example.ilinkcare.domain.Wishlist;
import com.example.ilinkcare.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TeacherServiceImp implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;


    // 교사전체 리스트 가져오기
    public List<Teacher> getTeacherList(Map<String, Object> param){
        return teacherMapper.findAllTeacher(param);
    }

    @Override
    public int getTeacherListCount(Map<String, Object> param) {
        return teacherMapper.findAllTeacherCount(param);
    }

    //교사 찾기
    public Teacher getTeacher(int teacher_no){
        return teacherMapper.selectTeacher(teacher_no);
    }

    // 교사리뷰

    public List<CommentDto> GetReview(int teacher_no){
        return teacherMapper.selectReview(teacher_no);


    }

    /**
     * 교사가입
     * @param teacher
     */
    public void joinTeacher(Teacher teacher){
        teacherMapper.insertTeacher(teacher);
    }


    // 교사 검색 가져오기

    // 등록된 교사 리스트

    //관심교사 등록

    public void CreateWishlist(Wishlist wishlist){
        teacherMapper.insertWishlist(wishlist);

    }

    @Override
    public int registInterest(Map<String, Object> param) {
        return teacherMapper.registInterest(param);
    }

    @Override
    public int selectInterestTeacherCnt(Map<String, Object> param) {
        return teacherMapper.selectInterestTeacherCnt(param);
    }

    @Override
    public int selectInterestTeacherAllCnt(Map<String, Object> param) {
        return teacherMapper.selectInterestTeacherAllCnt(param);
    }
}
