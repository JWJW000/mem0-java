package me.pgthinker.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Project: me.pgthinker.starter.dto.response Author: NingNing0111 GitHub:
 * https://github.com/ningning0111 Date: 2025/6/15 00:53 Description:
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseWrapper {

	@JsonProperty("results")
	private List<Memory> results;

	@JsonProperty("message")
	private String message;

	public List<Memory> getResults() {
		return results;
	}

	public void setResults(List<Memory> results) {
		this.results = results;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ResponseWrapper{" + "message='" + message + '\'' + ", results=" + results + '}';
	}

}
