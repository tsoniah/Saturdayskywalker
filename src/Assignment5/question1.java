package Assignment5;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int[] {10, 20, 30, 80, 20, 10, 5};
		
		System.out.println("the largest integer is:  " + getMax(arr) );

	}
	
	public static int getMax(int[] arr){
		int currentMax=0;
		for(int i=0; i<arr.length; i++){
			if (arr[i] > currentMax){
		currentMax	= arr[i]; 
				
			}
				
		}
		return currentMax;
		
	}

}

