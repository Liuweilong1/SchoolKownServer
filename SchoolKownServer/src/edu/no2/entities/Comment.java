package edu.no2.entities;

public class Comment {
	
	private int comment_id;
	private int parent_id;
	private int teacher_id;
	private int circle_id;
	private String comment_text;
	private String comment_time;
	public int getComment_id() {
		return comment_id;
	}
	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
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
	public int getCircle_id() {
		return circle_id;
	}
	public void setCircle_id(int circle_id) {
		this.circle_id = circle_id;
	}
	public String getComment_text() {
		return comment_text;
	}
	public void setComment_text(String comment_text) {
		this.comment_text = comment_text;
	}
	public String getComment_time() {
		return comment_time;
	}
	public void setComment_time(String comment_time) {
		this.comment_time = comment_time;
	}
	@Override
	public String toString() {
		return "Comment [comment_id=" + comment_id + ", parent_id=" + parent_id + ", teacher_id=" + teacher_id
				+ ", circle_id=" + circle_id + ", comment_text=" + comment_text + ", comment_time=" + comment_time
				+ "]";
	}
	public Comment(int comment_id, int parent_id, int teacher_id, int circle_id, String comment_text,
			String comment_time) {
		super();
		this.comment_id = comment_id;
		this.parent_id = parent_id;
		this.teacher_id = teacher_id;
		this.circle_id = circle_id;
		this.comment_text = comment_text;
		this.comment_time = comment_time;
	}
	public Comment() {
		super();
	}
	
	
}
