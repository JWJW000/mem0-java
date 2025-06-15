package me.pgthinker.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Project: me.pgthinker.starter.dto.request Author: NingNing0111 GitHub:
 * https://github.com/ningning0111 Date: 2025/6/14 21:48 Description:
 */
public class MemorySearchRequest {

	/**
	 * query content.
	 */
	@JsonProperty("query")
	private String query;

	/**
	 * memory's userId
	 */
	@JsonProperty("user_id")
	private String userId;

	/**
	 * memory's runId
	 */
	@JsonProperty("run_id")
	private String runId;

	/**
	 * memory's agentId
	 */
	@JsonProperty("agent_id")
	private String agentId;

	/**
	 * filters. example: "filters": { "OR": [ { "user_id": "alex" }, { "agent_id": { "in":
	 * ["travel-assistant", "customer-support"] } } ] }
	 */
	@JsonProperty("filters")
	private Map<String, Object> filters;

	/**
	 * memory's size
	 */
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
