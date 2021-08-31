package std_mgn_2.dao;

import java.util.ArrayList;

import std_mgn_2.Student;
import std_mgn_2.Subject;

public interface StudentDao {
	ArrayList<Student> selectStudentByAll();
	Student selectStudentByNo(Student student);
	int insertStudent(Student student);
	int updateStudent(Student student);
	int deleteStudent(Student student);
	ArrayList<Subject> selectSubjectByStdNo(Student student);
}
