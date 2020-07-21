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
		//获取提交的请求方式
		String method= request.getMethod();
		System.out.println("请求方式"+method);
		//获取请求的协议
		String proto =request.getProtocol();
		System.out.println("请求协议"+proto);
		//获取项目的路径
		String contextpath =request.getContextPath();
		System.out.println("项目的路径"+contextpath);
		//获取servlet的路径
		String servletpath =request.getServletPath();
		System.out.println("servlet的路径"+servletpath);
		//获取请求的路径
		String pathuri =request.getRequestURI();
		String pathurl =request.getRequestURL().toString();
		System.out.println("uri对应的值---"+pathuri+"========="+"url对应的值---"+pathurl);
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
