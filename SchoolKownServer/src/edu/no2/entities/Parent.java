package edu.no2.entities;

public class Parent {
	private int id;
	private String name;
	private String sex;
	private int age;
	private int points;
	private int childId;
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parent(int id, String name, String sex, int age, int points, int childId) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.points = points;
		this.childId = childId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getChildId() {
		return childId;
	}
	public void setChildId(int childId) {
		this.childId = childId;
	}
	@Override
	public String toString() {
		return "Parent [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", points=" + points
				+ ", childId=" + childId + "]";
	}
	
	
}
