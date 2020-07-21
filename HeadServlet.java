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
		//处理中文乱码
		//服务器编码
		request.setCharacterEncoding("utf-8");
		//浏览器编码
		response.setHeader("Content-Type", "text/html;charset=utf-8");
		//获取所有的消息头名称
		Enumeration<String> er= request.getHeaderNames();
		while(er.hasMoreElements()){
			//获取消息头
			String name=er.nextElement();
			String value= request.getHeader(name);
			response.getWriter().print("消息头--"+name+"======="+value+"<br />");
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
