package com.lhyla;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/")
@Controller
public class MainController {
	
	@RequestMapping
	public String showPage(){
		return "main-page";
	}

}
