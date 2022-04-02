package classthree;

import java.util.HashMap;
import java.util.HashSet;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int age =30;
		int[] ageskywalker = new int[] {25, 30, 31, 35, 40};
		
		//index of                       0   1   2   3  4 5
		
		System.out.println(ageskywalker[2]);
		
		
		String[] namesskywalker = new String[] {"Soniah", "lemon", "Habib"};
		
		//index of                             0        1      2   
		
		System.out.println(namesskywalker[0]);
		System.out.println("array length: "  +ageskywalker.length);
		
		//multi-dimensional array
		
		int[][] ageskywalker2d= {  
				{25, 30, 31, 35, 40}, //[0][0] [0][1] [0][2] [0][3] [0][4] [0][5] 
				{38, 40, 45}      // [1][0] [1][1] [1][2] [1][3] [1][4] [1][5]
				
				
		};
		System.out.println("Array Value:"  +ageskywalker2d[1][2]);
		
		// multi-dimensional print array
		
		for (int i=0; i<ageskywalker2d.length; i++){
			for (int j=0; j<ageskywalker2d[i].length; j++){
				System.out.println("multidimensional array: " + ageskywalker2d[i][j]);
			}
			
		}
		
		// Hashmap - 
		
		HashMap<String, String> Hometown  = new HashMap<String, String>();
		Hometown.put("Soniah", "Sylhet");
		Hometown.put("Habib", "Dhaka");
		Hometown.put("Mamun", "Barishal");
		System.out.println("Hometown :" +Hometown.get("Soniah"));
		
		HashMap<String, Integer> StudentAge = new HashMap<String, Integer>();


		StudentAge.put("Soniah", 25);
		StudentAge.put("Habib", 28);
		StudentAge.put("Mamun", 30);
		System.out.println("Hometown : " +StudentAge.get("Soniah"));
		
		//HASHSET
		
		HashSet<String> Car = new HashSet<String>();
		Car.add("Toyota");
		Car.add("BMW");
		Car.add("Audi");
		System.out.println("Hashset Value : "+ Car);
		
		}
		
		
	}


