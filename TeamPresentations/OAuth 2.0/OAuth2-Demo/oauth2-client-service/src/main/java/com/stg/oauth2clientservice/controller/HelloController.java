package com.stg.oauth2clientservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import static org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction.oauth2AuthorizedClient;

@RestController
public class HelloController {

    @Autowired
    WebClient webClient;

    @GetMapping(value = "/hello")
    public String sayHello(){
        return "Hello ! I am the client";
    }

    @GetMapping(value = "/api/hello")
    public  String authMethod(){
        return "Hey ! I am an authenticated one";
    }

    @GetMapping(value = "/api/resource")
    public String getResource(
            @RegisteredOAuth2AuthorizedClient("api-client-authorization-code")
            OAuth2AuthorizedClient client){

        return this.webClient
                .get()
                .uri("http://127.0.0.1:9090/api/message")
                .attributes(oauth2AuthorizedClient((client)))
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
