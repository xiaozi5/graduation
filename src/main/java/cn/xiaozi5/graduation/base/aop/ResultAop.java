package cn.xiaozi5.graduation.base.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;

/**
 * @author xiaozi5
 *aop切面处理返回数据
 */
@Component
@Aspect
public class ResultAop {
	
	@Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)&&"
			+ "execution(* cn.xiaozi5.graduation..*.*(..))")
	public void pointcut() {
	}
	
	@Around("pointcut()")
	public Object changeResult(ProceedingJoinPoint joinPoint ) throws Throwable {
			Object o = joinPoint.proceed(joinPoint.getArgs());
			if (o instanceof String) {
				try {
					JSONObject json = JSONObject.parseObject(o.toString());
					json.put("success", true);
					json.put("data", json);
					return json;
				} catch (Exception e) {
					JSONObject json = new JSONObject();
					json.put("message", o);
					json.put("success", false);
					return json;
				}
			}else {
				JSONObject json = new JSONObject();
				json.put("success", true);
				json.put("data", o);
				return json;
			}
	} 
}
