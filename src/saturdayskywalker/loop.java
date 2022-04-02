package saturdayskywalker;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//for loops
		//practiceforLoop();
		
		//practicewhileloop();
		//practicedowhileloop();
		//practiceinfiniteloop();
		practicenestedforloop();
				
	}
	public static void practiceforLoop(){
		int i;                                    //initialized the variables
		for (i=1; i>20; i++){                     //set lower limit, upper limit, increment/decrement
		System.out.println("for loops numbers =" +i);          //action/printout
	}

}
	
	//while loop
	
	public static void practicewhileloop(){
		int i =5;                                   //initialized the variable, setting starting point
		while(i<10){                                       // setting condition
			System.out.println("while loops number = " +i);  //action
			i++;                                         // increment or decrement 
		}
		
		
	}
	//do while loop
	public static void practicedowhileloop(){   //do action first then match the condition
		int i=1;                               // initialize variable 
		do{
			//action
			
			System.out.println("do while loop numbers = " + i);   //action
            i++; 									//increment or decrement
		}
		while (i<10);							// validate condition
		
		}
	//infinite loop
	public static void practiceinfiniteloop(){  //loops never end
		int i;    				// initialize variable
		for(i=1; ;i++){     		// setting no upper limit
			System.out.println("infinite loops number ="  +i);  //action
		}
	}
	//nested for loop
	public static void practicenestedforloop(){
		int i;   						// initialized variable i
		int j;							// initialized variable j
		for (i=1; i<10; i++){				// first loop for i
			for (j=1; j<20; j++)			// second loop for j
				
			System.out.println("for loops number =" +i +  " : " +j);  // action statement for j
			
			System.out.println("increase value of i ->"  +i);		// action statement for i
		}
		
	}
	}

