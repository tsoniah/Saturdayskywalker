package saturdayskywalker;

import java.util.Scanner;

public class Echomeworkquestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the Length");
			double length = input.nextDouble();
			System.out.println("Please enter the width");
			double width = input.nextDouble();	
			
					
			if(length <=0 || width <=0) {
				System.out.println("Invalid length or width");
			}else {
				if(length == width) {
					System.out.println("It is a square");
				}else {
					System.out.println("It is not a square");

				}
			}
	}
}
