package it.lxy02;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestParamServlet
 */
public class RequestParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//通过request对象传递数据========域对象：在一定范围内，可以存值和取值
/**
 * request域对象：在一次请求中，可以存值和取值
 * >>>存值:setAttributde(String key,Object obj);
 * >>>取值:Object obj=getAttributde(String key);
 * >>>移除:removeAttributde(String key);
 * 
 */
		
	}

	private void getParamMethod(HttpServletRequest request, HttpServletResponse response)
			throws IOException, UnsupportedEncodingException {
		//get方式提交，解决中文乱码情况;;使用String的构造方法解决new String(字节数组，编码格式)
		//浏览器编码
		response.setHeader("Content-Type", "text/html;charset=utf-8");
		String username=request.getParameter("userName");
		response.getWriter().print("用户名："+	new String(username.getBytes("ISO8859-1"), "utf-8"));
	}

	private void ParamMethod(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//服务器编码
		request.setCharacterEncoding("utf-8");
		//浏览器编码
		response.setHeader("Content-Type", "text/html;charset=utf-8");
		//根据name属性，获取用户名
		String username=request.getParameter("userName");
		String pwd=request.getParameter("pwd");
		//获取用户选择的值
		String[] hobby=request.getParameterValues("hobby");
		response.getWriter().print("用户名："+username+"<br />"+"密码："+pwd+"<br />"+"爱好："+Arrays.toString(hobby)+"<br />===========================<br />");
		/**
		 * for(int i=0;i<=hobby.length;i++){
		*	response.getWriter().print("爱好： "+hobby[i]+"<br />");
		*}
		*/
		//第二种方式
		Map<String,String[]>  map=request.getParameterMap();
		//遍历map
		Set<String> set=map.keySet();
		for(String key: set ){
			String [] value=map.get(key);
			response.getWriter().print("name属性的值：："+key+"==="+Arrays.toString(value)+"<br />");
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post方式提交，解决中文乱码情况;;会首选把参数提交到缓冲区，ISO-8859-1，不支持中文
		//浏览器编码
		//处理请求中文乱码
		//服务器编码
		request.setCharacterEncoding("utf-8");
		String username=request.getParameter("userName");
		//处理响应中文乱码
		//浏览器编码
		response.setHeader("Content-Type", "text/html;charset=utf-8");
		response.getWriter().print("用户名："+username	);
	}

}
