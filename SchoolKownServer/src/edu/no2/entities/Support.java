package edu.no2.entities;

public class Support {
	
	private int support_id;
	private int circle_id;
	private int parent_id;
	private int teacher_id;
	private String support_time;
	public int getSupport_id() {
		return support_id;
	}
	public void setSupport_id(int support_id) {
		this.support_id = support_id;
	}
	public int getCircle_id() {
		return circle_id;
	}
	public void setCircle_id(int circle_id) {
		this.circle_id = circle_id;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getSupport_time() {
		return support_time;
	}
	public void setSupport_time(String support_time) {
		this.support_time = support_time;
	}
	public Support(int support_id, int circle_id, int parent_id, int teacher_id, String support_time) {
		super();
		this.support_id = support_id;
		this.circle_id = circle_id;
		this.parent_id = parent_id;
		this.teacher_id = teacher_id;
		this.support_time = support_time;
	}
	public Support() {
		super();
	}
	@Override
	public String toString() {
		return "Support [support_id=" + support_id + ", circle_id=" + circle_id + ", parent_id=" + parent_id
				+ ", teacher_id=" + teacher_id + ", support_time=" + support_time + "]";
	}
	
	
	
}
