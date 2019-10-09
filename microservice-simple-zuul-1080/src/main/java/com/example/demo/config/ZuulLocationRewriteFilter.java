package com.example.demo.config;

import org.springframework.cloud.netflix.zuul.filters.post.LocationRewriteFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ZuulLocationRewriteFilter {
	
	@Bean
	public LocationRewriteFilter getLocationRewriteFilter() {
		System.out.println("location re-write filter");
		return new LocationRewriteFilter();
	}
	
	@Bean
	public WebMvcConfigurer getWebMvcConfigurer() {
		return new WebMvcConfigurer() {
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**/").allowedOrigins("http://127.0.0.1:8080").allowedMethods("GET").exposedHeaders("");
			}
		};
	}

}
