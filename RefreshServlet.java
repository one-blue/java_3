package it.lxy01;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RefreshServlet
 */
public class RefreshServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		dssx(response);
	}

	private void dssx(HttpServletResponse response) throws IOException {
		//��ʱˢ��,ÿ������ˢ��һ��
		response.setHeader("Refresh","5");
		response.getWriter().print(new Date());
	}

	private void dstz(HttpServletResponse response) {
		//��ʱ��ת
		//1.��Ӧͷ
		response.setHeader("Refresh","5;url=/webfirst1/form.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
