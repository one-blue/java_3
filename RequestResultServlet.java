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
		
		//处理响应中文乱码问题
		//服务器编码
			request.setCharacterEncoding("utf-8");
		//浏览器编码
			response.setHeader("Content-Type", "text/html;charset=utf-8");
		// Object obj=getAttributde(String key);取值
			Object obj=request.getAttribute("company");
			String name=(String)obj;
			response.getWriter().print("公司名称：  "+name);
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
