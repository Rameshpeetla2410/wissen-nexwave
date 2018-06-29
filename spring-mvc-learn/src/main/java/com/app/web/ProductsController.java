package com.app.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jdk.internal.util.xml.impl.Input;

@Controller
@RequestMapping("/products")
public class ProductsController {

	@Autowired
	private ProductFormValidator validator;

	// @RequestMapping(value="/products",method=RequestMethod.POST)
	// @PostMapping
	// public String addNewProduct(
	// @RequestParam String name,
	// @RequestParam double price,
	// @RequestParam String desc) {
	//
	// System.out.println(name);
	// System.out.println(price);
	// System.out.println(desc);
	//
	// // ModelAndView mav=new ModelAndView();
	// // mav.setViewName("pm-view");
	// // return mav;
	//
	// return "pm-view";
	// }

	// -----------------------------------------------------------------

	@PostMapping
	public String addNewProduct(@ModelAttribute @Valid ProductForm form, BindingResult result) {

		//validator.validate(form, result);

		if (result.hasErrors()) {
			System.out.println("Invalid Form Input.");
			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError error : errors) {
				System.out.println(error);
			}
		}
		System.out.println(form);
		return "pm-view";
	}

}
