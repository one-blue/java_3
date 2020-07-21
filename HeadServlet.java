package it.lxy02;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HeadServlet
 */
public class HeadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//������������
		//����������
		request.setCharacterEncoding("utf-8");
		//���������
		response.setHeader("Content-Type", "text/html;charset=utf-8");
		//��ȡ���е���Ϣͷ����
		Enumeration<String> er= request.getHeaderNames();
		while(er.hasMoreElements()){
			//��ȡ��Ϣͷ
			String name=er.nextElement();
			String value= request.getHeader(name);
			response.getWriter().print("��Ϣͷ--"+name+"======="+value+"<br />");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
