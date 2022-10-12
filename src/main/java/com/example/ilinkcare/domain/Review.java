package com.example.ilinkcare.domain;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString
public class Review {
    private String comment_no;
    private String order_no;
    private String comments;
    private String content;
    private String t_name;
    private String create_dt;
}
