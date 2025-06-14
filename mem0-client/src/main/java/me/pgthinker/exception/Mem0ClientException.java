package me.pgthinker.exception;

import org.springframework.http.HttpStatus;

/**
 * @Project: me.pgthinker.starter
 * @Author: NingNing0111
 * @Github: https://github.com/ningning0111
 * @Date: 2025/6/14 20:54
 * @Description:
 */
public class Mem0ClientException extends RuntimeException {

	private final String endpoint;

	/**
	 * @param message err description
	 * @param endpoint API endpoint
	 */
	public Mem0ClientException(String message, String endpoint) {
		super(message);
		this.endpoint = endpoint;
	}

	public String getEndpoint() {
		return endpoint;
	}

}
