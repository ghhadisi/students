package com.hss.student.service;

import com.hss.student.entity.PageBean;
import com.hss.student.entity.Student;

import java.sql.SQLException;
import java.util.List;


/**
 * 这是学生的业务处理规范
 * @author xiaomi
 *
 */
public interface StudentService {
	/**
	 * 查询当页的数据
	 * @param currentPage
	 * @return
	 * @throws SQLException
	 */
	PageBean findStudentByPage(int currentPage) throws SQLException ;

	/**
	 * 查询所有学生
	 * @return  List<Student>
	 */
	List<Student> findAll()  throws SQLException ;
	
	/**
	 * 根据ID查询单个学生对象
	 * @param sid
	 * @return
	 * @throws SQLException
	 */
	Student findStudentById(int sid)  throws SQLException ;
	
	/**
	 * 模糊查询， 根据姓名或者根据性别，或者两者兼有。 
	 * @param sname
	 * @param sgender
	 * @return 集合
	 * @throws SQLException
	 */
	List<Student> searchStudent(String sname, String sgender)  throws SQLException ;
	
	/**
	 * 添加学生
	 * @param student 需要添加到数据库的学生对象
	 * @throws SQLException
	 */
	void insert(Student student) throws SQLException ;
	
	/**
	 * 根据id删除学生
	 * @param sid
	 * @throws SQLException
	 */
	void delete(int sid) throws SQLException ;
	
	/**
	 * 更新学生信息
	 * @param student 需要更新的学生数据
	 * @throws SQLException
	 */
	void update(Student student)throws SQLException ;
}
