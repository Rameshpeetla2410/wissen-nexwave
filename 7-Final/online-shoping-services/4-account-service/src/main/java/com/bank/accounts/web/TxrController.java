package com.bank.accounts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bank.accounts.service.TxrService;

@CrossOrigin(origins="*")
@RestController
public class TxrController {

	@Autowired
	private TxrService txrService;

	@RequestMapping(value = "/api/txr",
			        method = RequestMethod.POST,
			        consumes= {"application/xml","application/json"},
			        produces= {"application/xml","application/json"})
	protected TxrResponse doPost(@RequestBody TxrRequest txrReq, BindingResult result) {
		
		
		txrService.txr(txrReq.getAmount(), txrReq.getFromAccNum(), txrReq.getToAccNum());
			// output\
		TxrResponse response = new TxrResponse(); // Model
		response.setMessage("Txr Success");
		
		return response;
	}

}
