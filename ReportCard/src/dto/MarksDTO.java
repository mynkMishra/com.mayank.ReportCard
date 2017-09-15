package dto;

public class MarksDTO {
	
	int fcs;
	int cgMmt;
	int cNs;
	int stld;
	int ds;
	int totalMarks;
	float percentage;
	String grade;
	
	public int getFcs() {
		return fcs;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setFcs(int fcs) {
		this.fcs = fcs;
	}
	public int getCgMmt() {
		return cgMmt;
	}
	public void setCgMmt(int cgMmt) {
		this.cgMmt = cgMmt;
	}
	public int getcNs() {
		return cNs;
	}
	public void setcNs(int cNs) {
		this.cNs = cNs;
	}
	public int getStld() {
		return stld;
	}
	public void setStld(int stld) {
		this.stld = stld;
	}
	public int getDs() {
		return ds;
	}
	public void setDs(int ds) {
		this.ds = ds;
	}
	
	
	

}
