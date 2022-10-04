package com.example.ilinkcare.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentDto {
    private Long comment_no;
    private String content;
    private String user_name;
    private LocalDateTime created_dt;
}
