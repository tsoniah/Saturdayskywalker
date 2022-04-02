package Assignment4;

import java.util.Scanner; 

public class question4 {

		class Main {
		    // method to check leap year
		    public boolean question4(int year) {
		        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		            return true;
		        return false;
		    }
		    // method to cound numbeer of words
		    public int question4(String str) {
		        int count = 0;
		        for(int i=0;i<str.length();i++) {
		            if(str.charAt(i) == ' ')
		                count++;
		        }
		        return count+1;
		    }
		    public void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        String input = sc.nextLine();

		        // switch to exercise base on input 
		        switch(input) {
		            case "Leap Year" :
		                System.out.print("Enter year : ");
		                int year = sc.nextInt();
		                if(question4(year))
		                    System.out.println(year + " is a leap year");
		                else
		                    System.out.println(year + " is not a leap year");
		                break;
		            case "word count" :
		                System.out.print("Enter string to count word : ");
		                String str = sc.nextLine();
		                System.out.print("Number of words in the string : " + question4(str));
		        }
		    }
		

		    

		