package com.hcm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcm.domain.PersonalDataVO;
import com.hcm.domain.ProjectCareerVO;
@Controller
public class HCMController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		return "index";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public void insert(Model model) {
	}
	
	@RequestMapping(value = "/insert_db", method = RequestMethod.POST)
	public String insert_db(PersonalDataVO vo, ProjectCareerVO vo_list) {
		System.out.println(vo_list.getPro_tit().size());
		System.out.println(vo.toString());
		return "redirect:/insert";
	}
	
}
