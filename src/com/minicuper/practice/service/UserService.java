package com.minicuper.practice.service;

import com.minicuper.practice.dao.UserDao;
import com.minicuper.practice.entity.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean regist(User user){
        return userDao.regist(user);
    }
}
