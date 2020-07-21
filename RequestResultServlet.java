package it.lxy02;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestResultServlet
 */
public class RequestResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//������Ӧ������������
		//����������
			request.setCharacterEncoding("utf-8");
		//���������
			response.setHeader("Content-Type", "text/html;charset=utf-8");
		// Object obj=getAttributde(String key);ȡֵ
			Object obj=request.getAttribute("company");
			String name=(String)obj;
			response.getWriter().print("��˾���ƣ�  "+name);
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
