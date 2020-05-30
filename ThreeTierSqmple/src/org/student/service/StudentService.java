package org.student.service;

import org.student.dao.StudentDao;
import org.student.entity.Student;

//业务逻辑层：逻辑性的增删改查（增：查+增），对dao层进行的组装
public class StudentService {
	StudentDao studentDao = new StudentDao();
	
	public boolean addStudent(Student student) {
		
		if(!studentDao.isExist(student.getSno())) {
			studentDao.addStudent(student);
			return true;
		}else {
			System.out.println("此人已经存在");
			return false;
		}
	}
}
