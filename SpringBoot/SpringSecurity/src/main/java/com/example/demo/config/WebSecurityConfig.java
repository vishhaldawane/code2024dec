package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.demo.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig
{
    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public UserDetailsService userDetailsService()
    {
        return new UserDetailsServiceImpl();
    }

    /*@Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }*/
    
    @Bean
	public PasswordEncoder passwordEncoder() {
		System.out.println("getPasswordEncoder()....invoked....");
		return NoOpPasswordEncoder.getInstance();
	}

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
    {
        
        		//http.authorizeHttpRequests()
        		//.requestMatchers("/").authenticated()
        		//.and().formLogin()
        		//.and().httpBasic();
     		//return http.build();
        		
        		http.authorizeHttpRequests()
        		.requestMatchers("/").permitAll()
        		.requestMatchers("/admin").authenticated()
        		.requestMatchers("/user").authenticated()
        		.and().formLogin();
        		
        		return http.build();
        		
/*           http.reques
                .requestMatchers("/").permitAll()
                .anyRequest().hasRole("USER")
                .and()
                .formLogin()
                    .loginPage("/login")
                    .defaultSuccessUrl("/welcome")
                    .permitAll()
                    .and()
                .logout()
                    .logoutUrl("/logout").permitAll()
                .and().build();
    	*/
        		
    
     
    }

        @Bean
        public AuthenticationProvider authenticationProvider()
        {
            DaoAuthenticationProvider authenticationProvider=new DaoAuthenticationProvider();
            authenticationProvider.setUserDetailsService(userDetailsService());
            authenticationProvider.setPasswordEncoder(passwordEncoder());
            return authenticationProvider;
        }
}