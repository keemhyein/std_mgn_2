package std_mgn_2.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import std_mgn_2.Student;
import std_mgn_2.Subject;
import std_mgn_2.dao.StudentDao;
import std_mgn_2.dao.StudentDaoTest;
import std_mgn_2.util.JdbcUtil;

public class StudentDaoImpl implements StudentDao {
	private static final StudentDaoImpl instance = new StudentDaoImpl();

	public static StudentDaoImpl getInstance() {
		return instance;
	}

	private StudentDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Student> selectStudentByAll() {
		String sql = "select std_no, std_name, std_dept, std_tel from student";
		ArrayList<Student> stdlist = null;
		try(Connection con = JdbcUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery()){
			if (rs.next()) {
				stdlist = new ArrayList<Student>();
				do {
					stdlist.add(getStudent(rs));
				}while(rs.next());
			}
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stdlist;
	}

	private Student getStudent(ResultSet rs) throws SQLException {
		int stdNo = rs.getInt("std_no");
		String stdName = rs.getString("std_name");
		String stdDept = rs.getString("std_dept");
		String stdTel = rs.getString("std_tel");
		Student std = new Student(stdNo, stdName, stdDept, stdTel);
		return std;
	}

	@Override
	public Student selectStudentByNo(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertStudent(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateStudent(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Subject> selectSubjectByStdNo(Student student) {
		String sql ="select s.subj_code, s.subj_name "
				+ "  from subject s join enroll e "
				+ " 	on s.subj_code = e.subj_code "
				+ " where e.std_no = ?";
		
		try(Connection con = JdbcUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)){
				
				pstmt.setInt(1, );
				
				try(ResultSet rs = pstmt.executeQuery()) {
					if(rs.next()) {
						
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		
		return null;
	}

}
