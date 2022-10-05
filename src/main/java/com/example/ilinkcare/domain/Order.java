package com.example.ilinkcare.domain;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString
public class Order {
    private String order_no;
    private String comments;
    private String name;
    private String t_name;
    private LocalDateTime start_time;
    private LocalDateTime end_time;
}
