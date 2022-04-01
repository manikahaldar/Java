
class ATM{
	synchronized public void checkBalance(String name){
		System.out.println(name + " Checking");
		
		try{
			Thread.sleep(10);
		}catch(Exception e){
			System.out.println("Balance");
		}
	}
	synchronized public void withdraw(String name,int amount){
		System.out.println(name + " Withdrawing");
		
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println(amount);
		}
	}
}

class Customer extends Thread{
	String name;
	int amount;
	ATM atm;
	Customer(String n,ATM a, int amt){
		name = n;
		atm = a;
		amount = amt;
	}
	public void useATM(){
		atm.checkBalance(name);
		atm.withdraw(name,amount);
	}
	public void run(){
		useATM();
	}
}

public class Test10{
	public static void main(String args[]){
		ATM obj = new ATM();
		Customer obj1 = new Customer("Manika",obj,2000);
		Customer obj2 = new Customer("Madhu",obj,3000);
		
		obj1.start();
		obj2.start();
		
	}
}