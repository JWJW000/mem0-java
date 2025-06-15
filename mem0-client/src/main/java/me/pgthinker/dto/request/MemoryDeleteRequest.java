package me.pgthinker.dto.request;

/**
 * Project: me.pgthinker.starter.dto.request Author: NingNing0111 GitHub:
 * https://github.com/ningning0111 Date: 2025/6/14 22:01 Description:
 */
public class MemoryDeleteRequest {

	/**
	 * memory's userId
	 */
	private String userId;

	/**
	 * memory's agentId
	 */
	private String agentId;

	/**
	 * memory's runId
	 */
	private String runId;

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
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
