package com.example.ilinkcare.service;

import com.example.ilinkcare.domain.Order;
import org.springframework.context.annotation.Profile;

import java.util.List;

public interface ProfileService {
    List<Profile> getOrderList();

    Order getOrder(int order_no);
}
