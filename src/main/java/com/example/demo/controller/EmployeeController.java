package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/api/v1")
@RestController
public class EmployeeController {

    /**
     * TodoItem 상세 조회
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/user")
    public String getUser() {
        return "사번: 82022593";
    }

    @GetMapping(value = "/userById")
    public String getUserById(@RequestParam(value = "id", required = true) String id) {
        return "사번: " + id;
    }
}
