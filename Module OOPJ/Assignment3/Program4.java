import java.util.Scanner;

class DiscountCalculator {
	private double ogprice;
	private double dispercnt;
	private double disamount;
	private double finalprice;
	
	Scanner sc = new Scanner (System.in);
	
	void acceptRecord() {
		System.out.println("Enter original price");
		this.ogprice = sc.nextDouble();
		System.out.println("Enter discount percentage");
		this.dispercnt = sc.nextDouble();
	}
	
	void calculateDiscount(){
		this.disamount = ogprice * (dispercnt / 100);
		this.finalprice = ogprice - disamount;
	}
	
	void printRecord()
	{
		System.out.println("Discount amount is " +this.disamount);
		System.out.println("Final price is " +this.finalprice);
	}
}


public class Program {

	public static void main(String[] args) {
		DiscountCalculator dcal = new DiscountCalculator();
		dcal.acceptRecord();
		dcal.calculateDiscount();
		dcal.printRecord();
	}

}
