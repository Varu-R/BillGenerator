package com.pizza;

public class Pizza {
	private int price;
	private Boolean veg;
	
	private int extraCheesePrice =100;
	private int extraToppingsPrice =100;
	private int backPack =10;
	private int basePizzaPrice;
	
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingsAdded = false;
	private boolean isOptedForTakeAway = false;
	public Pizza(Boolean veg) {
		super();
		this.veg = veg;
		if(this.veg) {
			this.price=250;
		}else {
			this.price=400;
		}
		basePizzaPrice= this.price;
	}
	
//	public void getPizza() {
//		System.out.println(this.price);
//	}
	public void addExtraCheese() {
		isExtraCheeseAdded =true;
		
		this.price += extraCheesePrice;
	}
	public void addExtraTopping() {
		isExtraToppingsAdded = true;
		
		this.price += extraToppingsPrice;
	}
	public void takeAway() {
		isOptedForTakeAway = true;
		
		this.price += backPack;
	}
	public void getBill() {
		String bill ="";
		if(isExtraCheeseAdded) {
			bill +="Extra cheese is added: "+extraCheesePrice+"\n";
		}
		if(isExtraToppingsAdded) {
			bill += "Extra toppings is added: "+extraToppingsPrice+"\n";
		}
		if(isOptedForTakeAway) {
			bill += "Take away added: "+backPack+"\n";
		}
		bill += "Bill: "+this.price+"\n";
		
		System.out.println(bill);
	}
	
	
	
}
