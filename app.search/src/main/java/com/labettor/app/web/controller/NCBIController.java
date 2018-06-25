package com.labettor.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.labettor.app.ncbi.dto.NCBISearchDTO;
import com.labettor.app.ncbi.dto.NCBISearchResultsDTO;
import com.labettor.app.ncbi.service.NCBIService;

@Controller
public class NCBIController {

	private NCBIService ncbiService;

	@Autowired
	public NCBIController(NCBIService ncbiService) {
		this.ncbiService = ncbiService;
	}

	@GetMapping("/labbetor/search")
	public String cForm(Model model) {
		model.addAttribute("search", new NCBISearchDTO());
		return "search";
	}

	@PostMapping("/labbetor/search")
	public ModelAndView logSubmit(@ModelAttribute NCBISearchDTO search) {
		System.out.println("-->>" + search);
		NCBISearchResultsDTO searchResultsDTO = ncbiService.search(search);
		System.out.println("==>>" + searchResultsDTO);
		ModelAndView modelAndView = new ModelAndView("result");
		modelAndView.addObject("search", searchResultsDTO);
		return modelAndView;
	}
}
