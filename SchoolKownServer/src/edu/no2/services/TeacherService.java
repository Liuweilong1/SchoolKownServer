package edu.no2.services;

import java.sql.SQLException;

import edu.no2.utils.DBUtil;

public class TeacherService {
	private DBUtil dbUtil;
	public TeacherService() {
		//ʵ��������
		dbUtil=DBUtil.getInstance();
	}
	/**
	 * ��¼ʱ�ȶԽ�ʦ����Ϣ
	 * @param ��ʦ�ֻ��� ���� ���
	 * @return true or false
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public boolean judgeTeacherLoginInfo(String phone,String pwd) throws ClassNotFoundException, SQLException {
		//ƴ��sql���
		String sql="select * from teacher where teacher_tel='"+phone+"' and teacher_pwd='"+pwd+"'";
		//��ѯ����
		boolean flag=false;
		flag=dbUtil.isExist(sql);
		System.out.println("ParentService��ʦ��¼��Ϣ�Ƿ���ȷ:"+flag);
		return flag;
	}
}
