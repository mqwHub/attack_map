package zx.soft.attack.controller;


import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import zx.soft.attack.model.Computer;
import zx.soft.attack.service.ComputerService;

@Controller
@RequestMapping("/computer")
public class ComputerController {

	@Inject
	private ComputerService computerService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getComputer() {
		System.out.println("hello");
		return "index";
	}


}
