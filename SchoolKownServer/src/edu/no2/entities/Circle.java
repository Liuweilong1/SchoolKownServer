package edu.no2.entities;

public class Circle {
	
	private int circle_id;
	private int school_id;
	private int class_id;
	private int grade_id;
	private int teacher_id;
	private int parent_id;
	private String publisher_picture;
	private String publish_time;
	private String publish_text;
	private String publish_picture;
	private int  support_num;
	private int comment_num;
	private String publish_flag;
	
	public int getCircle_id() {
		return circle_id;
	}
	public void setCircle_id(int circle_id) {
		this.circle_id = circle_id;
	}
	public int getSchool_id() {
		return school_id;
	}
	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public int getGrade_id() {
		return grade_id;
	}
	public void setGrade_id(int grade_id) {
		this.grade_id = grade_id;
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	public String getPublisher_picture() {
		return publisher_picture;
	}
	public void setPublisher_picture(String publisher_picture) {
		this.publisher_picture = publisher_picture;
	}
	public String getPublish_time() {
		return publish_time;
	}
	public void setPublish_time(String publish_time) {
		this.publish_time = publish_time;
	}
	public String getPublish_text() {
		return publish_text;
	}
	public void setPublish_text(String publish_text) {
		this.publish_text = publish_text;
	}
	public String getPublish_picture() {
		return publish_picture;
	}
	public void setPublish_picture(String publish_picture) {
		this.publish_picture = publish_picture;
	}
	public int getSupport_num() {
		return support_num;
	}
	public void setSupport_num(int support_num) {
		this.support_num = support_num;
	}
	public int getComment_num() {
		return comment_num;
	}
	
	public void setComment_num(int comment_num) {
		this.comment_num = comment_num;
	}
	public String getPublish_flag() {
		return publish_flag;
	}
	public void setPublish_flag(String publish_flag) {
		this.publish_flag = publish_flag;
	}
	@Override
	public String toString() {
		return "Circle [circle_id=" + circle_id + ", school_id=" + school_id + ", class_id=" + class_id + ", grade_id="
				+ grade_id + ", teacher_id=" + teacher_id + ", parent_id=" + parent_id + ", publisher_picture="
				+ publisher_picture + ", publish_time=" + publish_time + ", publish_text=" + publish_text
				+ ", publish_picture=" + publish_picture + ", support_num=" + support_num + ", comment_num="
				+ comment_num + ", publish_flag=" + publish_flag + "]";
	}
	public Circle(int circle_id, int school_id, int class_id, int grade_id, int teacher_id, int parent_id,
			String publisher_picture, String publish_time, String publish_text, String publish_picture, int support_num,
			int comment_num, String publish_flag) {
		super();
		this.circle_id = circle_id;
		this.school_id = school_id;
		this.class_id = class_id;
		this.grade_id = grade_id;
		this.teacher_id = teacher_id;
		this.parent_id = parent_id;
		this.publisher_picture = publisher_picture;
		this.publish_time = publish_time;
		this.publish_text = publish_text;
		this.publish_picture = publish_picture;
		this.support_num = support_num;
		this.comment_num = comment_num;
		this.publish_flag = publish_flag;
	}
	public Circle() {
		super();
	}
	
	
}
