//package br.com.zolarz.pipeclient.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.reactive.function.client.WebClient;
//
//import reactor.core.publisher.Mono;
//
//@RestController
//public class TestController {
//
//	@Autowired
//	WebClient webClient;
//
//	@GetMapping("/auth-code")
//	Mono<String> useOauthWithAuthCode() {
//		Mono<String> retrievedResource = webClient.get().uri("http://localhost:8080/retrieve-resource").retrieve()
//				.bodyToMono(String.class);
//		return retrievedResource.map(string -> "We retrieved the following resource using Oauth: " + string);
//	}
//
//}
