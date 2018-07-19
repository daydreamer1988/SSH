package com.minicuper.practice.action;

import com.minicuper.practice.entity.User;
import com.minicuper.practice.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {
    public String result = "";

    private User user = new User();

    public User getUser() {
        return user;
    }

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User getModel() {
        return user;
    }

    public String regist(){
        if (userService.regist(user)) {
            result = "注册成功";
            return SUCCESS;
        }else{
            return ERROR;
        }
    }
}
