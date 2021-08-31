package std_mgn_2;

import java.util.ArrayList;

public class Subject {
	private int subjCode;
	private String subjName;
	private ArrayList<Student> stdlist;

	public Subject(int subjCode) {
		this.subjCode = subjCode;
	}

	public Subject(int subjCode, String subjName, ArrayList<Student> stdlist) {
		this.subjCode = subjCode;
		this.subjName = subjName;
		this.stdlist = stdlist;
	}

	public int getSubjCode() {
		return subjCode;
	}

	public void setSubjCode(int subjCode) {
		this.subjCode = subjCode;
	}

	public String getSubjName() {
		return subjName;
	}

	public void setSubjName(String subjName) {
		this.subjName = subjName;
	}

	public ArrayList<Student> getStdlist() {
		return stdlist;
	}

	public void setStdlist(ArrayList<Student> stdlist) {
		this.stdlist = stdlist;
	}

	@Override
	public String toString() {
		return String.format("Subject [subjCode=%s, subjName=%s, stdlist=%s]", subjCode, subjName, stdlist.size());
	}

}
