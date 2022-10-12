package com.example.ilinkcare.mapper;


import com.example.ilinkcare.domain.Order;
import com.example.ilinkcare.domain.Review;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrderMapper {

    List<Order> findAllOrder(Map<String, Object> param);

    List<Review> getReviewList(Map<String, Object> param);

    Order selectOrder(int order_no);

}
