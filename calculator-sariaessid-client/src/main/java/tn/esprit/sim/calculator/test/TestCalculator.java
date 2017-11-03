package tn.esprit.sim.calculator.test;
   
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.sim.calculator.services.CalculatorServicesRemote;



public class TestCalculator{  

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();

		CalculatorServicesRemote proxy = (CalculatorServicesRemote) context.lookup(
				"calculator-sariaessid-ear/calculator-sariaessid-ejb/CalculatorServices!tn.esprit.sim.calculator.services.CalculatorServicesRemote");

		System.out.println("Addition bb:" + proxy.addition(1, 2));
		System.out.println("Substraction :" + proxy.substraction(2, 1));
		System.out.println("Multiplication :" + proxy.multiplication(1, 2));
		System.out.println("Division :" + proxy.division(1, 2));
		
		

		
	}

}