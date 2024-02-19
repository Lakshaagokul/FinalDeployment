package com.tech.deployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepController {
@GetMapping("/print")
public String get() {
	return "Hello";
}
}
