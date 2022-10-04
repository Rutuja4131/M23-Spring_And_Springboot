package com.cg.springioc;

public class Airtel implements Sim{
	
	Airtel(){
		System.out.println("Airtel Constructor Call");
	}

	public void calling() {
		System.out.println("Calling Using Airtel Sim");
		
	}

	public void data() {
		System.out.println("Data Using Airtel Sim");
	}
}
