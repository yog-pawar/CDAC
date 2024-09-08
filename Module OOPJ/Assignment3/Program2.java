package assignment3;

import java.util.Scanner;

class CompoundInterestCalculator{
	 
	double investment;
	double interestrate;
	double numofcomp;
	double years;
	double futureValue;
	double totalinterest;
	Scanner sc = new Scanner(System.in);
	void acceptRecord() {
		
		System.out.println("Enter an investment");
		investment = sc.nextDouble();
		System.out.println("Enter interestrate");
		interestrate =sc.nextDouble();
		System.out.println("Enter number of compounds");
		numofcomp = sc.nextDouble();
		System.out.println("Enter years of investment");
		years = sc.nextDouble();
			
	}
	
	void calculatefutvalue() {
		this.futureValue = investment * Math.pow((1+interestrate/numofcomp), (numofcomp*years));
		this.totalinterest = futureValue - investment;
	}
	
	void printRecord(){
		
		System.out.println("futurevalue is " +futureValue);
		
		System.out.println("totalinterest is  " +totalinterest);
	}
		
}


public class Program {

	public static void main(String[] args) {
		CompoundInterestCalculator comp = new CompoundInterestCalculator();
		comp.acceptRecord();
		comp.calculatefutvalue();
		comp.printRecord();
		
	}
}
