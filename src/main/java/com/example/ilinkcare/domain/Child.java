package com.example.ilinkcare.domain;

import lombok.Data;
import lombok.ToString;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@ToString
public class Child {

    private Long child_no;
    private Long user_no;
    private String name;
    private LocalDate birth;
    private String gender;
    private LocalDateTime created_dt;
    private Long created_by;
    private LocalDateTime update_dt;
    private Long update_by;


}
