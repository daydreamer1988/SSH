package com.minicuper.practice.dao;

import com.minicuper.practice.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDaoSimple {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public boolean regist(User user){
        Session currentSession = sessionFactory.getCurrentSession();
        try {
            currentSession.save(user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            currentSession.getTransaction().rollback();
            return false;
        }

    }
}
