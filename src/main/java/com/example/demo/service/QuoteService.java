package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.demo.obj.Quote;

public class QuoteService {
	private List<Quote> quotes = new ArrayList<Quote>();
	
//	public QuoteService() {
//		this.quotes.add(new Quote("Is thath a police?","Im calling the weed"));
//		this.quotes.add(new Quote("Road work ahead","Im sure hope it does"));
//		this.quotes.add(new Quote("Fuck you","Chicken strips"));
//	}
	
	public QuoteService() {}
	
	public Quote getQuote() {
		Random rn = new Random();
		int select = rn.nextInt(this.quotes.size());
		return this.quotes.get(select);
	}
	
	public void addQuote(Quote quote) {
		this.quotes.add(quote);
	}
	
}
