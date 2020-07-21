package it.lxy01;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class text1 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		   request.setAttribute("username", "张三");

           String username=(String) request.getAttribute("username");

           System.out.println("username:"+username);

       

           request.setAttribute("username", null);

           username=(String) request.getAttribute("username");

           System.out.println("username:"+username);


	}

	private void zifuliuMethod(HttpServletResponse response) throws IOException {
		//处理字符流的中文乱码
				//服务器端和浏览器端编码一致
				//服务器编码
				response.setCharacterEncoding("utf-8");
				//浏览器编码
				response.setHeader("Content-Type", "text/html;charset=utf-8");
			   String data="中国";
			   //获取字符流
		PrintWriter pw= response.getWriter();
		
		pw.print(data);
	}

	private void zijie(HttpServletResponse response, String data) throws IOException, UnsupportedEncodingException {
		//处理字节流的中文乱码
		ServletOutputStream out=response.getOutputStream();
		//服务器端和浏览器端编码一致
		
		response.setHeader("Content-Type", "text/html;charset=utf-8");
		out.write(data.getBytes("utf-8"));
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

	  this.doGet(request, response);

	}

	
}
