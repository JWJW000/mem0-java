package me.pgthinker.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * @Project: me.pgthinker.starter.dto
 * @Author: NingNing0111
 * @Github: https://github.com/ningning0111
 * @Date: 2025/6/14 21:36
 * @Description:
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Memory {

	@JsonProperty("id")
	private String id;

	@JsonProperty("memory")
	private String memory;

	@JsonProperty("event")
	private String event;

	@JsonProperty("user_id")
	private String userId;

	@JsonProperty("agent_id")
	private String agentId;

	@JsonProperty("run_id")
	private String runId;

	@JsonProperty("metadata")
	private Map<String, Object> metadata;

	@JsonProperty("score")
	private Double score;

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public Map<String, Object> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
	}

	public String getRunId() {
		return runId;
	}

	public void setRunId(String runId) {
		this.runId = runId;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "MemoryItem{" + "agentId='" + agentId + '\'' + ", id='" + id + '\'' + ", memory='" + memory + '\''
				+ ", event='" + event + '\'' + ", userId='" + userId + '\'' + ", runId='" + runId + '\'' + ", metadata="
				+ metadata + ", score=" + score + '}';
	}

}
