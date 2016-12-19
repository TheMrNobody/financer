package com.czeczot.financer.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated();
    }

  // @Autowired
  // public void configureAuth(AuthenticationManagerBuilder auth) throws Exception {
  //     auth.inMemoryAuthentication().withUser("user").roles("USER").and()
  //         .withUser("admin").password("admin").roles("USER", "ADMIN");
  // }
}
