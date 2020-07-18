package com.xworkz.spring.calamities.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.spring.calamities.dto.CalamityDTO;
import com.xworkz.spring.calamities.service.CalamityService;

@Controller
@RequestMapping
public class CalamityController {

	@Autowired
	private CalamityService service;

	public CalamityController() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/register.doc")
	public String register(CalamityDTO calamityDTO, ModelMap map) {
			
			try {
				System.out.println("invoked register");
				int check = this.service.validateAndSave(calamityDTO);
				if (check == 0) {
					map.addAttribute("success");
				} else {
					map.addAttribute("failure");
				}	
			} catch (Exception e) {
				System.err.println("Exception register "+e.getMessage());
			}
			return "Success";
		}
		
	}
