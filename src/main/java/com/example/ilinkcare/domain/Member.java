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
public class Member implements UserDetails {
    private User user;

    public Member(User user) {
        this.user = user;
    }

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

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    //계정이 만료되지 않았는지 리턴 (true: 만료안됨)
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    //계정이 잠겨있는지 않았는지 리턴. (true:잠기지 않음)
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    //비밀번호가 마료되지 않았는지 리턴한다. (true:만료안됨)
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    //계정이 활성화(사용가능)인지 리턴 (true:활성화)
    @Override
    public boolean isEnabled() {
        return true;
    }

    //계정이 갖고있는 권한 목록은 리턴
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collectors = new ArrayList<>();
        collectors.add(new SimpleGrantedAuthority("ROLE_USER"));

        return collectors;
    }
}
