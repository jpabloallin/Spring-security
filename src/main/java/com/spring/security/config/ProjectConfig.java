package com.spring.security.config;

import com.spring.security.services.JPAUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class ProjectConfig {

     @Bean
     public UserDetailsService userDetailsService () {
          return new JPAUserDetailsService();
     }

     @Bean
     public PasswordEncoder passwordEncoder() {
          return NoOpPasswordEncoder.getInstance();
     }
}
