package org.student.service;

import org.student.dao.StudentDao;
import org.student.entity.Student;

//ҵ���߼��㣺�߼��Ե���ɾ�Ĳ飨������+��������dao����е���װ
public class StudentService {
	StudentDao studentDao = new StudentDao();
	
	public boolean addStudent(Student student) {
		
		if(!studentDao.isExist(student.getSno())) {
			studentDao.addStudent(student);
			return true;
		}else {
			System.out.println("�����Ѿ�����");
			return false;
		}
	}
}
