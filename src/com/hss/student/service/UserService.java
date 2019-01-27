package com.hss.student.service;

import java.sql.SQLException;

public interface UserService {
    public boolean checkUserNameExist(String name) throws SQLException;
}
