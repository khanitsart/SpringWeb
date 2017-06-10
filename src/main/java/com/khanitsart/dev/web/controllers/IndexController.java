/**
 * 
 */
package com.khanitsart.dev.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author beatrixiii Khanitsart P.
 *
 */
@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String home(){
		return "index";
	}
}
