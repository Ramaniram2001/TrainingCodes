package com.training;
import com.training.model.*;
public class Application {
	
	public static void printPremium(Insurance object) {
		System.out.println("premium is "+ object.calculatePremium());
		
	}

	public static void main(String[] args) {
		VehicleInsurance car=new VehicleInsurance(1010,"ramesh","car",2019);
        printPremium(car);
	
		VehicleInsurance car2=new VehicleInsurance(1010,"ramesh","bike",2021);
        printPremium(car2);
        
        LifeInsurance life = new LifeInsurance(3423,"ram",44);
        printPremium(life);
        
        String[] illness= {"ent","thyroid"};
        HealthInsurance health=new HealthInsurance (34223,"ram",illness);
        printPremium(health);
        
	}
}
