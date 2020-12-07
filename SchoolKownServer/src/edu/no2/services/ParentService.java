package edu.no2.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import edu.no2.entities.Parent;
import edu.no2.utils.DBUtil;

public class ParentService {
	private DBUtil dbUtil;
	public ParentService() {
		//实例化对象
		dbUtil=DBUtil.getInstance();
	}
	/**
	 * 获取家长的信息
	 * @param id
	 * @return Parent
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public Parent getParentInfoById(int id) throws ClassNotFoundException, SQLException {
		//拼接sql语句
		String sql="select * from parent where parent_id='"+id+"'";
		//进行数据查询
		ResultSet rs=dbUtil.queryDate(sql);
		//实例化对象
		Parent parent=new Parent();
		while(rs.next()) {
			parent.setId(rs.getInt("parent_id"));
			parent.setPoints(rs.getInt("parent_points"));
		}
		System.out.println(parent.getPoints());
		return parent;
	}
	/**
	 * 登录时比对家长的信息
	 * @param 家长手机号 密码 身份
	 * @return true or false
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public boolean judgeParentLoginInfo(String phone,String pwd) throws ClassNotFoundException, SQLException {
		//拼接sql语句
		String sql="select * from parent where parent_tel='"+phone+"' and parent_pwd='"+pwd+"'";
		//查询数据
		boolean flag=false;
		flag=dbUtil.isExist(sql);
		System.out.println("ParentService家长登录信息是否正确:"+flag);
		return flag;
	}
}
