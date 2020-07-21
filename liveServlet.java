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
	 * 初始化方法
	 */
	@Override
		public void init(ServletConfig config) throws ServletException {
			System.out.println("首次访问执行---------------");
		}
/**
 * servlet的服务方法
 */
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("每次访问-都会执行--------------");
	}
	/**
	 * 销毁方法
	 */
	@Override
	public void destroy() {
		System.out.println("服务器关闭时会执行--------------");
	}

}
