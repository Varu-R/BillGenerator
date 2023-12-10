package com.pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pizza pz=new Pizza(false) ;
//		pz.getPizza();
//		pz.addExtraCheese();
//		pz.addExtraTopping();
//		pz.takeAway();
//		pz.getBill();	
		IndianPizza ip = new IndianPizza(true);
		ip.addExtraCheese();
		ip.addExtraTopping();
		ip.getBill();
	}

}
