package std_mgn_2;

import java.util.ArrayList;

public class Student {
	private int stdNo;
	private String stdName;
	private String stdDept;
	private String stdTel;

	private ArrayList<Subject> subjList;

	public Student(int stdNo) {
		this.stdNo = stdNo;
	}

	public Student(int stdNo, String stdName, String stdDept, String stdTel) {
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.stdDept = stdDept;
		this.stdTel = stdTel;

	}

	public int getStdNo() {
		return stdNo;
	}

	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdDept() {
		return stdDept;
	}

	public void setStdDept(String stdDept) {
		this.stdDept = stdDept;
	}

	public String getStdTel() {
		return stdTel;
	}

	public void setStdTel(String stdTel) {
		this.stdTel = stdTel;
	}

	public ArrayList<Subject> getSubjList() {
		return subjList;
	}

	public void setSubjList(ArrayList<Subject> subjList) {
		this.subjList = subjList;
	}

	@Override
	public String toString() {
		return String.format("Student [stdNo=%s, stdName=%s, stdDept=%s, stdTel=%s, list=%s]"
				, stdNo, stdName, stdDept,
				stdTel, subjList==null? "null" : subjList.size());
	}

	// 생성자
	// getter & setter
	// toString

}
