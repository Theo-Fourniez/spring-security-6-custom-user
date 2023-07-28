package com.example.springsecurity6customuser;

import com.example.springsecurity6customuser.user.CustomUser;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @GetMapping
    public String helloWorld(){
        CustomUser customUser =
                (CustomUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return "Hello " + customUser.toString();
    }
}
