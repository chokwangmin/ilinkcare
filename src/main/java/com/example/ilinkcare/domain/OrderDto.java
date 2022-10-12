package com.example.ilinkcare.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderDto {

    private Long order_no;
    private Long user_no;
    private String to_name;
    private String to_addr;
    private String to_tel;
    private String care_time;
    private Long child_no;
    private Long teacher_no;
    private LocalDateTime start_time;
    private LocalDateTime end_time;
    private String status;
    private String contract;
    private LocalDateTime contract_time;
    private LocalDateTime created_dt;
    private Long created_by;
    private LocalDateTime update_dt;
    private Long update_by;
}
