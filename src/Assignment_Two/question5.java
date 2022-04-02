package Assignment_Two;

public class question5 {

public static void main(String[] args) {
		// TODO Auto-generated method stub

	Multiplicationtable();
	
	}

	private static void Multiplicationtable() {
		// TODO Auto-generated method stub
		for (int row =1; row <=8; row++){
			for (int col= 1; col <=10; col++){
				int multiplicationtable = row*col;
				System.out.println(multiplicationtable + "");
			}
		System.out.println("");
		}
	}
	

}
