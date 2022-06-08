//package br.com.zolarz.pipeclient.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.oauth2.client.InMemoryOAuth2AuthorizedClientService;
//import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().anyRequest().authenticated().and().oauth2Login().and().oauth2Client();
//	}
//
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/authorize/oauth2/code/pipedrive");
//	}
//
//	@Bean
//	public OAuth2AuthorizedClientService authorizedClientService() {
//
//		return new InMemoryOAuth2AuthorizedClientService(clientRegistrationRepository());
//	}
//
////	@Bean
////	public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
////		http.authorizeExchange().anyExchange().authenticated().and().oauth2Client().and().formLogin();
////		return http.build();
////	}
////
////	@Bean
////	WebClient webClient(ReactiveClientRegistrationRepository clientRegistrations,
////			ServerOAuth2AuthorizedClientRepository authorizedClients) {
////		ServerOAuth2AuthorizedClientExchangeFilterFunction oauth = new ServerOAuth2AuthorizedClientExchangeFilterFunction(
////				clientRegistrations, authorizedClients);
////		oauth.setDefaultOAuth2AuthorizedClient(true);
////		return WebClient.builder().filter(oauth).build();
////	}
//
//}
