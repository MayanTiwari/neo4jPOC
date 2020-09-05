package com.mt.springWeb.com.mt.springWeb.basic;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Collections;

/**
 * @author mayantiwari
 */

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	final String API_KEY = "REMOVED_KEY";

	String URL = "https://api.data.gov.in/resource/11d4b398-3f85-4e5e-813c-fe105a17c02c?api-key=ABCD&format=json&offset=0&limit=10";
	String URL_Jammu = "https://api.data.gov.in/resource/f8dd5590-8843-49be-9ae2-79c5b3e23ed0?api-key=ABCD&format=json&offset=0&limit=10";

	//reference data
	//https://www.youtube.com/watch?v=w2yYd2ZA8Ks
	@RequestMapping("/greetings")
	Object home() throws IOException {
		RestTemplate restTemplate = new RestTemplate();

		String test = restTemplate.getForObject(URL_Jammu,String.class);
		ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false).configure(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS,false);
		PublicDataWrapper obj = objectMapper.readValue(test,PublicDataWrapper.class);

	// ResponseEntity<PublicBankData>  publicBankData = restTemplate.exchange(URL, HttpMethod.GET, entity, PublicBankData.class);
		//=  restTemplate.getForObject(URL,PublicBankData.class);
		return obj;
	}

}
