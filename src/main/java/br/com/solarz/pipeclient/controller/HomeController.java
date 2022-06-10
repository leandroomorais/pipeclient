package br.com.solarz.pipeclient.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/callback")
    public ResponseEntity<?> getAuthorizationCode(@RequestParam("code") String code,@RequestParam("state") String state){
        return ResponseEntity.ok().body(code + " - " + state);
    }
}
