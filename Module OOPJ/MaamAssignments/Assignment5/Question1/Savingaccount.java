package assign5_1;

class Savingaccount extends Bankaccount{
	
	
	@Override
	public void withdraw() {
		
		System.out.println("Enter withdraw amount");
		double wamount = sc.nextDouble();
		if(wamount > balance) {
			System.out.println("insuffiecient balance");
		}
		else if(wamount > 5000) {
			System.out.println("Withdrawl limit is 5000");
		}
	else if(wamount < balance) {
			
			System.out.println("Remaining bal is "+(balance-wamount));
		}	
	}
		
}
