class Bank{
	 int getBalance() {
		 return 0;
	 }
}

class BankA extends Bank{
	int getBalance(){
		return 100;
	}
}

class BankB extends Bank{
	int getBalance(){
		return 150;
	}
}

class BankC extends Bank{
	int getBalance(){
		return 200;
	}
}

public class Banks9 {

	public static void main(String[] args) {
		BankA bankA = new BankA();
		System.out.println("Amount deposited in Bank A is $"+ bankA.getBalance());
		
		BankB bankB = new BankB();
		System.out.println("Amount deposited in Bank B is $"+ bankB.getBalance());
		
		BankC bankC = new BankC();
		System.out.println("Amount deposited in Bank C is $"+ bankC.getBalance());
		
	}

}
