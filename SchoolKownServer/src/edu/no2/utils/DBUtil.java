package edu.no2.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class DBUtil {
	// ����SqlServer��������Ϣ
		private static String driver;
		private static String connStr;
		private static String user;
		private static String pwd;

		private static Connection conn = null;
		private static DBUtil dbUtil;
		
		//ʵ�ֵ���ģʽ
		public static  DBUtil getInstance() {
			//���������DBUtil����,�ʹ�������
			if(dbUtil==null) {
				dbUtil = new DBUtil();
			}
			return dbUtil;
			
		}
		
		//�����Ż��������ݿ������ִ�м����ļ�����
		static {
			try {
				// ���������ļ�����ʼ��SqlServer��������
				loadDBProperty("DBConfig.properties");
				//�������ݿ�
				connectToDB();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * �������ݿ������ļ�
		 * 
		 * @param pFile
		 * @throws IOException
		 * @throws ClassNotFoundException
		 * @throws SQLException
		 */
		private static void loadDBProperty(String pFile) throws IOException, ClassNotFoundException, SQLException {
			// ����Properties����
			Properties prop = new Properties();
			// ���������ļ�
			prop.load(DBUtil.class.getClassLoader().getResourceAsStream(pFile));
			driver = prop.getProperty("DRIVER");
			connStr = prop.getProperty("CONN_STR");
			user = prop.getProperty("USER");
			pwd = prop.getProperty("PWD");
		}

		// ��ȡ���Ӷ���
		private static void connectToDB() throws SQLException, ClassNotFoundException {
			if (null == conn || conn.isClosed()) {
				Class.forName(driver);
				conn = DriverManager.getConnection(connStr, user, pwd);
			}
		}

		/**
		 * ��ѯ����
		 * 
		 * @param sql ��ѯ���ݵ�sql���
		 * @return ��ѯ�������ݼ�
		 * @throws ClassNotFoundException
		 * @throws SQLException
		 */
		public ResultSet queryDate(String sql) throws ClassNotFoundException, SQLException {
			Statement stmt = conn.createStatement();
			// ִ�в�ѯ
			ResultSet rs = stmt.executeQuery(sql);
			return rs;
		}

		/**
		 * �ж������Ƿ����
		 * 
		 * @param sql ��ѯ��sql���
		 * @return �����򷵻�true�����򷵻�false
		 * @throws ClassNotFoundException
		 * @throws SQLException
		 */
		public boolean isExist(String sql) throws ClassNotFoundException, SQLException {
			Statement stmt = conn.createStatement();
			// ִ�в�ѯ
			ResultSet rs = stmt.executeQuery(sql);
			return rs.next();
		}

		/**
		 * ��������
		 * 
		 * @param sql ִ�в����sql���
		 * @return �����¼������
		 * @throws ClassNotFoundException
		 * @throws SQLException
		 */
		public int addDataToTable(String sql) throws ClassNotFoundException, SQLException {
			Statement stmt = conn.createStatement();
			return stmt.executeUpdate(sql);
		}

		/**
		 * �޸Ļ�ɾ������
		 * 
		 * @param sql ��������SQL���
		 * @return �޸Ļ�ɾ���ļ�¼����
		 * @throws SQLException 
		 * @throws ClassNotFoundException 
		 */
		public int updateData(String sql) throws ClassNotFoundException, SQLException {
			Statement stmt = conn.createStatement();
			return stmt.executeUpdate(sql);
		}

		/**
		 * �ر����ݿ�����
		 * 
		 * @throws SQLException
		 */
		public void closeDB() throws SQLException {
			if (null != conn && !conn.isClosed()) {
				conn.close();
			}
		}
}
