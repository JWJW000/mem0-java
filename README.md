
[mem0](https://github.com/mem0ai/mem0)项目(通过智能内存层增强 AI 助手和代理，实现个性化的 AI 交互。它会记住用户偏好，适应个人需求，并随着时间的推移不断学习，非常适合客户支持聊天机器人、AI 助手和自主系统，提供自部署的mem0服务)的简易版Java版客户端,支持对mem0的增删改查功能，可以无缝接入到Java项目中（例如SpringBoot、Spring AI、langchain4j）。



## 服务端启动

```shell
cd mem0-server
uv venv .venv
uv pip install
./.venv/bin/uvicorn main:app --host 127.0.0.1 --port 8833 --reload
```

## 使用

Maven

非SpringBoot项目：

```xml
<dependency>
    <groupId>me.pgthinker</groupId>
    <artifactId>mem0-client</artifactId>
    <version>0.1.2</version>
</dependency>
```

对于SpringBoot项目:

```xml
<dependency>
    <groupId>me.pgthinker</groupId>
    <artifactId>mem0-spring-boot-starter</artifactId>
    <version>0.1.2</version>
</dependency>
```

配置文件：

```yaml
mem0:
  client:
    base-url: http://localhost:8833
    token: 123123
    connect-timeout: 5000
    read-timeout: 5000
```

创建或注入`Mem0Client`对象使用，参考

```java
package me.pgthinker;

import me.pgthinker.client.Mem0Client;
import me.pgthinker.dto.request.MemoryCreateRequest;
import me.pgthinker.dto.request.MemoryDeleteRequest;
import me.pgthinker.dto.request.MemorySearchRequest;
import me.pgthinker.dto.response.Memory;
import me.pgthinker.starter.Mem0ClientAutoConfiguration;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.List;
import java.util.Map;

/**
 * @Project: me.pgthinker
 * @Author: NingNing0111
 * @Github: https://github.com/ningning0111
 * @Date: 2025/6/14 22:38
 * @Description:
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
@Import(Mem0ClientAutoConfiguration.class)
public class AppTest {

	@Autowired
	private Mem0Client mem0Client;

	@Test
	@Order(1)
	public void testCreate() {
		MemoryCreateRequest memoryCreateRequest = new MemoryCreateRequest();
		memoryCreateRequest.setUserId("6188699e-95c7-4471-8ab4-df9772850818");
		memoryCreateRequest.setMetadata(Map.of("food", "vegan"));
		memoryCreateRequest.setMessages(List.of(
				new MemoryCreateRequest.Message("Hi, I'm Alex. I'm a vegetarian and I'm allergic to nuts.", "user"),
				new MemoryCreateRequest.Message(
						"Hello Alex! I've noted that you're a vegetarian and have a nut allergy. I'll keep this in mind for any food-related recommendations or discussions.",
						"assistant")));
		List<Memory> memory = mem0Client.createMemory(memoryCreateRequest);
		System.out.println(memory);
	}

	@Test
	@Order(2)
	public void testSearch() {
		MemorySearchRequest memorySearchRequest = new MemorySearchRequest();
		memorySearchRequest.setQuery("Who is vegetarian?");
		memorySearchRequest.setUserId("6188699e-95c7-4471-8ab4-df9772850818");
		List<Memory> memories = mem0Client.searchMemory(memorySearchRequest);
		System.out.println(memories);
	}

	@Test
	@Order(3)
	public void testGetMemory() {
		MemorySearchRequest memorySearchRequest = new MemorySearchRequest();
		memorySearchRequest.setUserId("6188699e-95c7-4471-8ab4-df9772850818");
		memorySearchRequest.setPageSize(1);
		List<Memory> allMemory = mem0Client.getAllMemory(memorySearchRequest);
		System.out.println(allMemory);
	}

	@Test
	@Order(4)
	public void testGetMemoryById() {
		MemorySearchRequest memorySearchRequest = new MemorySearchRequest();
		memorySearchRequest.setUserId("6188699e-95c7-4471-8ab4-df9772850818");
		memorySearchRequest.setPageSize(1);
		List<Memory> allMemory = mem0Client.getAllMemory(memorySearchRequest);
		Memory memory = mem0Client.getMemoryById(allMemory.get(0).getId());
		System.out.println(memory);
	}

	@Test
	@Order(5)
	public void testUpdateMemoryById() {
		MemorySearchRequest memorySearchRequest = new MemorySearchRequest();
		memorySearchRequest.setUserId("6188699e-95c7-4471-8ab4-df9772850818");
		memorySearchRequest.setPageSize(1);
		List<Memory> allMemory = mem0Client.getAllMemory(memorySearchRequest);
		Boolean b = mem0Client.updateMemoryById(allMemory.get(0).getId(), "Name is Bob.");
		System.out.println(b);
	}

	@Test
	@Order(6)
	public void testDeleteMemoryById() {
		MemorySearchRequest memorySearchRequest = new MemorySearchRequest();
		memorySearchRequest.setUserId("6188699e-95c7-4471-8ab4-df9772850818");
		memorySearchRequest.setPageSize(1);
		List<Memory> allMemory = mem0Client.getAllMemory(memorySearchRequest);
		Boolean b = mem0Client.deleteMemoryById(allMemory.get(0).getId());
		System.out.println(b);
	}

	@Test
	@Order(7)
	public void testDelete() {
		MemoryDeleteRequest memoryDeleteRequest = new MemoryDeleteRequest();
		memoryDeleteRequest.setUserId("6188699e-95c7-4471-8ab4-df9772850818");
		Boolean result = mem0Client.deleteAllMemory(memoryDeleteRequest);
		System.out.println(result);
	}

}
```