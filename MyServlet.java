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
//HttpServletRequest req ����
//HttpServletResponse resp ��Ӧ
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String method=req.getMethod();
	System.out.println(method);
	System.out.println("����һ��get��������");
	//��ȡ��¼��������
	String username=req.getParameter("userName");
	String pwd=req.getParameter("pwd");
	//��֤�û��������Ƿ���ȷ
	if(username.equals("admin")&&pwd.equals("123")){
		//������ȷ����תsuccess.html
		resp.sendRedirect("/webfirst1/success.html");
	}else{
		JOptionPane.showMessageDialog(null, "����");
		resp.sendRedirect("/webfirst1/form.html");
	}
}
@Override
public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String method=req.getMethod();
	System.out.println(method);
	System.out.println("����һ��post��������");
	}
}
