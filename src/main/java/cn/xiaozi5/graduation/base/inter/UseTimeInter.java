package cn.xiaozi5.graduation.base.inter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.weaver.ast.And;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;


/**
 * @author xiaozi5
 *	
 *	记录请求时间拦截器
 */
public class UseTimeInter implements HandlerInterceptor {
	
	private ThreadLocal<Long> tlocal=new ThreadLocal<Long>();

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if (handler instanceof HandlerMethod && !request.getRequestURL().toString().endsWith("error")) {
			long startTime = System.currentTimeMillis();
			tlocal.set(startTime);
		}
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		Long startTime = tlocal.get();
		if(startTime!=null) {
		tlocal.remove();
		StringBuffer requestURL = request.getRequestURL();
		Long endTime=System.currentTimeMillis()-startTime;
		System.out.println(requestURL.toString()+"	请求耗时:"+endTime+"ms");
		}
	}
	
}
