package it.lxy01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWoirldServlet extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest arg0, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//出理客户端发送的请求，并且把数据响应给客户端
		System.out.println("接受了客户端的请求--------");
		//把数据响应给客户端，与浏览器绑定的输出流，作用像浏览器输出数据
		PrintWriter pw=response.getWriter();
		pw.print("Hello World");
		/**
		 *访问： http://localhost:8080/webfirst1/hello
		 */
	}

}
