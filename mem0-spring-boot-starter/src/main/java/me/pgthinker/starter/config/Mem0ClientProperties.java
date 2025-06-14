package me.pgthinker.starter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;

/**
 * @Project: me.pgthinker.starter
 * @Author: NingNing0111
 * @Github: https://github.com/ningning0111
 * @Date: 2025/6/14 20:44
 * @Description:
 */
@ConfigurationProperties("spring.ai.mem0")
public class Mem0ClientProperties {

	private String baseUrl = "http://localhost:8080";

	private String token;

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
