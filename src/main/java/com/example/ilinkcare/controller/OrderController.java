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
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/order") //localhost:8088/api/child/post
    public String OrderCreate(Order order) {

        orderService.OrderCreate(order);

        return "";

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

    @GetMapping("/review")
    public String review(Model model, Authentication authentication, @RequestParam String orderNo){
        MemberSecurity userDetails = (MemberSecurity) authentication.getPrincipal();
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("userNo", userDetails.getUserNo());
        param.put("orderNo", orderNo);

        Teacher reviewDetail =  orderService.getReviewDetail(param);
        model.addAttribute("reviewDetail", reviewDetail );

        return "review";
    }

    @RequestMapping("/registReview")
    @ResponseBody
    public String registReview(@RequestParam String orderNo, @RequestParam String teacherNo, @RequestParam String reviewContents
            , Authentication authentication){

        String msg = "";

        try {
            MemberSecurity userDetails = (MemberSecurity) authentication.getPrincipal();

            Map<String, Object> param = new HashMap<String, Object>();
            param.put("orderNo"         , orderNo);
            param.put("teacherNo"       , teacherNo);
            param.put("reviewContents"  , reviewContents);
            param.put("userNo"          , userDetails.getUserNo());

            int reviewCount = orderService.selectReviewCount(param);

            if (reviewCount == 0) {
                // 관심등록
                int result = orderService.registReview(param);
                if (result > 0) {
                    msg = "리뷰 등록이 되었습니다.";
                } else {
                    msg = "리뷰 등록을 실패하였습니다.";
                }
            } else {
                msg = "이미 리뷰가 등록 된 교육입니다.";
            }

        } catch (Exception e) {
            msg = "리뷰등록 도중 오류가 발생하였습니다.";
        }

        return msg;
    }

}
