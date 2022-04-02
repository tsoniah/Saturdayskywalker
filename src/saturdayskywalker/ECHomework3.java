package saturdayskywalker;

import java.util.Scanner;

public class ECHomework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Salary");
		int salary = input.nextInt();
		System.out.println("Please enter year of service");
		int years = input.nextInt();
		
		if(years >= 5) {
			int initialBonus = 8000;
			int additionalBonus = (years - 5) * 1000;
			System.out.println(initialBonus + additionalBonus );
		}else {
			System.out.println(0);
		}



}
}
