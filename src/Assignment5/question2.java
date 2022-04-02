package Assignment5;

import java.util.Scanner;

public class question2 {

	
		    String fizzBuzz(Integer i){
		    {
		        if(i%3==0 && i%5!=0)
		        {
		            return "Fizz";
		        }
		        else if(i%5==0 && i%3!=0)
		        {
		            return "Buzz";
		        }
		        else if(i%3==0 && i%5==0)
		        {
		            return "FizzBuzz";
		        }
		        else if(i%3!=0 && i%5!=0)
		        {
		            return Integer.toString(i);
		        }
		        else
		        {
		            return "";
		        }
		    }
	}


public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	question2 obj = new question2();
	int n1,n2,n3;
	System.out.printf("Enter first number: ");
	n1 = scan.nextInt();
	System.out.printf("Enter second number: ");
	n2 = scan.nextInt();
	for(int i=n1;i<=n2;i++) 
	{
	    System.out.printf("%s ",obj.fizzBuzz(i));
	}
}
}