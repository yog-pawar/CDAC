                        //////Assignment 3 - Section 3////
 
  //Question 1//
 class Sumofnatural { 
    public static void main(String[] args) { 
	int sum=0;
	
	for(int i=1; i<=50; i++){
		sum = sum+i;
	}
	System.out.println("sum of natural numbers is " +sum);

	}
 }
 
 
   //Question 2//
 class Factorial { 
    public static void main(String[] args) { 
	int a=10;
	int fact=1;
	
	for(int i=1; i<=a; i++){
		fact= fact*i;
	}
	System.out.println("factorial of " +a+" is" +fact);
	}
 }
 
 
   //Question 3//
 class Multiple { 
    public static void main(String[] args) { 
	int num =7;
	
	for(int i=1; i<=100; i++){
		if(i% num==0){
		System.out.println("multiples of number "+num+" is " +i);
	}
	}
	}
 }
 
 
   //Question 4//
 class Revdigits { 
    public static void main(String[] args) { 
	int num[] = {1,2,3,4};
	
	System.out.print("Rev of number is: ");
	System.out.print(num[3]);
	System.out.print(num[2]);
	System.out.print(num[1]);
	System.out.print(num[0]);
	}
 }
 
 /*   //Question 6//
 class Primenum { 
    public static void main(String[] args) { 

	for(int i=1; i<20; i++){
		if(i>1 && i%2==0){
			System.out.println("prime number is: " +i);
		}
	}
	}
 }*/


 // Question 8//
   class Printit{ 
    public static void main(String[] args) { 
	 int i=10;    
    do{    
        System.out.println(i);    
    i--;    
    }while(i>=0); 
	}
	}
   



      // Question 10 //
   class Evennum { 
    public static void main(String[] args) { 
	
	System.out.println("Even numbers are");
	for(int i=1; i<=50; i++){
		
		if(i>1 && i%2==0){
			
			System.out.println(i);
		}
	}
	}
   }


 //Question 12//
 class Pattern12 { 
    public static void main(String[] args) { 
	
	for (int i = 0 ; i<5 ; i++) {                     // row
		
			for(int j = 0 ; j<5 ; j++)               // column
			{
				System.out.print("*");
			}
			System.out.println("");
		}
    } 
} 

//Question 14//
 
 class Pattern14 { 
    public static void main(String[] args) { 
	
	for (int i = 0 ; i<10 ; i++) {  	// row
		  if(i%2==0 && i>2){                  //to print 2 and not ahead
			  continue;
		  }
			for(int j = 0 ; j<i ; j++)               // column
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
} 

//Question 23//

class Pattern23 { 
    public static void main(String[] args) { 
	
	for (int i = 0 ; i<5 ; i++) {                     // row
		
			for(int j = 0 ; j<5 ; j++)               // column
			{
				System.out.print(i+1);
			}
			System.out.println("");
		}
    } 
} 


//Question 24//
 
 class Pattern24 { 
    public static void main(String[] args) { 
	
	for (int i = 1 ; i<=5 ; i++) {                     // row
		
			for(int j = 1 ; j<=i ; j++)               // column
			{
				System.out.print(i);
			}
			System.out.println("");
		}
	}
} 


//Question 25//
 
 class Pattern25 { 
    public static void main(String[] args) { 
	
	for (int i = 1 ; i<=5 ; i++) {                     // row
		
			for(int j = 1 ; j<=i ; j++)               // column
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}
} 


   //Pattern 26//
   
class Pattern26 { 
    public static void main(String[] args) { 
	int k =1;
	for (int i = 1 ; i<=5 ; i++) {                     // row
		
			for(int j = 1 ; j<=i ; j++)               // column
			{
				System.out.print(k++ +" ");
			}
			System.out.println("");
		}
	}
} 





//Question 17//

class Pattern17 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
			
            for (int j = 1; j <= i; j++) {
			System.out.print(" ");}
			
			for (int j = 5; j >= i; j--) {
			System.out.print("* ");}
               
            System.out.println();
		}
        }
    }


//Question 15//

class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
			
            for (int j = 5; j >= i; j--) {
			System.out.print(" ");}
			
			for (int j = 1; j <= i; j++) {
			System.out.print("* ");}
               
            System.out.println();
		}
        }
    }


//Question 16//

class Pattern16 {
    public static void main(String[] args) {
        int n =9;
        for (int i = 1; i <= n; i++) {
			if(i%2==0){
				continue;
			}
            for (int j = 9; j >= i; j--) {
			System.out.print(" ");}
			
			for (int j = 1; j <= i; j++) {
			System.out.print("* ");}
               
            System.out.println();
		}
        }
    }
	
	
  //Question 19//
 
 class Pattern19 { 
    public static void main(String[] args) { 
	
	for (int i = 1 ; i<=5 ; i++) {                     // row
		
			for(int j = 1 ; j<=i ; j++)               // column
			{
				if(j>1){
				System.out.print("*");	
				}
				System.out.print(j);
			}
			
			System.out.println("");
		}
	}
} 


//Question 20//
 
 class Pattern20 { 
    public static void main(String[] args) { 
	
	for (int i = 5 ; i>=1 ; i--) {                     // row
		
			for(int j = 5 ; j>=i ; j--)               // column
			{
				if(j<5){
				System.out.print("*");
			}
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}


//Question 21//
 class Pattern21 { 
    public static void main(String[] args) { 
	
	int n =9;
        for (int i = 1; i <= n;i= i+2) {
			
			for (int j = 1; j <= i; j=j+2){
			if(j>1){
				System.out.print("*");
			}
			
			System.out.print(j);
			}
            System.out.println();
		}
	}
}