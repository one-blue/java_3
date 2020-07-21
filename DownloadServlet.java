package it.lxy02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadServlet
 */
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//��������1����ȡReferer����ͷ referer=http://localhost:8080/webfirst1/DownloadServlet
		String referer=request.getHeader("Referer");
		//��ȡ����������
		String serverName= request.getServerName();
		if(referer!=null && referer.contains(serverName)){
			//����referer�����˷��������ƣ��Ǳ���վ����������
			response.getWriter().print("Downloading....................");
		}else{
			//���Ǳ���վ�����������أ����Զ��򵽱���վ����
			response.sendRedirect("/webfirst1/down.html");
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
