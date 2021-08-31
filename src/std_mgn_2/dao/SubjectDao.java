package std_mgn_2.dao;

import java.util.ArrayList;

import std_mgn_2.Student;
import std_mgn_2.Subject;

public interface SubjectDao {
	ArrayList<Subject> selectSubjectByAll();
	Subject selectSubjectByNo();
	int insertSubject(Subject subject);
	int updateSubject(Subject subject);
	int deleteSubject(Subject subject);
	
	ArrayList<Student> selectStudentByCode(Subject subject);
	/*
	 * select student필드(std_no, std_name)
	 *   from subject j join enroll on j.subj_code = enroll.subj_code
	 *   join student s on enroll.std_no = s.std_no
	 *  where subj_code = 501;
	 *  
	 * student table과 enroll table join후 where subj_code = ?
	*/
}
