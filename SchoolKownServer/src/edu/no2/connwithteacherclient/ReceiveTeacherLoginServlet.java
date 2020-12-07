package edu.no2.connwithteacherclient;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.no2.services.ParentService;
import edu.no2.services.TeacherService;

/**
 * Servlet implementation class ReceiveTeacherLoginServlet
 */
@WebServlet("/ReceiveTeacherLoginServlet")
public class ReceiveTeacherLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReceiveTeacherLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//接收客户端发送的信息
		String teacherPhone=request.getParameter("teachertPhone");
		String teacherPwd=request.getParameter("teacherPwd");
		String teacherIndentity=request.getParameter("teacherIdentity");
		System.out.println(teacherPhone+";"+teacherPwd+";"+teacherIndentity);
		//从数据库比对信息teacherIndentity
		boolean flag=false;
		try {
			flag=new TeacherService().judgeTeacherLoginInfo(teacherPhone, teacherPwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ReceiveTeacherLoginServlet教师登录后的比对数据："+flag);
		getServletContext().setAttribute("loginTeacherFlag", flag);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
