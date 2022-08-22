/**
 * Created by IntelliJ IDEA.
 * User: Cangue.Jamba
 * Project name: microservices-asyn-communication-using-rabbitmq
 */
package io.blog.article.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ArticleConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
