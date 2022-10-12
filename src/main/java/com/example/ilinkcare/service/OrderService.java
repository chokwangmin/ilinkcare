package com.example.ilinkcare.service;

import com.example.ilinkcare.domain.Order;
import com.example.ilinkcare.domain.Teacher;


import java.util.List;

public interface OrderService {

    List<Order> getOrderList(Map<String, Object> param);

    List<Review> getReviewList(Map<String, Object> param);

    Teacher getReviewDetail(Map<String, Object> param);
    Order getOrder(int order_no);

    int selectReviewCount(Map<String, Object> param);

    int registReview(Map<String, Object> param);
    
    //주문생성
    void OrderCreate (Order order);
}
