package com.example.ilinkcare.domain;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@ToString
public class Review {

    private Long comment_no;
    private Long user_no;
    private Long teacher_no;
    private Long order_no;
    private String content;
    private LocalDate created_dt;
    private Long created_by;
    private LocalDate update_dt;
    private Long update_by;

}
