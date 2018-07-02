package com.bank.mts.web;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.bank.mts.service.TxrService;

@Controller
public class TxrController {

	@Autowired
	private TxrService txrService;

	@RequestMapping(value = "/txr", method = RequestMethod.POST)
	protected String doPost(@ModelAttribute TxrRequest txrReq, BindingResult result, Map<String, TxrResponse> model) {
		TxrResponse response = new TxrResponse(); // Model
		if (!result.hasErrors()) {
			txrService.txr(txrReq.getAmount(), txrReq.getFromAccNum(), txrReq.getToAccNum());
			// output
			response.setMessage("Txr success");
		} else {
			response.setMessage("Txr failed or invalid input");
		}
		model.put("model", response);
		return "txr-status";
	}

}
