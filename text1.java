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
		   request.setAttribute("username", "����");

           String username=(String) request.getAttribute("username");

           System.out.println("username:"+username);

       

           request.setAttribute("username", null);

           username=(String) request.getAttribute("username");

           System.out.println("username:"+username);


	}

	private void zifuliuMethod(HttpServletResponse response) throws IOException {
		//�����ַ�������������
				//�������˺�������˱���һ��
				//����������
				response.setCharacterEncoding("utf-8");
				//���������
				response.setHeader("Content-Type", "text/html;charset=utf-8");
			   String data="�й�";
			   //��ȡ�ַ���
		PrintWriter pw= response.getWriter();
		
		pw.print(data);
	}

	private void zijie(HttpServletResponse response, String data) throws IOException, UnsupportedEncodingException {
		//�����ֽ�������������
		ServletOutputStream out=response.getOutputStream();
		//�������˺�������˱���һ��
		
		response.setHeader("Content-Type", "text/html;charset=utf-8");
		out.write(data.getBytes("utf-8"));
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

	  this.doGet(request, response);

	}

	
}
