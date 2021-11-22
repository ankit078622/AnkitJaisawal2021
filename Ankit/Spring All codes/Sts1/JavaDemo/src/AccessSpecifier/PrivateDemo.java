package AccessSpecifier;

public class PrivateDemo {

	private void show()
	{
		System.out.println("show");
	}
	private void show1() {
		System.out.println("show1");
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	private int balance=5000;
	
}
