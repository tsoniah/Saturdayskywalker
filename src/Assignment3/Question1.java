package Assignment3;

import java.awt.Checkbox;
import java.util.Scanner;

public class Question1 {

	
		String accname;
		float amount;
		boolean bool;
		Scanner s = new Scanner(System.in);
		 Question1(String accname) {
			this.accname = accname;
			System.out.println("Account Name: " + this.accname);
		System.out.print("Please Enter the Initial Amount for this" +accname + "account: ");
		this.amount = s.nextFloat();
		if (this.amount <=0) {
			bool = false;
		}else{
			System.out.println("initial amount: " + this.amount);
			bool= true;
		}
		while (bool== false){
			System.out.println("Invalid amount| try again.. ");
			System.out.println("Please Enter the Initial Amount: " + this.amount);
			bool =true;

			
			
		}
		}
	
	
		void deposit(float amount){
			this.amount = this.amount +amount;
			System.out.println("new amount after deposit: " + this.amount);

			
		}
		void withdraw(float amount){
			if(this.amount<amount) {
				System.out.println("insufficient balance");
			} else {
				this.amount = this.amount + amount;
				System.out.println("New amount after Withdrawal: " + this.amount);

				}
		}
		public static <Checking> void main(String[] args){
			Savings s = new Savings();
			s.deposit(5000);
			Checking c= new Checking();
			((Question1) c).deposit(6000);
			((Question1) c).withdraw(1000);
			class Savings extends Assignment3 {
				Savings(){
					super ("Savimgs");
				}
			}
		}
			}
			
			
			
		
