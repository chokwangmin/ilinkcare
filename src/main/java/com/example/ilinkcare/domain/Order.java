package com.example.ilinkcare.domain;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@ToString
public class Order {
    private Long order_no;
    private String user_no;
    private String name;
    private String t_name;
    private String to_name;
    private String to_addr;
    private String to_tel;
    private String care_time;
    private String comments;
    private Long child_no;
    private Long teacher_no;
    private String start_time;
    private String end_time;
    private String status;
    private String contract;
    private LocalDateTime contract_time;
    private LocalDateTime created_dt;
    private Long created_by;
    private LocalDateTime update_dt;
    private Long update_by;
    private String age;
    private String contents;
}
