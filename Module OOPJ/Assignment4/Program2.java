package assign4;

import java.util.Scanner;

class CompoundInterestCalculator{
	
	private	double	principal;
	private	double	annualInterestRate;
	private	double	numberOfCompounds;
	private	double years;
	private double futureValue; 
	private double totalinterest;
	
	public double getprincipal() {
		return principal;
	}
	public void setprincipal(double principal) {
		this.principal = principal;		
	}
	
	
	public double getannualInterestRate() {
		return annualInterestRate;
	}
	public void setannualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	
	public double getnumberOfCompounds() {
		return numberOfCompounds;
	}
	public void setnumberOfCompounds(double numberOfCompounds ) {
		this.numberOfCompounds= numberOfCompounds;
	}
	
	
	public double getyears() {
			return years;
		}
	public void setyears(double years ) {
			this.years= years;
	}
	
	
	public double getfuturevalue() {
		return futureValue;
	}
	public double gettotalinterest() {
		return totalinterest;
	}
	
	public void calculatefutvalue() {
		this.futureValue = principal * Math.pow((1+annualInterestRate/numberOfCompounds ), (numberOfCompounds *years));
		
		this.totalinterest = futureValue - principal;
	}
	
	
}
class CompoundInterestCalculatorUtil{
	CompoundInterestCalculator cic = new CompoundInterestCalculator();
	
	Scanner sc = new Scanner(System.in);
	
	 void acceptRecord() {
		 System.out.println("Enter principal");
		 cic.setprincipal(sc.nextDouble());
		 System.out.println("Enter interest rate");
		 cic.setannualInterestRate(sc.nextDouble());
		 System.out.println("Enter no of compnds");
		 cic.setnumberOfCompounds(sc.nextDouble());
		 System.out.println("Enter years of loan");
		 cic.setyears(sc.nextDouble());
	 }
	 
	 void printRecord() {
		 cic.calculatefutvalue();
		 System.out.println("The futurevalue is " +cic.getfuturevalue());
		 System.out.println("The total interest is " +cic.gettotalinterest());
	 }
	 	 
}

public class Program2 {

	public static void main(String[] args) {
		
		CompoundInterestCalculatorUtil cu = new CompoundInterestCalculatorUtil();
		cu.acceptRecord();
		cu.printRecord();
	}

}
