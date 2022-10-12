package com.example.ilinkcare.controller;

import com.example.ilinkcare.domain.MemberSecurity;
import com.example.ilinkcare.domain.Order;
import com.example.ilinkcare.domain.Review;
import com.example.ilinkcare.domain.Teacher;
import com.example.ilinkcare.service.OrderServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping
@Controller
public class OrderController {

    @Autowired
    private OrderServiceImp orderService;

    //주문리스트
    @GetMapping("/orderlist")
    public String orderlist(Model model, Authentication authentication){
        MemberSecurity userDetails = (MemberSecurity) authentication.getPrincipal();
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("userNo", userDetails.getUserNo());

        List<Order> orderList =  orderService.getOrderList(param);
        model.addAttribute("orderList", orderList );
        return "orderlist";
    }

    @GetMapping("/reviewlist")
    public String reviewlist(Model model, Authentication authentication){
        MemberSecurity userDetails = (MemberSecurity) authentication.getPrincipal();
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("userNo", userDetails.getUserNo());

        List<Review> reviewList =  orderService.getReviewList(param);
        model.addAttribute("reviewList", reviewList );

        return "reviewlist";
    }

}
