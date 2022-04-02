package Assignment4;

import java.util.ArrayList;
import java.util.Arrays;

public class Question5 {

	      //function to check if two string is anagram or not 
	    static boolean isAnagram(String s1, String s2) {  
	        boolean status = true;  
	        if (s1.length() != s2.length()) {    // check if length are equal or not 
	            status = false;  
	        } else {  
	            char[] ArrS1 = s1.toLowerCase().toCharArray();  
	            char[] ArrS2 = s2.toLowerCase().toCharArray();  
	            Arrays.sort(ArrS1);  
	            Arrays.sort(ArrS2);  
	            status = Arrays.equals(ArrS1, ArrS2);  
	        }  
	        
	        return status;  
	    
	    }
	        
	//main method   
	 public static void main(String[] args) {
	                
	                //array list
	                ArrayList<String> a = new ArrayList<String>();
	                //inserting element
	                a.add("code");
	                a.add("doce");
	                a.add("ecod");
	                a.add("framer");
	                a.add("frame");
	                
	                
	//check is there any anagram in ArrayList               
	                
	for(int i=0;i<a.size()-1;i++)
	{
	   int j=i+1;
	    while(j<a.size())
	        {
	          if(isAnagram(a.get(i), a.get(j)))  //call the function
	          {
	                a.remove(j);   //remove the element if anagram 
	          }
	          else
	          j=j+1;
	        }
	}


	a.sort(null);   //sort the array list

	System.out.println(a);  //print require answer
	 
	}

}
