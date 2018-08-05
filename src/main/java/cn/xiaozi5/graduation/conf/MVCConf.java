package cn.xiaozi5.graduation.conf;

import java.nio.charset.Charset;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

import cn.xiaozi5.graduation.inter.UseTimeInter;

@Configuration
public class MVCConf implements WebMvcConfigurer {
	
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new UseTimeInter()).addPathPatterns("/**");
	}
	
	



	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		FastJsonHttpMessageConverter messageConverter = new FastJsonHttpMessageConverter();
		FastJsonConfig jsonConfig = new FastJsonConfig();
		jsonConfig.setCharset(Charset.forName("UTF-8"));
/*		jsonConfig.setSerializerFeatures(
				SerializerFeature.WriteNullStringAsEmpty
				);*/
		messageConverter.setFastJsonConfig(jsonConfig);
		converters.add(messageConverter);
	}




}
