package com.craigmgordon.jenkinsxspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	//add a comment
	@GetMapping(value="/home")
	public String test() {
		return "This is mhy test controller";
	}
			
}
