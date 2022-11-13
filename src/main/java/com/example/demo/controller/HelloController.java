package com.example.demo.controller;

import com.example.demo.po.AdminUser;
import com.example.demo.service.AdminUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

  @Autowired
  private AdminUserService adminUserService;

  @ApiOperation(value = "向客人问好")
  @GetMapping("/hello")
  public String hello(){
    List<AdminUser> adminUser = adminUserService.getAdminUser();
    adminUser.forEach((System.out::println));
    return "hello spring boot demo";
  }

}
