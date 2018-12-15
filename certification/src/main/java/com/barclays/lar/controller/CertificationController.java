package com.barclays.lar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/certification")
public class CertificationController {
	
	@GetMapping
	public String getCertificationDetails(){
		
		
		return "certification details";
	}

}
