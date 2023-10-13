package com.example.demo.endpoint.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.obj.Quote;
import com.example.demo.service.QuoteService;

@RestController
public class DemoEndPoint {

	@RequestMapping("/")
	public String hello() {
		return "hello world";
	}
	
	private QuoteService quoteService;
	
	//this will tell spring to inject the bean created
	public DemoEndPoint(QuoteService quoteService) {
		this.quoteService = quoteService;
	}
	
	@RequestMapping("/quote")
	public Quote getQuote() {
		return this.quoteService.getQuote();
	}
	
	@RequestMapping(value="/quote", method=RequestMethod.POST)
	public void addQuote(@RequestBody Quote quote) {
		this.quoteService.addQuote(quote);
	}
	
}
