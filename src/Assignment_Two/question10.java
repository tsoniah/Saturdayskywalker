package Assignment_Two;

import java.util.Scanner;

public class question10 {

	private static int farn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			converttemp();
	}

	private static void converttemp() {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		double farn, cels;
		
		System.out.print("Enter Fahrenheit Temperature = ");
		farn = input.nextDouble();
		cels = (farn -32)*5/9;
		
		System.out.println("So in Celsious : "+ cels);
	}

	}


