package com.hss.student.dao.impl;

import com.hss.student.dao.StudentDao;
import com.hss.student.entity.Student;
import com.hss.student.utils.JDBCUtil02;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

public class StudentDaoImpl  implements StudentDao {
    @Override
    public List<Student> findStudentByPage(int currentPage) throws SQLException {
        return null;
    }

    @Override
    public List<Student> findAll() throws SQLException {
        return null;
    }

    @Override
    public Student findStudentById(int sid) throws SQLException {
        return null;
    }

    @Override
    public List<Student> searchStudent(String sname, String sgender) throws SQLException {
        return null;
    }

    @Override
    public void insert(Student student) throws SQLException {

    }

    @Override
    public void delete(int sid) throws SQLException {

    }

    @Override
    public void update(Student student) throws SQLException {

    }

    @Override
    public int findCount() throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        Long  result = (Long) runner.query("SELECT COUNT(*) FROM stu" , new ScalarHandler() );
        return result.intValue();
    }
}
