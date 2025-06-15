package me.pgthinker.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Project: me.pgthinker.starter Author: NingNing0111 GitHub:
 * https://github.com/ningning0111 Date: 2025/6/14 20:44 Description:
 */
@ConfigurationProperties(prefix = "mem0.client")
public class Mem0ClientProperties {

	/**
	 * The base URL of the Mem0 server.
	 */
	private String baseUrl = "http://localhost:8080";

	/**
	 * The access token used for authentication.
	 */
	private String token = "123123";

	/**
	 * connect timeout
	 */
	private Integer connectTimeout = -1;

	/**
	 * read timeout
	 */
	private Integer readTimeout = -1;

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

	public Integer getConnectTimeout() {
		return connectTimeout;
	}

	public void setConnectTimeout(Integer connectTimeout) {
		this.connectTimeout = connectTimeout;
	}

	public Integer getReadTimeout() {
		return readTimeout;
	}

	public void setReadTimeout(Integer readTimeout) {
		this.readTimeout = readTimeout;
	}

}
