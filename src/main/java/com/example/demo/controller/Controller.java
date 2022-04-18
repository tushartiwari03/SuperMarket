package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.SuperMarketRepo;
import com.example.demo.model.SuperMarket;

@org.springframework.stereotype.Controller
public class Controller 
{
	@Autowired
	SuperMarketRepo repo;
	
	
	@RequestMapping("detebyid/{id}")
	public String deletedone(@PathVariable("id") int id)
	{repo.deleteById(id);
	return "redirect:/DeleteItem";
	}
	
	
	
	
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("list")
	public String list(Model model)
	{
	List<SuperMarket>list=	repo.findAll();
		
	model.addAttribute("listToDisplay", list);
		return "ViewDetails";
	}
	
	@RequestMapping("addItem")
	public String addItem()
	{
		return "CreateItem";
	}
	@RequestMapping("DeleteItem")
	public String deleteItem(Model model)
	{
		List<SuperMarket>list=	repo.findAll();
		
		model.addAttribute("listToDisplay", list);
		return "DeleteItem";
	}
	
	@RequestMapping("details")
	public String details(
			@RequestParam("name") String name,
			@RequestParam("quantity") String quantity,
			@RequestParam("dateOfAdding") String dateOfAdding)
	{
		
		SuperMarket market=new SuperMarket();
	
		market.setName(name);
		market.setQuantity(quantity);
		market.setDateOfAdding(dateOfAdding);
		
		repo.save(market);
		return "home";
	}
	
	
	
	@PostMapping("create")
	public String home(@RequestParam("choice")int choice) {
    if(choice==1) {
    	return "redirect:/list";
    }	
    else if(choice==2) {
    	return "redirect:/addItem";
    }
    else
    {
    	return "redirect:/DeleteItem";
    }
		
	
	
	
	}

}
