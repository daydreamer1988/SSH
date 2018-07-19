package com.minicuper.practice.dao;

import com.minicuper.practice.entity.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class UserDao extends HibernateDaoSupport {

    public boolean regist(User user){
        try {
            this.getHibernateTemplate().save(user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }
}
