package Assignment5;

import java.util.Calendar;

public class question4 {

		public String decode(String code)
	    {
	        String result = "";
	        char ch;
	        for(int i = 0; i < code.length(); ++i) {
	            ch = code.charAt(i);
	            if(Character.isAlphabetic(ch)) {
	                ch = (char) ('a' + ((ch - 'a' - 5 + 26) % 26));
	            }
	            result += ch;
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        question4 question4 = new question4();
	        System.out.println(question4.decode("hello"));
	    }

	
	}


