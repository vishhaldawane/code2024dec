package com.example.demo.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;


@Configuration
public class SecurityConfig {

    /**
     * Defines the security filter chain.
     *
     * @param http the HttpSecurity object to configure.
     * @return the SecurityFilterChain bean.
     * @throws Exception if an error occurs during configuration.
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    	System.out.println("securityFilterChain() invoked....");
    	http
            // Configure authorization rules
            .authorizeRequests()
                // Allow access to any URL under /public/ without authentication
                .requestMatchers("/public/**").permitAll()
                // Require authentication for any other request
                .anyRequest().authenticated()
            .and()
            // Configure form-based login
            .formLogin()
                // Specify the custom login page URL
                .loginPage("/login")
                // Allow everyone to access the login page
                .permitAll()
            .and()
            // Configure logout functionality
            .logout()
                // Allow everyone to access the logout functionality
                .permitAll();
        
        // Return the configured SecurityFilterChain
        return http.build();
    }
}