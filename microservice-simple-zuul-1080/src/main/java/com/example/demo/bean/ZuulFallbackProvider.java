package com.example.demo.bean;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.cloud.netflix.zuul.filters.discovery.DiscoveryClientRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

@Component
public class ZuulFallbackProvider implements FallbackProvider {

	@Override
	public String getRoute() {
		
		DiscoveryClientRouteLocator ss;
		
		return null;
	}

	@Override
	public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
		System.out.println(route + "====================================");
		return new ClientHttpResponse() {
			
			private HttpStatus status = HttpStatus.BAD_GATEWAY;

			@Override
			public InputStream getBody() throws IOException {
				return new ByteArrayInputStream("hello".getBytes());
			}

			@Override
			public HttpHeaders getHeaders() {
				HttpHeaders head = new HttpHeaders();
				head.setContentType(MediaType.APPLICATION_JSON);
				return head;
			}

			@Override
			public HttpStatus getStatusCode() throws IOException {
				return HttpStatus.BAD_REQUEST;
			}

			@Override
			public int getRawStatusCode() throws IOException {
				return status.value();
			}

			@Override
			public String getStatusText() throws IOException {
				return status.getReasonPhrase();
			}

			@Override
			public void close() {
				try {
					super.clone();
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
			}
		};
	}

}
