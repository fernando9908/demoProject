package com.example.demo.controller;

import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Autowired
  private UserService userService;

  @ApiOperation(value = "向客人问好")
  @GetMapping("/hello")
  public String hello(){
    userService.getUsers();
    return "hello spring boot demo";
  }

}
