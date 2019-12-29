/**
 * 
 */
package com.luv2code.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author AMRS
 *
 */

@Controller
public class MainController {
	
	@GetMapping("/main")
	public String getMainPage() {
		return "main";
	}
}
