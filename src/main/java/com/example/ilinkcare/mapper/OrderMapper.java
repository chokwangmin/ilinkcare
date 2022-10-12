package com.example.ilinkcare.mapper;


import com.example.ilinkcare.domain.Order;
import com.example.ilinkcare.domain.Review;
import com.example.ilinkcare.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;
import com.example.ilinkcare.domain.Child;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrderMapper {

    List<Order> findAllOrder(Map<String, Object> param);
    List<Review> getReviewList(Map<String, Object> param);
    Teacher getReviewDetail(Map<String, Object> param);
    Order selectOrder(int order_no);

    //교육신청
    void insertOrder(Order order);

    int selectReviewCount(Map<String, Object> param);

    int registReview(Map<String, Object> param);
}
