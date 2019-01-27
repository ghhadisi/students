package com.hss.student.dao.impl;

import com.hss.student.dao.UserDao;
import com.hss.student.utils.JDBCUtil02;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean checkUserNameExist(String name) throws SQLException {

        QueryRunner queryRunner = new QueryRunner(JDBCUtil02.getDataSource());

        Long count = (Long) queryRunner.query("select count(*) from stu where sname = ?", new ScalarHandler(),name);
        return count > 0;
    }
}
