package edu.no2.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import edu.no2.entities.Comment;
import edu.no2.utils.DBUtil;

public class CommentService {
	private DBUtil dbutil;
	public CommentService() {
		dbutil = DBUtil.getInstance();
	}
	
	/**
	 * 获取一个圈子的全部评论
	 * @param id
	 * @return Parent
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public List<Comment> getComments(int circle_id) throws ClassNotFoundException, SQLException{
		List<Comment> comments = new ArrayList<>();
		String sql = "select * from commentwhere circle_id='"+circle_id+"'";
		ResultSet rs = dbutil.queryDate(sql);
		while(rs.next()) {
			Comment comment = new Comment();
			
			comment.setComment_id(rs.getInt("comment_id"));
			comment.setParent_id(rs.getInt("parent_id"));
			comment.setTeacher_id(rs.getInt("teacher_id"));
			comment.setCircle_id(rs.getInt("circle_id"));
			comment.setComment_text(rs.getString("comment_text"));
			
			Timestamp timestamp = rs.getTimestamp("comment_time");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			comment.setComment_time(sdf.format(timestamp));
			
			comments.add(comment);
		}
		return comments;
	}
	
	
	/**
	 * 存储一条评论
	 * @param id
	 * @return Parent
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public void Storecomment(int parent_id,int teacher_id,int circle_id,String comment_text,String comment_time) {
		String sql = "insert into comment(parent_id, teacher_id,circle_id,comment_text,comment_time) "
				+ "values('" + parent_id + "', '" + teacher_id + "', '" + circle_id + "','" + comment_text + "', '" + comment_time + "')";
		int q = -1;//存储插入的记录数
		try {
			q = dbutil.addDataToTable(sql);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
