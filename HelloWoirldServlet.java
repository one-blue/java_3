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
		//����ͻ��˷��͵����󣬲��Ұ�������Ӧ���ͻ���
		System.out.println("�����˿ͻ��˵�����--------");
		//��������Ӧ���ͻ��ˣ���������󶨵��������������������������
		PrintWriter pw=response.getWriter();
		pw.print("Hello World");
		/**
		 *���ʣ� http://localhost:8080/webfirst1/hello
		 */
	}

}
