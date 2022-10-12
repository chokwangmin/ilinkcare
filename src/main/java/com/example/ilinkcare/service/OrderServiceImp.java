package com.example.ilinkcare.service;

import com.example.ilinkcare.domain.Order;
import com.example.ilinkcare.domain.Review;
import com.example.ilinkcare.domain.Teacher;
import com.example.ilinkcare.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ilinkcare.domain.Child;

import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImp implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    //주문리스트
    public List<Order>getOrderList(Map<String, Object> param){
        return orderMapper.findAllOrder(param);
    }
    
    //리뷰리스트
    public List<Review> getReviewList(Map<String, Object> param){
        return orderMapper.getReviewList(param);
    }
    public Teacher getReviewDetail(Map<String, Object> param){
        return orderMapper.getReviewDetail(param);
    }
    //주문찾기
    public Order getOrder(int order_no){

        return orderMapper.selectOrder(order_no);
    }

    //주문생성
    public int OrderCreate(Order order){
        return orderMapper.insertOrder(order);
    }

    @Override
    public int selectReviewCount(Map<String, Object> param) {
        return orderMapper.selectReviewCount(param);
    }

    @Override
    public int registReview(Map<String, Object> param) {
        return orderMapper.registReview(param);
    }
}
