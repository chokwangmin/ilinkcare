package com.example.ilinkcare.domain;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
public class profile {

    private Long teacher_no;
    private String teacher_id;
    private String name;
    private String password;
    private LocalDate birth;
    private String email;
    private String address1;
    private String address2;
    private String zip_cd;
    private String phone_num;
    private String gender;
    private String comments;
    private LocalDate created_dt;
    private String created_by;
    private LocalDate update_dt;
    private String update_by;
    private String status;
    private String posting_yn;
}
