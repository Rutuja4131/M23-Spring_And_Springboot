package com.cg.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//IOC = Inversion of control
public class Mobile {

	public static void main(String[] args) {
//		Airtel a=new Airtel();
//		a.calling();
//		a.data();
//		
//		Jio j=new Jio();
//		j.calling();
//		j.data();
		
//		ApplicationContext is a interface  And   
//		ClassPathXmlApplicationContext it is a implementable class for this interface
//		it is called as Constructor
		ApplicationContext a= new ClassPathXmlApplicationContext("beans.xml");

		Sim obj=a.getBean("sim",Sim.class);
		obj.calling();
		obj.data();
		
//		Airtel obj=(Airtel)a.getBean("Idairtel");
//		obj.calling();
//		obj.data();
//		
//		Jio obj1=(Jio)a.getBean("Idjio");
//		obj1.calling();
//		obj1.data();
		
		
		
		System.out.println("Thank You!!");
	}

}
