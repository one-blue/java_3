package it.lxy01;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class liveServlet extends GenericServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ��ʼ������
	 */
	@Override
		public void init(ServletConfig config) throws ServletException {
			System.out.println("�״η���ִ��---------------");
		}
/**
 * servlet�ķ��񷽷�
 */
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("ÿ�η���-����ִ��--------------");
	}
	/**
	 * ���ٷ���
	 */
	@Override
	public void destroy() {
		System.out.println("�������ر�ʱ��ִ��--------------");
	}

}
