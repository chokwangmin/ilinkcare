package com.example.ilinkcare.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class User {

    private String username;
    private String password;
    private String userid;
    private String userno;

}
