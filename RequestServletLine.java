package it.lxy02;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestServletLine
 */
public class RequestServletLine extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ�ύ������ʽ
		String method= request.getMethod();
		System.out.println("����ʽ"+method);
		//��ȡ�����Э��
		String proto =request.getProtocol();
		System.out.println("����Э��"+proto);
		//��ȡ��Ŀ��·��
		String contextpath =request.getContextPath();
		System.out.println("��Ŀ��·��"+contextpath);
		//��ȡservlet��·��
		String servletpath =request.getServletPath();
		System.out.println("servlet��·��"+servletpath);
		//��ȡ�����·��
		String pathuri =request.getRequestURI();
		String pathurl =request.getRequestURL().toString();
		System.out.println("uri��Ӧ��ֵ---"+pathuri+"========="+"url��Ӧ��ֵ---"+pathurl);
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
