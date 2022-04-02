package saturdayskywalker;

import java.util.Scanner;

public class EC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in);
				System.out.println("Please enter number one");
				int numberOne = input.nextInt();
				System.out.println("Please enter number two");
				int numberTwo = input.nextInt();
				
				if(numberOne > numberTwo) {
					System.out.println("Number One is greater then Number Two");
				}else if(numberOne == numberTwo) {
					System.out.println("Numbers are equal");
				}
				else {
					System.out.println("Number Two is greater then Number One");
				}

			}

		
	}



