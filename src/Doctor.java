import java.util.ArrayList;


public class Doctor implements Comparable<Doctor> {

	String name;
	String telphoneNo;
	Character sex;
	String speciality;
	String area;
	int reviewScore;
	
	public Doctor(String name, String telphoneNo, Character sex,
			String speciality, String area, int reviewScore) {
		super();
		this.name = name;
		this.telphoneNo = telphoneNo;
		this.sex = sex;
		this.speciality = speciality;
		this.area = area;
		this.reviewScore = reviewScore;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelphoneNo() {
		return telphoneNo;
	}
	public void setTelphoneNo(String telphoneNo) {
		this.telphoneNo = telphoneNo;
	}
	public Character getSex() {
		return sex;
	}
	public void setSex(Character sex) {
		this.sex = sex;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}
	
	public int compareTo(Doctor compareDoctor) {

		int compareScore = ((Doctor) compareDoctor).getReviewScore();
		return compareScore - this.reviewScore;

	}
		
}
