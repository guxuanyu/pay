package com.ganger;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PayController {

	@Autowired
	PayService payService;
	
	private String record="";
	
	@GetMapping
	public ResponseVo get(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		return ResponseUtil.success(payService.getPays());
	}
	
	@PostMapping
	public ResponseVo create(PayForm payForm,BindingResult bindingResult,HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		if(bindingResult.hasErrors()) {
			throw new RuntimeException(bindingResult.getFieldError().getDefaultMessage());
		}
		payService.newPay(payForm);
		return ResponseUtil.success();
	}
	
	@PostMapping("record")
	public ResponseVo createRecord(String txt,HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		if(txt!=null&& txt.length()>0) {
		this.record=txt;
		}
		return ResponseUtil.success();
	}
	
	@GetMapping("record")
	public ResponseVo getRecord(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		return ResponseUtil.success(this.record);
	}
	
}
