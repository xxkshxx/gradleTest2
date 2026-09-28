package egovframework.example.sample.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "hi, hello!!";
	}

		@GetMapping("/hello2")
	public String hello() {
		return "hi, hello 222222!!";
	}


}
