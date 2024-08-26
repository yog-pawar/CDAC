

//////////Section 2: Java Programming - Conditional Statements/////////


///Question 1: Grade Classification ///

class Grades { 
    public static void main(String[] args) { 

int score = 82;

if(score>=90){
System.out.println("A"); 
}

else if(score>=80 && score<=89){
System.out.println("B"); 
}

else if (score>=70 && score<=79){
System.out.println("C"); 
}

else if (score>=60 && score<=69){
System.out.println("D"); 
}

else{
System.out.println("F"); 
}

}
}


//Question 2: Days of the Week // 

class DayWeek {
	public static void main(String args[]){
		
		int day = 1;
		
		switch(day){
			case 1: System.out.println("Today is mon n week");
				break;
			case 2:
				System.out.println("Today is tues n week");
				break;
			case 3:
				System.out.println("Today is wedn n week");
				break;
			case 4:
				System.out.println("Today is thur n week");
				break;
			case 5:
				System.out.println("Today is fri n week");
				break;
			case 6:
				System.out.println("Today is sat n weekend");
				break;
			case 7:
				System.out.println("Today is sun n weekend");
				break;
			}

			}
			}
			


//Question 3: Calculator // 
			
import java.io.*;
import java.util.*;

class calculator {
    public static void main(String[] args) {
        int a, b;
		char operator;
        String operation;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number:");
        a = sc.nextInt();
        System.out.print("Enter a second number:");
        b = sc.nextInt(); 
		System.out.print("Enter operator:");
        operator = sc.next().charAt(0);
		//System.out.print("Enter the operation:");
        //operation = sc.next();
		
        switch (operator) {

            case '+':
                System.out.println("Addition is" + (a + b));
                break;

            case '-':
                System.out.println("Substraction is" + (a - b));
                break;

            case '*':
                System.out.println("Multiplication is" + (a * b));
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Error: Divide by zero is not allowed!");
                } else {
                    System.out.println("Dividation is" + (a / b));

                }
                break;

            case '%':
                System.out.println("Modulation is" + (a % b));
                break;
            default:
                System.out.println("Invalid request!");
                break;

        }
        sc.close();
    }
}


///Question 5: Student Pass/Fail Status with Nested Switch ///

class Passfail { 
    public static void main(String[] args) { 

int sub1 = 50;
int sub2 = 20;
int sub3 = 30;

if(sub1>40 && sub2>40 && sub3>40){
System.out.println("passed in all"); 
}

else if(sub1>40 && sub2<=40 && sub3<=40){
System.out.println("failed in 2 subjects"); 
}

else if(sub2>40 && sub1<=40 && sub3<=40){
System.out.println("failed in 2 subjects"); 
}

else if(sub3>40 && sub1<=40 && sub2<=40){
System.out.println("failed in 2 subjects"); 
}

else{
System.out.println("Failed in all subjects"); 
}

}
}


////Question 4: Discount Calculation////  

class Discount {
    
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter price ");
    int price =sc.nextInt();
    System.out.println("Enter 1 if membership present else 0");
int membership = sc.nextInt();
    if(price >=1000){
        if(membership==1){
            System.out.println("Discount is : " + ((price*25)/100));
        }else{
            System.out.println("Discount is : "+(price*20)/100);
        }
    }else if(price >=500 && price<=999){
        if(membership==1){
            System.out.println("Discount is : "+(price*15)/100);
        }else{
        System.out.println("Discount is : "+(price*10)/100);
    }
    }else{
        if(membership==1){
System.out.println("Discount is : "+(price*10)/100);
        }else{
        System.out.println("Discount is : "+(price*5)/100);
    }
    }
}
}



