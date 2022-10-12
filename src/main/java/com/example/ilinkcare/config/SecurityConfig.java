package com.example.ilinkcare.config;

import com.example.ilinkcare.service.MemberServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity // 스프링 Security 지원을 가능하게 함
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private MemberServiceImp memberServiceImp;

    @Autowired
    public SecurityConfig(MemberServiceImp memberServiceImp) {
        this.memberServiceImp = memberServiceImp;
    }

    @Bean
    public PasswordEncoder encodePWD() {
        return new BCryptPasswordEncoder();
    }

    // 시큐리티가 대신 로그인해주는데 password를 가로채는데
    // 해당 password가 뭘로 해쉬화해서 회원가입이 되었는지 알아야
    // 같은 해쉬로 암호화해서 DB에 있는 해쉬랑 비교가능
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(memberServiceImp).passwordEncoder(encodePWD());
    }

    @Override
    public void configure(WebSecurity web) throws Exception
    {
        // static 디렉터리의 하위 파일 목록은 인증 무시 ( = 항상통과 )
        web.ignoring().antMatchers("/css/**", "/js/**", "/img/**", "/join", "/member/**", "/favicon.ico", "/resources/**", "/error");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.headers().frameOptions().disable();

        http.authorizeRequests()
                //.anyRequest().authenticated()
                .antMatchers("/mypage").authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .usernameParameter("userName")
                .passwordParameter("userPassword")
                .loginProcessingUrl("/auth/loginProc")
                .defaultSuccessUrl("/index")
                .failureUrl("/login")
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/")
                .permitAll();
    }

}
