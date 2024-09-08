package assignm3;

import java.util.Scanner;

class BMITracker{
	
	double weight;
	double height;
	double BMI;
	String Bmitype;
	Scanner sc = new Scanner(System.in);
	void acceptRecord() {
		
		System.out.println("Enter weight");
		weight = sc.nextDouble();
		System.out.println("Enter height");
		height = sc.nextDouble()
;	}
	void calculateBMI() {
		 this.BMI= weight / (height*height);
		 
	}
	
	void classifyBMI() {
		
		if (this.BMI < 18.5) {
			this.Bmitype = "Underweight";
		}
		else if (18.5 < this.BMI && this.BMI < 24.9) {
			this.Bmitype = "Normalweight";
		}
		else if (25 < this.BMI && this.BMI < 29.9) {
			this.Bmitype = "Overweight";
		}
		else {
			this.Bmitype = "Obese";
		}
			 

	}
	
	void printRecord() {
		System.out.println("BMI is" +this.BMI);
		System.out.println("So you are "+this.Bmitype);
	}
}

public class Program {

	public static void main(String[] args) {
		BMITracker bmi = new BMITracker();
		
		bmi.acceptRecord();
		bmi.calculateBMI();
		bmi.classifyBMI();
		bmi.printRecord();

	}
}
