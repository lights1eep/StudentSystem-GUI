package team.twww.jwgl.model;

import java.sql.Date;

public class Student extends Person{
	private String student_name;
	private char sex;
	private String phone_number;
	private String home_town;
	private String college_name;
	private Date birthday;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the student_name
	 */
	public String getStudent_name() {
		return student_name;
	}
	/**
	 * @param student_name the student_name to set
	 */
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	/**
	 * @return the sex
	 */
	public char getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(char sex) {
		this.sex = sex;
	}
	/**
	 * @return the phone_number
	 */
	public String getPhone_number() {
		return phone_number;
	}
	/**
	 * @param phone_number the phone_number to set
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	/**
	 * @return the home_town
	 */
	public String getHome_town() {
		return home_town;
	}
	/**
	 * @param home_town the home_town to set
	 */
	public void setHome_town(String home_town) {
		this.home_town = home_town;
	}
	/**
	 * @return the college_name
	 */
	public String getCollege_name() {
		return college_name;
	}
	/**
	 * @param college_name the college_name to set
	 */
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	

}
