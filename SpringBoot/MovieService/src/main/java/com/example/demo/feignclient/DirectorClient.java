package com.example.demo.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.vo.Director;

@FeignClient(name = "DIRECTORSERVICE")
public interface DirectorClient {

    @GetMapping("/director/{id}")
    public Director getDirectorById(@PathVariable("id") int id);

}
// http://DIRECTORSERVICE//director/100