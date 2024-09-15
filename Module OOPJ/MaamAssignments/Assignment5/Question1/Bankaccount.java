package assign5_1;

import java.util.Scanner;

public class Bankaccount {
	
     public double balance = 1000; 
	 private double damount;
	 
	 Scanner sc = new Scanner (System.in);
	 
	public void deposit() {
		System.out.println("please enter deposit amount");
		damount = sc.nextDouble();
		this.balance = balance + damount;
		System.out.println("current balance is "+this.balance);
	}
	
	public void withdraw() {
		
	}
	
	
	
	}




