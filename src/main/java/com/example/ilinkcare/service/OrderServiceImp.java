package com.example.ilinkcare.service;

import com.example.ilinkcare.domain.Child;
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
    public List<Order>getOrderList(){

        return orderMapper.findAllOrder();
    }

    //주문찾기
    public Order getOrder(int order_no){

        return orderMapper.selectOrder(order_no);
    }

    //주문생성
    public void OrderCreate(Order order){
        orderMapper.insertOrder(order);
    }

}
