package com.example.demo.service;

import com.example.demo.dao.UserMapper;
import com.example.demo.po.User;
import com.example.demo.po.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  @Autowired
  private UserMapper userMapper;

  public void getUsers(){
    UserExample userExample = new UserExample();
    userExample.createCriteria().andIdEqualTo(3);
    List<User> users = userMapper.selectByExample(userExample);
    users.stream().forEach(v -> System.out.println(v));
  }

}
