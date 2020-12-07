package edu.no2.connwithparentclient;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.no2.services.ParentService;

/**
 * Servlet implementation class ReceiveParentLoginServlet
 */
@WebServlet("/ReceiveParentLoginServlet")
public class ReceiveParentLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReceiveParentLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//���տͻ��˷��͵���Ϣ
		String parentPhone=request.getParameter("parentPhone");
		String parentPwd=request.getParameter("parentPwd");
		String parentIndentity=request.getParameter("parentIdentity");
		System.out.println(parentPhone+";"+parentPwd+";"+parentIndentity);
		//�����ݿ�ȶ���Ϣ
		boolean flag=false;
		try {
			flag=new ParentService().judgeParentLoginInfo(parentPhone, parentPwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ReceiveParentLoginServlet�ҳ���¼��ıȶ����ݣ�"+flag);
		getServletContext().setAttribute("loginParentFlag", flag);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
