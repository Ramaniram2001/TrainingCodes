package com.training;
import com.training.ifaces.CheckCondition;
import com.training.ifaces.Conditional;
import com.training.ifaces.Function;
import com.training.services.CurrencyConverter;

public class Application {

	public static void main(String[] args) {
		Function conv=new CurrencyConverter();
		double response=conv.apply(200);
		System.out.println(response);
		System.out.println(conv.apply(300));
		
		
		if (conv instanceof CheckCondition) {
			CheckCondition obj=(CheckCondition)conv; //casting
            System.out.println("Is discount allowed '="+obj.test(300));
            
		}
		Conditional condObj =new DiscountCalculator();
		System.out.println(condObj.test(6000));
		System.out.println(condObj.test(6000));
		
		
		
		

	} 

}
