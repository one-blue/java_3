package it.lxy01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

public class MyServlet extends HttpServlet {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Override
//HttpServletRequest req 请求
//HttpServletResponse resp 响应
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String method=req.getMethod();
	System.out.println(method);
	System.out.println("这是一个get方法请求");
	//获取登录名和密码
	String username=req.getParameter("userName");
	String pwd=req.getParameter("pwd");
	//验证用户名密码是否正确
	if(username.equals("admin")&&pwd.equals("123")){
		//输入正确。跳转success.html
		resp.sendRedirect("/webfirst1/success.html");
	}else{
		JOptionPane.showMessageDialog(null, "错误！");
		resp.sendRedirect("/webfirst1/form.html");
	}
}
@Override
public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String method=req.getMethod();
	System.out.println(method);
	System.out.println("这是一个post方法请求");
	}
}
