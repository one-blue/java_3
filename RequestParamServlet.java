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
		//ͨ��request���󴫵�����========�������һ����Χ�ڣ����Դ�ֵ��ȡֵ
/**
 * request�������һ�������У����Դ�ֵ��ȡֵ
 * >>>��ֵ:setAttributde(String key,Object obj);
 * >>>ȡֵ:Object obj=getAttributde(String key);
 * >>>�Ƴ�:removeAttributde(String key);
 * 
 */
		
	}

	private void getParamMethod(HttpServletRequest request, HttpServletResponse response)
			throws IOException, UnsupportedEncodingException {
		//get��ʽ�ύ����������������;;ʹ��String�Ĺ��췽�����new String(�ֽ����飬�����ʽ)
		//���������
		response.setHeader("Content-Type", "text/html;charset=utf-8");
		String username=request.getParameter("userName");
		response.getWriter().print("�û�����"+	new String(username.getBytes("ISO8859-1"), "utf-8"));
	}

	private void ParamMethod(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//����������
		request.setCharacterEncoding("utf-8");
		//���������
		response.setHeader("Content-Type", "text/html;charset=utf-8");
		//����name���ԣ���ȡ�û���
		String username=request.getParameter("userName");
		String pwd=request.getParameter("pwd");
		//��ȡ�û�ѡ���ֵ
		String[] hobby=request.getParameterValues("hobby");
		response.getWriter().print("�û�����"+username+"<br />"+"���룺"+pwd+"<br />"+"���ã�"+Arrays.toString(hobby)+"<br />===========================<br />");
		/**
		 * for(int i=0;i<=hobby.length;i++){
		*	response.getWriter().print("���ã� "+hobby[i]+"<br />");
		*}
		*/
		//�ڶ��ַ�ʽ
		Map<String,String[]>  map=request.getParameterMap();
		//����map
		Set<String> set=map.keySet();
		for(String key: set ){
			String [] value=map.get(key);
			response.getWriter().print("name���Ե�ֵ����"+key+"==="+Arrays.toString(value)+"<br />");
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post��ʽ�ύ����������������;;����ѡ�Ѳ����ύ����������ISO-8859-1����֧������
		//���������
		//����������������
		//����������
		request.setCharacterEncoding("utf-8");
		String username=request.getParameter("userName");
		//������Ӧ��������
		//���������
		response.setHeader("Content-Type", "text/html;charset=utf-8");
		response.getWriter().print("�û�����"+username	);
	}

}
