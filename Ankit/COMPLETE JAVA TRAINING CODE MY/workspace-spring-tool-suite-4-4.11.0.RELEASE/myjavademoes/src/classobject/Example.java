package classobject;

public class Example {
	public static void main(String args[]) {
		
		Animal a;
		Dog dog=new Dog("Tom");
		a=dog;
		a.TypeOf();
	}

}

abstract class Animal{
	String name;
	Animal(String name)	{//String Tom
		this.name=name;
	}
	abstract void TypeOf();
}
class Dog extends Animal{
	Dog(String name) {
		super(name);
	}
	void TypeOf() {
		System.out.println(name+" is dog");
	}
}