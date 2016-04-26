package zx.soft.attack.controller;


import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import zx.soft.attack.model.Computer;
import zx.soft.attack.service.ComputerService;

@Controller
@RequestMapping("/computer")
public class ComputerController {

	@Inject
	private ComputerService computerService;

	@RequestMapping(value = "", method = RequestMethod.GET)
<<<<<<< HEAD
	public String getComputer() {
		System.out.println("hello");
		return "index";
=======
	@ResponseStatus(HttpStatus.OK)
	public String getComputer(HttpServletRequest request, HttpServletResponse response, Model model) {	
		List list = computerService.getComputerData();
		model.addAllAttributes(list);
		return "redirect:/WEB-INF/views/index.jsp";
>>>>>>> f929889784bef6a546b5bfca022feaa813acf5eb
	}


}
