//package br.com.zolarz.pipeclient.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
//import org.springframework.security.oauth2.client.registration.ClientRegistration;
//import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
//import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
//import org.springframework.security.oauth2.client.web.AuthorizationRequestRepository;
//import org.springframework.security.oauth2.client.web.HttpSessionOAuth2AuthorizationRequestRepository;
//import org.springframework.security.oauth2.core.AuthorizationGrantType;
//import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
//import org.springframework.security.oauth2.core.endpoint.OAuth2AuthorizationRequest;
//
//@EnableWebSecurity
//public class OAuth2LoginConfig {
//
//	@Bean
//	public ClientRegistrationRepository clientRegistrationRepository() {
//		return new InMemoryClientRegistrationRepository(this.pipedriveClient());
//	}
//
//	@Bean
//	public AuthorizationRequestRepository<OAuth2AuthorizationRequest> authorizationRequestRepository() {
//		return new HttpSessionOAuth2AuthorizationRequestRepository();
//	}
//
//	private ClientRegistration pipedriveClient() {
//		return ClientRegistration.withRegistrationId("pipedrive").clientId("953299db29b1ee1c")
//				.clientSecret("e1809ba8c003d719f00d5256ddd0f1002eb8d60d")
//				.clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
//				.authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
//				.redirectUri("http://localhost:8080/authorize/oauth2/code/pipedrive").scope("authorization_code")
//				.authorizationUri("https://oauth.pipedrive.com/oauth/authorize")
//				.tokenUri("https://oauth.pipedrive.com/oauth/token").clientName("Pipedrive").build();
//	}
//
//}