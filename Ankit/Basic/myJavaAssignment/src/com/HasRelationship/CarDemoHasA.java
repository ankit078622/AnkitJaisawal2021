package com.HasRelationship;
//First class
public class CarDemoHasA{
	//Instance members of clas car
	private String color;
	private int maxSpeed;
	
	//Getter and setter method
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	//creating method for printing the car details
	public void carDetails() {
		//printing information
		System.out.println("Car Color : "+color+"\nCar maxSpeed : "+maxSpeed);
	}
     
	//Main method 
	public static void main(String args[]) {
		CarDemoHasA car=new CarDemoHasA();
		car.setColor("Black");
		car.setMaxSpeed(250);
		
		//Calling carDetails
		car.carDetails();
		
		// Creating object of child class car category which is Tesla
		Tesla tesla=new Tesla();
		tesla.teslaDemo();
		
	}
	
}


//Second class category of car
class Tesla extends CarDemoHasA  {
	
	// what happened with the engine car
    public void teslaDemo()
    {
        //Creating an object of Engine type
    	Engine engine=new Engine();
    	engine.start();
    	engine.stop();
    }
}
  
//Third Class
class Engine {
  
    // To start a engine
    public void start()
    {
        // Print statement when engine starts
        System.out.println("Car has Started:");
    }
  
    // To stop a engine
    public void stop()
    {
        // Print statement when engine stops
        System.out.println("Car has Stopped:");
    }
    
   
  
}