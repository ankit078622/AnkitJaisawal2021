/*Print the sum , difference and product of two complex number by creating a class named 'Complex'
 with separate methods for each operation whose real and imaginary parts are entered by user. */
package classobject;

import java.io.DataInputStream;
import java.io.IOException;
class ArithmeticOperation{
	
	//Addition of two complex number
	int addCoplexNumber(int number1,int number2){
		return number1+number2;		
	}
	//Subtraction of two complex number
	int subtractCoplexNumber(int number1,int number2){
		return number1-number2;		
	}
	//Multiply two complex number
	int multiplyCoplexNumber(int number1,int number2,int number3,int number4){
		return ((number1*number2)+(number3*number4));		
	}
}
public class Complex {
	public static void main(String args[])throws IOException {
		int realNum1,imaginaryNum1;
		int realNum2,imaginaryNum2;
		DataInputStream dataInputStream=new DataInputStream(System.in);
		//taking input first complex number
		System.out.print("Enter real number1 : ");
		realNum1=Integer.parseInt(dataInputStream.readLine());
		System.out.print("Enter imaginary number1 : ");
		imaginaryNum1=Integer.parseInt(dataInputStream.readLine());
		
		//Taking 2 complex number input by user
		System.out.print("Enter real number2 : ");
		realNum2=Integer.parseInt(dataInputStream.readLine());
		System.out.print("Enter imaginary number2 : ");
		imaginaryNum2=Integer.parseInt(dataInputStream.readLine());	
		
		int temp1,temp2; // It used to store temporary value
		
		//Creating object for sum
		ArithmeticOperation arithmeticOperation=new ArithmeticOperation();
		temp1=arithmeticOperation.addCoplexNumber(realNum1, realNum2);
		temp2=arithmeticOperation.addCoplexNumber(imaginaryNum1,imaginaryNum2);
		System.out.println("Sum of two complex number is "+temp1+"+"+temp2+"i");
		
		//Creating object for subtract
		ArithmeticOperation arithmeticOperation1=new ArithmeticOperation();
		temp1=arithmeticOperation1.subtractCoplexNumber(realNum1, realNum2);
		temp2=arithmeticOperation1.subtractCoplexNumber(imaginaryNum1,imaginaryNum2);
		if(imaginaryNum2>imaginaryNum1)
		{
		System.out.println("Subtraction of two complex number is "+temp1+temp2+"i");
		}
		else
		{
			System.out.println("Subtraction of two complex number is "+temp1+"+"+temp2+"i");
		}
		
		//Creating object for multiplication 
		//Example (3+2i)(2+4i)=6+12i+4i+8i2  as we khow i2=-1
		ArithmeticOperation arithmeticOperation2=new ArithmeticOperation();
		temp1=arithmeticOperation2.multiplyCoplexNumber(realNum1,realNum2,imaginaryNum1,-imaginaryNum2);
		temp2=arithmeticOperation2.multiplyCoplexNumber(realNum1,+imaginaryNum2,imaginaryNum1,realNum2);
		System.out.println("Multiplication of two complex number is "+temp1+"+"+temp2+"i");
	}

}
