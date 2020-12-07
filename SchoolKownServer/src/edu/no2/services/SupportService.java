package edu.no2.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import edu.no2.utils.DBUtil;

public class SupportService {
	private DBUtil dbutil;
	public SupportService() {
		dbutil = DBUtil.getInstance();
	}
	
	/**
	 * ¥Ê¥¢µ„‘ﬁ–≈œ¢
	 * @param id
	 * @return Parent
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public void Storesupport(int circle_id,int parent_id,int teacher_id,String support_flag) throws ClassNotFoundException, SQLException {
		if(support_flag.equals("teacher")) {
			String sql1 = "select * from where teacher_id='"+teacher_id+"' and circle_id'"+circle_id +"'";
			ResultSet rs =  dbutil.queryDate(sql1);
			if(rs == null) {
				String sql2 = "insert into support(circle_id, parent_id,teacher_id,support_flag) "
						+ "values('" + circle_id + "', '" + parent_id + "', '" + teacher_id + "','" + support_flag + "')";
				int q = dbutil.addDataToTable(sql2);
			}
		}else {
			String sql1 = "select * from where parent='"+parent_id+"' and circle_id'"+circle_id +"'";
			ResultSet rs =  dbutil.queryDate(sql1);
			if(rs == null) {
				String sql2 = "insert into support(circle_id, parent_id,teacher_id,support_flag) "
						+ "values('" + circle_id + "', '" + parent_id + "', '" + teacher_id + "','" + support_flag + "')";
				int q = dbutil.addDataToTable(sql2);
			}
		}
	}
}
