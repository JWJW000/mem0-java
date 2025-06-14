package me.pgthinker.starter;

import me.pgthinker.client.Mem0Client;
import me.pgthinker.starter.config.Mem0ClientProperties;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @Project: me.pgthinker.starter
 * @Author: NingNing0111
 * @Github: https://github.com/ningning0111
 * @Date: 2025/6/14 20:28
 * @Description:
 */
@AutoConfiguration
@ConditionalOnClass(Mem0Client.class) // 检查实现类
@EnableConfigurationProperties(Mem0ClientProperties.class)
@ConditionalOnProperty(prefix = "spring.ai.mem0.client", name = "enabled", havingValue = "true", matchIfMissing = true)
public class Mem0ClientAutoConfiguration {

	@Bean
	@ConditionalOnMissingBean
	public RestTemplate mem0RestTemplate() {
		SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
		return new RestTemplate(factory);
	}

	@Bean
	@ConditionalOnMissingBean
	public Mem0Client mem0Client(RestTemplate restTemplate, Mem0ClientProperties properties) {
		return new Mem0Client(properties.getBaseUrl(), properties.getToken(), restTemplate);
	}

}
