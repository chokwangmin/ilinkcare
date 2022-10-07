package com.example.ilinkcare.mapper;

import com.example.ilinkcare.domain.Child;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface ChildMapper {

    // mybatis 사용하지 않고 스프링 어노테이션을 이용해서 .xml 안쓰고 쿼리사용할 수 있도록 작성
    @Insert("INSERT into child(user_no, name, birth, gender, created_dt, created_by,update_dt,update_by) values (#{user_no}, #{name}, #{birth}, #{gender}, #{created_dt}, #{created_by},#{update_dt},#{update_by})")
    @Options(useGeneratedKeys = true,keyProperty = "child_no")
    void insertBaby(Child child);

    // 아래 mapper 쿼리는 mybatis 연동해서 조회.
    //@Select("SELECT * FROM child")
    void insertChild(Child child);

    List<Child> findAll();

    //@Select("SELECT * FROM child WHERE child_no = #{child_no}")
    Child selectChild(int child_no);
}
