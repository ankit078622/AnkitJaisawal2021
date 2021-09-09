package com.javaConstructor;

public class Grader {

	String score;
	int percent;
    //Constructor
	Grader(String name,int hindi,int english,int math,int science){
		int sum;
		sum=hindi+english+math+science;
		percent=(sum*100)/400;
		System.out.println("Name : "+name+"\npercent : "+percent);
	}
	//To print score in grade
	void letterGrade() {
		if(percent>0 && percent<100) {  // Here we are checking weather percent is not negative and less than 100 
			if(percent>80 ) {
				score="Grade A";
				System.out.println(score);
			}
			else if(percent>70 && percent<=80) {
				score="Grade B";
				System.out.println(score);
			}
			else if(percent>50 && percent<=70) {
				score="Grade C";
				System.out.println(score);
			}
			else {
				score="Grade D";
				System.out.println(score);
			}
		}
		else 
		{
			System.out.println("Score is not appropriate");
		}
		System.out.println();
	}
	
}
