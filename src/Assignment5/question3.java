package Assignment5;

public class question3 {

	
		// TODO Auto-generated method stub

		 public static boolean isPalindrome(String str) {
		        if (str.length() <= 1) {
		            return true;
		        } else {
		            char ch1 = Character.toLowerCase(str.charAt(0));
		            char ch2 = Character.toLowerCase(str.charAt(str.length() - 1));
		            if (ch1 < 'a' || ch1 > 'z') {
		                return isPalindrome(str.substring(1));
		            } else if (ch2 < 'a' || ch2 > 'z') {
		                return isPalindrome(str.substring(0, str.length() - 1));
		            } else {
		                return ch1 == ch2 && isPalindrome(str.substring(1, str.length() - 1));
		            }
		        }
		    }

		    public static void main(String[] args) {
		      
		        System.out.println(isPalindrome("Kayak"));

		        System.out.println(isPalindrome("Hello"));
		        System.out.println(isPalindrome("abcba"));
		        System.out.println(isPalindrome("palindrome"));
		    }
		
	}


