package com.example.ilinkcare.controller;

import com.example.ilinkcare.domain.Order;
import com.example.ilinkcare.service.OrderServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping
@Controller
public class OrderController {

    @Autowired
    private OrderServiceImp orderService;

    //주문리스트
    @GetMapping("/orderlist")
    public String Order(Model model){
        List<Order> orderList =  orderService.getOrderList();
        model.addAttribute("orderList", orderList );
        return "orderlist";
    }

}
