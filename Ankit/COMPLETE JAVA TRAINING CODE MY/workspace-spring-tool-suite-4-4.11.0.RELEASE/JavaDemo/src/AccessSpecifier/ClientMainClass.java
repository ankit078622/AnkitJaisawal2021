package AccessSpecifier;

public class ClientMainClass {
	public static void main(String args[]) {
		PrivateDemo privateDemo=new PrivateDemo();
		//privateDemo.show();
		//privateDemo.show1();
		privateDemo.setBalance(5000);
		int k=privateDemo.getBalance();
		
	}

}
