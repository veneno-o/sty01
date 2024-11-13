package com.example.sty01.contorl;

import com.example.sty01.pojo.UserPojo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
