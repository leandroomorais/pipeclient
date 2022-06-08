package br.com.zolarz.pipeclient.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2AuthorizeRequest;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.security.oauth2.core.endpoint.OAuth2AuthorizationRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.nimbusds.oauth2.sdk.AuthorizationRequest;

@Controller
public class IndexController {

//
//	@GetMapping("/authorize/oauth2/code/pipedrive")
//	public ResponseEntity<?> callback() {
//		OAuth2AuthorizeRequest authorizeRequest = OAuth2AuthorizeRequest.withClientRegistrationId("Pipedrive")
//				.principal("pipedrive").build();
//		OAuth2AuthorizedClient authorizedClient = this.authorizedClientManager.authorize(authorizeRequest);
//		OAuth2AccessToken accessToken = authorizedClient.getAccessToken();
//		return ResponseEntity.ok().body(authorizedClient.getAccessToken());
//	}

}
