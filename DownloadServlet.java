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
//防盗链，1。获取Referer请求头 referer=http://localhost:8080/webfirst1/DownloadServlet
		String referer=request.getHeader("Referer");
		//获取服务器名称
		String serverName= request.getServerName();
		if(referer!=null && referer.contains(serverName)){
			//请求referer包含了服务器名称，是本网站，允许下载
			response.getWriter().print("Downloading....................");
		}else{
			//不是本网站，不允许下载，可以定向到本网站下载
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
