package com.barclays.lar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/disclosure")
public class DisclosureController {
	
	@GetMapping("/{disclosureId}")
	public String getDisclosureDetails(@PathVariable("disclosureID") Long disclosureID){		
		
		return "disclosure details";
		
	}

}
