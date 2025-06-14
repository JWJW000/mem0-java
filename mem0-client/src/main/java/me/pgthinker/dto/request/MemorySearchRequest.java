package me.pgthinker.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * @Project: me.pgthinker.starter.dto.request
 * @Author: NingNing0111
 * @Github: https://github.com/ningning0111
 * @Date: 2025/6/14 21:48
 * @Description:
 */
public class MemorySearchRequest {

	@JsonProperty("query")
	private String query;

	@JsonProperty("user_id")
	private String userId;

	@JsonProperty("run_id")
	private String runId;

	@JsonProperty("agent_id")
	private String agentId;

	@JsonProperty("filters")
	private Map<String, Object> filters;

	@JsonProperty("page_size")
	private Integer pageSize = 100;

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public Map<String, Object> getFilters() {
		return filters;
	}

	public void setFilters(Map<String, Object> filters) {
		this.filters = filters;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getRunId() {
		return runId;
	}

	public void setRunId(String runId) {
		this.runId = runId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
