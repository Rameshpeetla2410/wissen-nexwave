package com.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController1 {

	// Request mapping methods
//
//	@RequestMapping(value = "/todos", method = RequestMethod.GET)
//	public ModelAndView m1() {
//		// ..........
//		System.out.println("DemoController1:: m1() - GET /todos");
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("todos-view");
//		return modelAndView;
//	}
//
//	
//	@RequestMapping(value = "/todos", method = RequestMethod.POST)
//	public ModelAndView m2() {
//		// ..........
//		System.out.println("DemoController1:: m2() - POST /todos");
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("todos-view");
//		return modelAndView;
//	}
//	
//	
//	@RequestMapping(value = "/todos", method = RequestMethod.GET, params = { "size","!sort" })
//	public ModelAndView m3() {
//		// ..........
//		System.out.println("DemoController1:: m3() - GET /todos with size param");
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("todos-view");
//		return modelAndView;
//	}
//
//	@RequestMapping(value = "/todos", method = RequestMethod.GET, headers= {"!my-header"})
//	public ModelAndView m4() {
//		// ..........
//		System.out.println("DemoController1:: m4() - GET /todos with my-header");
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("todos-view");
//		return modelAndView;
//	}

	//------------------------------------------------------------------------
	
//	@RequestMapping(value = "/todos", method = RequestMethod.GET)
//	public ModelAndView m1(@RequestParam(name="size",required=false,defaultValue="10") int size) {
//		// ..........
//		System.out.println("DemoController1:: m1() - GET /todos - "+size);
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("todos-view");
//		return modelAndView;
//	}
	
	//-----------------------------------------------------------------------------

//	@RequestMapping(value = "/todos/{todoId}", method = RequestMethod.GET)
//	public ModelAndView m1(@PathVariable String todoId) {
//		// ..........
//		System.out.println("DemoController1:: m1() - GET /todos/{todoId} - ");
//		System.out.println(todoId);
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("todos-view");
//		return modelAndView;
//	}
	
	//-----------------------------------------------------------------------------
	

//	@RequestMapping(value = "/todos/{todoId}", method = RequestMethod.GET)
//	public ModelAndView m1(@PathVariable String todoId,@CookieValue String JSESSIONID) {
//		// ..........
//		System.out.println("DemoController1:: m1() - GET /todos/{todoId} - ");
//		System.out.println(todoId);
//		System.out.println(JSESSIONID);
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("todos-view");
//		return modelAndView;
//	}
	
	//-----------------------------------------------------------------------------

//
//	@RequestMapping(value = "/todos", method = RequestMethod.GET)
//	public ModelAndView m1(HttpServletRequest req,HttpServletResponse resp) {
//		// ..........
//		System.out.println("DemoController1:: m1() - GET /todos - ");
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("todos-view");
//		return modelAndView;
//	}
	
	//-----------------------------------------------------------------------------
	
	
//	
//
//	@RequestMapping(value = "/todos", method = RequestMethod.GET)
//	public ModelAndView m1(Locale locale) {
//		// ..........
//		System.out.println("DemoController1:: m1() - GET /todos - "+locale.toString());
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("todos-view");
//		return modelAndView;
//	}
//	
	
	//---------------------------------------------------------------------------------
	

	@RequestMapping(value = "/todos", method = RequestMethod.GET)
	public ModelAndView m1(@RequestHeader("my-header") String headerValue) {
		// ..........
		System.out.println("DemoController1:: m1() - GET /todos - "+headerValue);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("todos-view");
		return modelAndView;
	}
//	
	
	
}
