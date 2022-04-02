package Assignment_Two;

public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		primenumbers();
;	}

	private static void primenumbers() {
		int upperbound = 100;
		for (int number =2; number <=upperbound; ++number){
			int maxFactor =(int)Math.sqrt(number);
			Boolean isprime = true;
			int factor=2;
			while (isprime && factor <= maxFactor){
				if(number %factor ==0){
					isprime = false;
				}
			++ factor;
			}
			 if (isprime)
				System.out.println(number  +  "is a prime");
			
		}
		// TODO Auto-generated method stub
		
	}

}
