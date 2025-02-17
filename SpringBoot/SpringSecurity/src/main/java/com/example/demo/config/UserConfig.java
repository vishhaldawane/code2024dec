package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.core.userdetails.User;

/**
 * Configuration class for setting up user details service.
 * This class defines the UserDetailsService bean for in-memory user details management.
 */
@Configuration
public class UserConfig {

    /**
     * Defines an in-memory user details service.
     *
     * @return the UserDetailsService bean.
     */
    @Bean
    public UserDetailsService userDetailsService() {
    	System.out.println("userDetailsService() invoked...");
        // Create an in-memory user details manager
        var userDetailsService = new InMemoryUserDetailsManager();
        
        // Define a user with username 'user', password 'password', and role 'USER'
        var user = User.withUsername("user")
                       .password("{noop}123") // {noop} indicates that no password encoder is used
                       .roles("USER")
                       .build();
        
        // Add the user to the in-memory user details manager
        userDetailsService.createUser(user);
        
        // Return the configured UserDetailsService bean
        return userDetailsService;
    }
}