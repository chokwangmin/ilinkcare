package com.example.ilinkcare.mapper;


import com.example.ilinkcare.domain.Child;
import com.example.ilinkcare.domain.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    List<Order>findAllOrder();


    Order selectOrder(int order_no);

    //교육신청
    void insertOrder(Order order);


}
