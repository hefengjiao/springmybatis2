package com.springmybatis2.springmybatis2.service;


import com.springmybatis2.springmybatis2.dao.UserDao;
import com.springmybatis2.springmybatis2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired
private UserDao   userDao;
    public User getbyid(int id){
        return  userDao.findById(id);


    }

}
