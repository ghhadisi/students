package com.hss.student.service.impl;


import com.hss.student.dao.UserDao;
import com.hss.student.dao.impl.UserDaoImpl;
import com.hss.student.service.UserService;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    @Override
    public boolean checkUserNameExist(String name) throws SQLException {
        UserDao userDao = new UserDaoImpl();

        return userDao.checkUserNameExist(name);
    }
}
