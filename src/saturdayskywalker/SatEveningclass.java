package saturdayskywalker;

public class SatEveningclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int  amount= 500;
		//int numberofsips=0;
		//while(amount>0){
		//	amount= amount-10;
		//	numberofsips=numberofsips+1;
			
			//System.out.println(amount);
		//}
		//System.out.println(numberofsips);
			
			//count = count + 1;
			//or count++;
			//System.out.println(count);
			
			
		// bottol of H20 that holds 500ml, each sip you drink 10ml, how many sips do you need to drink the entire bottol?
			
		
			//int i=1; //odd
		//while (i <= 100) {
			//if ( i%2 !=0){
			//System.out.println(i); 
		//	}
		//	i++;
			
			//int i=1; //even
			//while (i <= 100) {
				//if ( i%2 ==0){
			//	System.out.println(i); 
			//	}
				//i++;
		//int x=1;
		//do {
		//	System.out.println("Soniah");
	//	}while (x>2);
		//int i;
		//for( i=1; i<=100; i++){
		//if(1% 2 ==0);
		//System.out.println(i);
		//int i;
		//int count=0;
		//for( i=2; i<=100; i+=3){

		//System.out.println(i);
		//count = count+1;
		//System.out.println(count);
		
		//int studentcount=0;
		//for (int i=1; i<=10; i++){
			//System.out.println("I'm in Room :" +i);
			//for(int j=1; j<=15; j++){
		//studentcount+=1;
				//System.out.println("i'm in room: " +i +"students :" +j);
			//}
		//}
		//System.out.println(studentcount);
		
		//int[] numbers= {10,2,4,6,20,25};
		//for(int i=0; i<numbers.length; i++){
		//System.out.print(numbers[i] + ", ");
		//System.out.println(numbers[0]);
	
		// if a room had even number of student 
		//then all the students in that room are good
			int[] rooms = {3,4,15,20,50,12};
			int highestStudentRoom = 0;
			int secondStudentRoom = 0;
			for(int i=0; i<rooms.length; i++) {
				if(highestStudentRoom < rooms[i]) {
					highestStudentRoom = rooms[i];
				}
				
			}
			
			for(int i=0; i<rooms.length; i++) {
				if(rooms[i] < highestStudentRoom && rooms[i] > secondStudentRoom ) {
					secondStudentRoom = rooms[i];
				}
			}
			
			System.out.println(highestStudentRoom);
			System.out.println(secondStudentRoom);
		
		
	}
		
}





