package demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	// need a controller method t show the initial form
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "showform";
	}
	
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
}
