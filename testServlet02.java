package it.lxy01;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class testServlet02
 */
public class testServlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 //得到ServletContext对象
		ServletContext context=this.getServletContext();
		 //获取全局的初始化参数
		Enumeration<String> en=context.getInitParameterNames();
		while (en.hasMoreElements()) {
			String name = (String) en.nextElement();
			String value=context.getInitParameter(name);
			System.out.println("获取的初值为："+name);
			System.out.println("获取的初始化参数为："+value);
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
