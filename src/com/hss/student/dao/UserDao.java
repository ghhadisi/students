package com.hss.student.dao;

import java.sql.SQLException;

public interface UserDao {
    public boolean checkUserNameExist(String name) throws SQLException;

}
