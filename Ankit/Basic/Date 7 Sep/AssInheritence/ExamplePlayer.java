package com.AssInheritence;

abstract class Player{
	String name;
	Player(String name)	{
		this.name=name;
	}
	abstract void play();
}
class CricketPlayer extends Player{
	CricketPlayer(String name) {
		super(name);
	}
	void play() {
		System.out.println(name+"Cricket Player");
	}
}
class FootbalPlayer extends Player{
	FootbalPlayer(String name) {
		super(name);
	}
	void play() {
		System.out.println(name+"Cricket Player");
	}
}

public abstract class ExamplePlayer {
 
	public static void main(String args[]){
		Player player=new CricketPlayer("Amit");
		player.play();
		
		Player player1=new FootbalPlayer("Rajat");
		player1.play();
		
	}
}
