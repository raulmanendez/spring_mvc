package muk.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import muk.spring.mvc.beans.Order;

@Controller
@RequestMapping("/order/")
public class OrderController {

	@GetMapping("place")
	public ModelAndView placeOrder(Order order,ModelAndView mv)
	{
		mv.setViewName("order_place");
		return mv;
		
	}
	
	@PostMapping("save")
	public ModelAndView saveOrder(Order order,ModelAndView mv,RedirectAttributes ra)
	{
		ra.addFlashAttribute("order",order);
		mv.setViewName("redirect:view");
		//if we don't redirect then refreshing will again run this method:repitition
		//but request attributes are lost in such way
		return mv;
		
	}
	
	@RequestMapping("view")
	//to avoid request attributes loss use RedirectAttributes
	public ModelAndView viewOrder(ModelAndView mv)
	{
		mv.setViewName("order_view");
		return mv;
		
	}
	
	@ModelAttribute
	public void setPageTitle(Order order,ModelAndView mv)
	{
		mv.addObject("title","Order Place");
	}
}
