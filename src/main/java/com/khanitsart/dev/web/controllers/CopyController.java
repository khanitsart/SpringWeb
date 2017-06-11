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
public class CopyController {
	
	@RequestMapping("/about")
    public String about() {
        return "copy/about";
    }
}
