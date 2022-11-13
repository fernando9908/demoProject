package com.example.demo.service;

import com.example.demo.dao.AdminUserMapper;
import com.example.demo.po.AdminUser;
import com.example.demo.po.AdminUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminUserService {

  @Autowired
  private AdminUserMapper adminUserMapper;

  public List<AdminUser> getAdminUser(){
    AdminUserExample adminUserExample = new AdminUserExample();
    adminUserExample.createCriteria().andIdEqualTo(2L);
    List<AdminUser> users = adminUserMapper.selectByExample(adminUserExample);
    users.stream().forEach(v -> System.out.println(v));
    return users;
  }

}
