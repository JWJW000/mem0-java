package me.pgthinker.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * Project: me.pgthinker.starter.dto.request Author: NingNing0111 GitHub:
 * https://github.com/ningning0111 Date: 2025/6/14 21:37 Description:
 */
public class MemoryCreateRequest {

	/**
	 * memory message
	 */
	@JsonProperty("messages")
	private List<Message> messages;

	/**
	 * memory's user_id
	 */
	@JsonProperty("user_id")
	private String userId;

	/**
	 * memory's agent_id
	 */
	@JsonProperty("agent_id")
	private String agentId;

	/**
	 * memory's run_id
	 */
	@JsonProperty("run_id")
	private String runId;

	/**
	 * memory's metadata
	 */
	@JsonProperty("metadata")
	private Map<String, Object> metadata;

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public static class Message {

		@JsonProperty("role")
		private String role;

		@JsonProperty("content")
		private String content;

		public Message() {
		}

		public Message(String content, String role) {
			this.content = content;
			this.role = role;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

	}

}
