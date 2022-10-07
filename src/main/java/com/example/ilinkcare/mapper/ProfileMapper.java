package com.example.ilinkcare.mapper;

import com.example.ilinkcare.domain.Criteria;
import com.example.ilinkcare.domain.Teacher;
import com.example.ilinkcare.domain.profile;

import java.util.List;

public interface ProfileMapper {


    List<Teacher> findAllTeacher(Criteria cri);

}
