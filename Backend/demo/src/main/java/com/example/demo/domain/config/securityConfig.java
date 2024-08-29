package com.example.demo.domain.config;

import org.apache.catalina.filters.HttpHeaderSecurityFilter;
import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.beans.Customizer;

@Configuration
@EnableWebSecurity

public class securityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception{
        http

                .autorizeHttpRequests((autorize) -> autorize
                        .anyRequest()
                        .authenticated()
                )
                .httpBasic(Customizer.withDefaults())
                .formLogin(Customizer.withDefaults());

                return http.build();

    }


    @Bean

    public UserDetailService userDetailService (){
        UserDeatils userDeatils = User.withDefaultPasswordEncoder()
                .username("user")
                .password("123456")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(userDeatils);
    }


}
