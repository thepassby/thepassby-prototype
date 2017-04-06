/**
 * 
 */
package com.thepassby.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author reset
 *
 */
@Configuration
public class PrototypeConfiguration {
	// rest api 远程调用
	// 配置注入以实现单例化
	@Bean(name = "restTemplate")
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
