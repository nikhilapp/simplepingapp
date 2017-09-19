package com.components;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PingDomain {
		
	private static String URL = "https://www.google.com";
	public String statusCheck() {
        RestTemplate rt = new RestTemplate();
        ResponseEntity<String> responseEntity = rt.getForEntity(URL, String.class);
        System.out.println(responseEntity.getStatusCodeValue());
        return String.valueOf(responseEntity.getStatusCodeValue());
	}
	
}