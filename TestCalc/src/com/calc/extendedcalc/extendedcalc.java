package com.calc.extendedcalc;
import com.calc.main.simplecalc;

public class extendedcalc extends simplecalc{
	int c;
	
	public static void main(String args[]){
		//create a class 
		extendedcalc ec=new extendedcalc();
		ec.a=10;
		ec.b=20;
		ec.c=30;
		//do u see error for a and b?
		//why?
		//because the class belongs to a different package
		//and the variables are private
		
		//solution is to make them public or 
		//include them in one package
		//the variables are now public and can be accessed by any program
		
		System.out.println("Values are "+ec.a+" " + ec.b+" " +ec.c);
		System.out.println("Addition with two variables is"+ec.add(12,22));
		System.out.println("Addition with three variables is"+ec.add(12,22,34));
		
	}

}
