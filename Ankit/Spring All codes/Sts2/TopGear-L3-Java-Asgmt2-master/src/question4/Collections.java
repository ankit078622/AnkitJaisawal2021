package question4;

public class Collections extends Employee{
	public static Employee[] sort(Employee arr[]) {  /*sort by ascending order of salary*/
		for(int i=0; i<arr.length-1; i++)
			for(int j=0; j<arr.length-i-1; j++) {
				if(compareBySal(arr[j], arr[j+1])==1) {
					Employee swap = new Employee();
					swap = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = swap;
				}
			}
		return arr;
	}
}
