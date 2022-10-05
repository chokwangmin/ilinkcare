package com.example.ilinkcare.domain;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString
public class Wishlist {

    private Long wishlist_no;
    private Long teacher_no;
    private Long user_no;
    private LocalDateTime created_dt;

}
