package com.example.ilinkcare.service;

import com.example.ilinkcare.domain.Order;
import com.example.ilinkcare.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public int selectReviewCount(Map<String, Object> param) {
        return orderMapper.selectReviewCount(param);
    }

    @Override
    public int registReview(Map<String, Object> param) {
        return orderMapper.registReview(param);
    }
    
    //주문생성
    public void OrderCreate(Order order){
        orderMapper.insertOrder(order);
    }
}
