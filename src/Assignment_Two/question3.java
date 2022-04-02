package Assignment_Two;

public class question3 {

	public static void main(String[] args) {
  comparenumbers();
  
	}
	public static int myfunction(){
		int a=49;
		return a;
	}
		public static int myfunction1(){
			int b=20;
			return b;
			
		}

	private static void comparenumbers() {
		
		if (myfunction()>myfunction1()){
			System.out.println("Function one is greater than the Function two");
		}else if(myfunction() == myfunction1()){
			System.out.println("both funstions are equal");
		}	else{ 
			System.out.println("2nd function is greater than the first");}
			}
		
		// TODO Auto-generated method stub
		
	}


