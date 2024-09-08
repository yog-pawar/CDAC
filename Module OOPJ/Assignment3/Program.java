package assign3;

import java.util.Scanner;

class LoanAmortizationCalculator {
	
	private int principal;
	private double Arate;
	private double Lterm;
	private double monthlypayment;
	private double totalamountpaid;
	Scanner sc = new Scanner(System.in);
	public void acceptRecord(){
		
		System.out.println("Enter principal");
		principal = sc.nextInt();
		System.out.println("Enter rate");
		Arate = sc.nextDouble();
		System.out.println("Enter term");
		Lterm = sc.nextDouble();
		
	}
	public void calculateMonthlyPayment() {
		
		double Mrate = Arate/12/100;
		double months = Lterm*12;
		double a = Mrate * Math.pow(1 + Mrate, months);
		double b= (Math.pow(1 + Mrate, months) - 1);
		this.monthlypayment = principal*(a/b);
		this.totalamountpaid = monthlypayment*months;
		
			
	}
	
	public void printRecord(){
		
		System.out.println("monthlypayment is  " +this.monthlypayment );
		System.out.println("total amount paid " +this.totalamountpaid);
	}
}

class Program{
	
	public static void main (String []args) {
		LoanAmortizationCalculator cal = new LoanAmortizationCalculator();
		
		cal.acceptRecord();
		cal.calculateMonthlyPayment();
		cal.printRecord();
		
	}
}


