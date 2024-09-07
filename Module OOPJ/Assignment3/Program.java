import java.util.Scanner;

class TollBoothRevenueManager{
	double cartoll;
	double trucktoll;
	double motortoll;
	double noofcar;
	double nooftruck;
	double noofmotor;
	double totalnoofvehicles;
	double totalrevenue;
	
	Scanner sc = new Scanner(System.in);
	void acceptRecord(){
		System.out.println("Enter no of cars");
		this.noofcar =sc.nextDouble();
		System.out.println("Enter no of truck");
		this.nooftruck = sc.nextDouble();
		System.out.println("Enter no of motorcycles");
		this.noofmotor = sc.nextDouble();
	}
	void setTollRates(){
		System.out.println("Enter Car toll");
		this.cartoll = sc.nextDouble();
		System.out.println("Enter truck toll");
		this.trucktoll = sc.nextDouble();
		System.out.println("Enter motorcycle toll");
		this.motortoll = sc.nextDouble();
	}
	void calculateRevenue(){
		this.totalnoofvehicles = this.noofcar+this.nooftruck+this.noofmotor;
		this.totalrevenue =(this.cartoll*this.noofcar)+(this.trucktoll*this.nooftruck)+(this.motortoll*this.noofmotor);
	}
	void printRecord() {
		System.out.println("Total number of vehicles is " +this.totalnoofvehicles);
		System.out.println("Total revenue is " +this.totalrevenue);
	}
	
}

public class Program {

	public static void main(String[] args) {
		TollBoothRevenueManager trm = new TollBoothRevenueManager();
		trm.acceptRecord();
		trm.setTollRates();
		trm.calculateRevenue();
		trm.printRecord();

	}

}
