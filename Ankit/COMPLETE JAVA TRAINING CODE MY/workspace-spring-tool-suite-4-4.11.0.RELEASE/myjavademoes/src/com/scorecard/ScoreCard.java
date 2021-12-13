package com.scorecard;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.plaf.metal.MetalBorders.PaletteBorder;

class PlayerScore{
	private String name;
	private int runs;
	public PlayerScore(String name,int runs) {
		super();
		this.name=name;
		this.runs=runs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
}
public class ScoreCard {

	public static void main(String args[]) {
	
		Map<Integer,PlayerScore> batsmanscore=new HashMap<Integer,PlayerScore>();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter runs scored");
		for(int i=0;i<5;i++) {
			String nameRun[]=input.next().split("-");
			String name=nameRun[0];
			int run=Integer.parseInt(nameRun[1]);
			PlayerScore playerScore=new PlayerScore(name, run);
			batsmanscore.put(i+1, playerScore);
		}
		
		//Name of players who have batted by using for each loop
		/*System.out.println("Players who batted ");
		Set<Map.Entry<Integer,PlayerScore>> player=batsmanscore.entrySet();
		for(Map.Entry<Integer, PlayerScore> palyerrun: player) {
			PlayerScore playerScore=palyerrun.getValue();
			System.out.println(playerScore.getName());
			
		}*/
		//Name of players who have batted
		System.out.println("Players who batted ");
		Iterator<Integer> iterator=batsmanscore.keySet().iterator();
		while(iterator.hasNext()) {
			PlayerScore playerScore=batsmanscore.get(iterator.next());
		    System.out.println(playerScore.getName());
		}
		
		int totalruns=0;
		System.out.println("Scores by Players ");
		Iterator<Integer> iterator1=batsmanscore.keySet().iterator();
		while(iterator1.hasNext()) {
			PlayerScore playerScore=batsmanscore.get(iterator1.next());
		    System.out.println(playerScore.getName()+" : "+playerScore.getRuns());
		    totalruns=totalruns+playerScore.getRuns();
		    
		}
		System.out.println("Total Score : "+totalruns);
		System.out.println();
	}
}
