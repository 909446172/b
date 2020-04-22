package com.demo.b.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class WebClientConfig {

//    @Bean
//    @LoadBalanced
//    public WebClient.Builder webClientBuilder(ObjectMapper objectMapper) {
//        return WebClient
//                .builder()
//                .exchangeStrategies(
//                        ExchangeStrategies
//                                .builder()
//                                .codecs(configurer -> configurer
//                                        .defaultCodecs()
//                                        .jackson2JsonDecoder(new Jackson2JsonDecoder(objectMapper)))
//                                .build());
//    }
//
//    @Bean
//    public WebClient webClient(WebClient.Builder builder) {
//        return builder.build();
//    }
}
