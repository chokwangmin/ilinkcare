package com.example.ilinkcare.service;

import com.example.ilinkcare.domain.Order;
import com.example.ilinkcare.domain.Teacher;


import java.util.List;

public interface OrderSevice {

    List<Order> getOrderList();

    Order getOrder(int order_no);
}
