package com.example.ilinkcare.mapper;


import com.example.ilinkcare.domain.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    List<Order> findAllOrder(Map<String, Object> param);
    List<Review> getReviewList(Map<String, Object> param);
    Teacher getReviewDetail(Map<String, Object> param);
    Order selectOrder(int order_no);

    int selectReviewCount(Map<String, Object> param);

    int registReview(Map<String, Object> param);
    
    //±≥¿∞Ω≈√ª
    void insertOrder(Order order);
}
