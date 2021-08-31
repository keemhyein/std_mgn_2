package std_mgn_2.dao;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import std_mgn_2.Student;
import std_mgn_2.Subject;
import std_mgn_2.impl.StudentDaoImpl;

public class StudentDaoTest {
	private StudentDao dao = StudentDaoImpl.getInstance();

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void testSelectStudentByAll() {
		ArrayList<Student> list = dao.selectStudentByAll();
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);
	}

	@Test
	public void testSelectStudentByNo() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertStudent() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateStudent() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteStudent() {
		fail("Not yet implemented");
	}

	@Test
	public void testselectSubjectByStdNo() {
		Student std = new Student(101);//Student가 수강신청한 과목
		ArrayList<Subject> subjList = dao.selectSubjectByStdNo(std);
		Assert.assertNotEquals(0, subjList.size());
		std.setSubjList(subjList);
		
		//학생정보를 출력
		//해당학생이 수강신청한 정보
		System.out.println(std.getStdNo());
		System.out.println(std.getStdName());
		System.out.println("수강신청정보");
		std.getSubjList().stream().forEach(System.out::println);
		
	}
}
