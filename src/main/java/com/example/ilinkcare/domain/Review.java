package com.example.ilinkcare.domain;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString
public class Review {
    private String comment_no;      // 코멘트번호
    private String order_no;        // 주문번호
    private String comments;        // 리뷰내용
    private String content;         // 프로그램명
    private String t_name;          // 선생님이름
    private String create_dt;
}
