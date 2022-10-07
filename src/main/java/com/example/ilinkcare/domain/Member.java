package com.example.ilinkcare.domain;

import lombok.Data;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

@Data
@ToString
public class Member {
    private String user_id;
    private String user_name;
    private String password;
    private LocalDate birth;
    private String email;
    private String address1;
    private String address2;
    private String zip_cd;
    private String phone_num;
    private String gender;
    private LocalDateTime created_dt;
    private Long created_by;
    private LocalDateTime update_dt;
    private Long update_by;
}
