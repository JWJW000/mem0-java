package me.pgthinker.interceptor;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

/**
 * @Project: me.pgthinker.starter.interceptor
 * @Author: NingNing0111
 * @Github: https://github.com/ningning0111
 * @Date: 2025/6/14 23:15
 * @Description:
 */
public class Mem0AuthInterceptor implements ClientHttpRequestInterceptor {

	private final String token;

	public Mem0AuthInterceptor(String token) {
		this.token = token;
	}

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		if (token != null && !token.isBlank()) {
			request.getHeaders().set("Authorization", "Token " + token);
		}
		return execution.execute(request, body);
	}

}
