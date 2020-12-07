package edu.no2.services;

import java.sql.SQLException;

import edu.no2.utils.DBUtil;

public class TeacherService {
	private DBUtil dbUtil;
	public TeacherService() {
		//实例化对象
		dbUtil=DBUtil.getInstance();
	}
	/**
	 * 登录时比对教师的信息
	 * @param 教师手机号 密码 身份
	 * @return true or false
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public boolean judgeTeacherLoginInfo(String phone,String pwd) throws ClassNotFoundException, SQLException {
		//拼接sql语句
		String sql="select * from teacher where teacher_tel='"+phone+"' and teacher_pwd='"+pwd+"'";
		//查询数据
		boolean flag=false;
		flag=dbUtil.isExist(sql);
		System.out.println("ParentService教师登录信息是否正确:"+flag);
		return flag;
	}
}
