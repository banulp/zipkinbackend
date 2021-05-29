package com.banulp.zipkinbackend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@EnableAutoConfiguration
@RestController
@Slf4j
public class BackendController {

    @RequestMapping("/api")
    public String printDate(@RequestHeader(name = "user_name", required = false) String username) {
        log.info("username : " + username);

        if (username != null) {
            return new Date().toString() + " " + username + "banulp";
        }
        return new Date().toString() + "banulp";
    }

}
