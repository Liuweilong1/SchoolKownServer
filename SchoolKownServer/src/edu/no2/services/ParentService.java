package edu.no2.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import edu.no2.entities.Parent;
import edu.no2.utils.DBUtil;

public class ParentService {
	private DBUtil dbUtil;
	public ParentService() {
		//ʵ��������
		dbUtil=DBUtil.getInstance();
	}
	/**
	 * ��ȡ�ҳ�����Ϣ
	 * @param id
	 * @return Parent
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public Parent getParentInfoById(int id) throws ClassNotFoundException, SQLException {
		//ƴ��sql���
		String sql="select * from parent where parent_id='"+id+"'";
		//�������ݲ�ѯ
		ResultSet rs=dbUtil.queryDate(sql);
		//ʵ��������
		Parent parent=new Parent();
		while(rs.next()) {
			parent.setId(rs.getInt("parent_id"));
			parent.setPoints(rs.getInt("parent_points"));
		}
		System.out.println(parent.getPoints());
		return parent;
	}
	/**
	 * ��¼ʱ�ȶԼҳ�����Ϣ
	 * @param �ҳ��ֻ��� ���� ���
	 * @return true or false
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public boolean judgeParentLoginInfo(String phone,String pwd) throws ClassNotFoundException, SQLException {
		//ƴ��sql���
		String sql="select * from parent where parent_tel='"+phone+"' and parent_pwd='"+pwd+"'";
		//��ѯ����
		boolean flag=false;
		flag=dbUtil.isExist(sql);
		System.out.println("ParentService�ҳ���¼��Ϣ�Ƿ���ȷ:"+flag);
		return flag;
	}
}
