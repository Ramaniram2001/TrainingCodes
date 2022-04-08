package com.training;
import java.util.*;
import com.training.exception.RangeCheckedException;
import com.training.model.Student;
import com.training.services.ExceptionHandling;
import com.training.services.StudentService;

public class Application {

	public static void main(String[] args) {
		
		Student ram=null;
		try {
			ram = new Student(1010,"emi",98);
		} catch (RangeCheckedException e1) {
			//TODO Auto-generated catch block
			e1.printStackTrace();
		}
		StudentService service=new StudentService(ram);
		//System.out.println(service.sendDetails());
		
		
		StudentService service2=new StudentService(ram);
		try {
			//System.out.println("grade " +service2.findRank());
		} catch (Throwable e) {
			
//			e.printStackTrace();
		//System.err.println("name is not passed");
		}
		
		ExceptionHandling exHandling=new ExceptionHandling();
		//exHandling.usingArrayIndexException(args);
	
		//exHandling.usingNumberFormatException("fortyfive");
		
	
		//exHandling.usingFinallyBlock();
		try {
			System.out.println(exHandling.underStandFinallyBlock());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("print something");
			e.printStackTrace();
		}
		
		try(Scanner scan=new Scanner(System.in)){
			
			System.out.println("enter number");
			int num=scan.nextInt();
			System.out.println(num);
			
		}catch(Exception e) {
			e.printStackTrace();
		

		}
	}
}

	
