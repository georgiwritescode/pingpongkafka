package com.gwc.ping.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/ping")
public class PingController {

    @GetMapping(value = "/whoami")
    public String whoami(HttpServletResponse response) {
        return "I am the PING service";
    }
}
