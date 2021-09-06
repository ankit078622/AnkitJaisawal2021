package classobject;

class StudentRecord{
	String getName(String name) {
		return name;
	}
	int getRollNumber(int rollNumber) {
		return rollNumber;
	}
}
public class Student {
	public static void main(String args[]) {
		//creating object for name  for string variable
		StudentRecord studentRecord=new StudentRecord();
		String name=studentRecord.getName("John");
		System.out.println("Student name : "+name);
		
		//creating object for roll number int variable
	    StudentRecord studentRecord1=new StudentRecord();
	    int rollnum=studentRecord1.getRollNumber(2);
	    System.out.println("Student roll number : "+rollnum);
	    
	    
	}
}
