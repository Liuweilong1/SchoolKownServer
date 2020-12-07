package edu.no2.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import edu.no2.entities.Circle;
import edu.no2.utils.DBUtil;

public class CircleService {
	private DBUtil dbutil;
	private CircleService() {
		dbutil = DBUtil.getInstance();
	}
	/**
	 * 获取圈子全部信息
	 * @param id
	 * @return Parent
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public List<Circle> getciecles() throws ClassNotFoundException, SQLException{
		List<Circle> circles = new ArrayList<>();
		String sql = "select * from circle";
		ResultSet rs = dbutil.queryDate(sql);
		while(rs.next()) {
			Circle circle = new Circle();
			circle.setCircle_id(rs.getInt("circle_id"));
			circle.setSchool_id(rs.getInt("school_id"));
			circle.setClass_id(rs.getInt("class_id"));
			circle.setGrade_id(rs.getInt("grade_id"));
			circle.setTeacher_id(rs.getInt("teacher_id"));
			circle.setParent_id(rs.getInt("parent_id"));
			
			circle.setPublisher_picture(rs.getString("publisher_picture"));
			Timestamp timestamp = rs.getTimestamp("publish_time");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			circle.setPublish_time(sdf.format(timestamp));
			
			circle.setPublish_text(rs.getString("publish-text"));
			circle.setPublish_picture(rs.getString("publish_picture"));
			circle.setSupport_num(rs.getInt("support_num"));
			circle.setComment_num(rs.getInt("comment_num"));
			circle.setPublish_flag(rs.getString("publish_flag"));
			
			circles.add(circle);
		}
		return circles;
	}
}
