package vehicleservice;

import java.util.Scanner;

public class VehicleServicePublishImpl implements VehicleServicePublish{
	
	//get inputs from keyboard
	private Scanner myScanner = new Scanner(System.in);

	//declare variables
	private double Car = 3000.00;
	private double Van = 4000.00;
	private double Bus = 5000.00;
	private double Truck = 6000.00;
	private double rent_Car = 100.00;
	private double rent_Van = 200.00;
	private double rent_Bus = 300.00;
	private double rent_Truck = 400.00;
	
	private int type = 0;
	String more = "Yes";
	private double total = 0.00, km = 0, amount = 0, change = 0, payment = 0.00;

	@Override
	public void VehicleService() {
		
		//display details
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println("---------------   VEHICLE SERVICE  DETAILS   ---------------");
		System.out.println("------------------------------------------------------------");
		System.out.println();
		System.out.println("     1 =>  Car    " );
		System.out.println("     2 =>  Van ");
		System.out.println("     3 =>  Bus ");
		System.out.println("     4 =>  Truck ");
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------");
		System.out.println();
		
		//loop for repetition
		while(more.equalsIgnoreCase("Yes")) {
			
			//User inputs
			System.out.print("Select Vehicle Type : ");			
			type = myScanner.nextInt();
			
			//check condition
			if (type == 1) {
				
				//display details
				System.out.println("Rent for vehicle for the day : LKR "+String.format("%.2f",Car));
				System.out.println("Rent for the 1 Km : LKR " + String.format("%.2f",rent_Car));
				
				//User inputs
				System.out.print("How many Kilo Meters : ");			
				km = myScanner.nextDouble();
				
				//calculate total amount
				total = Car + (rent_Car * km);
				
				System.out.println("Total Payment is  LKR "+String.format("%.2f",total));			
				
				
			}
			//check condition
			else if (type == 2) {
				
				//display details
				System.out.println("Rent for vehicle for the day : LKR "+ String.format("%.2f",Van));
				System.out.println("Rent for the 1 Km : LKR " + String.format("%.2f",rent_Van));
				
				//User inputs
				System.out.print("How many Kilo Meters : ");			
				km = myScanner.nextDouble();
				
				//calculate total amount
				total = Van + (rent_Van * km);
				
				System.out.println("Total Payment is  LKR "+String.format("%.2f",total));			
				
				
			}
			//check condition
			else if (type == 3) {
				
				//display details
				System.out.println("Rent for vehicle for the day : LKR "+ String.format("%.2f",Bus));
				System.out.println("Rent for the 1 Km : LKR " + String.format("%.2f",rent_Bus));
				
				//User inputs
				System.out.print("How many Kilo Meters : ");			
				km = myScanner.nextDouble();
				
				//calculate total amount
				total = Bus + (rent_Bus * km);
				
				System.out.println("Total Payment is  LKR "+String.format("%.2f",total));			
				
				
			}//check condition
			else if (type == 4) {
				
				//display details
				System.out.println("Rent for vehicle for the day : LKR "+ String.format("%.2f",Truck));
				System.out.println("Rent for the 1 Km : LKR " + String.format("%.2f",rent_Truck));
				
				//User inputs
				System.out.print("How many Kilo Meters : ");			
				km = myScanner.nextDouble();
				
				//calculate total amount
				total = Truck + (rent_Truck * km);
				
				System.out.println("Total Payment is  LKR "+String.format("%.2f",total));			
				
				
			}else {
				
				System.out.println(" INVALID MANUE NUMBER ");
			}
			
			System.out.println();
			//taking user inputs
			System.out.print("Do you want book more vichicles (Yes/No)?" );
			more = myScanner.next();
			
			//calculate total amount
			payment = payment +total;
			
		}
		
		System.out.println();
		System.out.println("Your Total Bill is : "+ String.format("%.2f",payment) +" LKR");
		
		//taking user inputs
		System.out.print("How much would you pay ? : " );
		amount = myScanner.nextDouble();
		
		
		if (amount >= payment ) {
			//calculate the balance
			change = amount - payment; 
		//displaying final messages
			System.out.println("------------------------------------------------------------------");
			System.out.println("-------------------      CUSTOMER BILL     -----------------------");
			System.out.println("------------------------------------------------------------------");
			System.out.println("                                                                ");
			System.out.println("    Your Total Bill is : "+ String.format("%.2f",payment) +" LKR                      ");
			System.out.println("    Your Payment  is   : "+ String.format("%.2f",amount) +" LKR                        ");
			System.out.println("    Your Balance  is   : "+ String.format("%.2f",change) +" LKR                        ");
			System.out.println("                                                                ");
			System.out.println("__________________________________________________________________");
			System.out.println();
			System.out.println("                   Thank you !  Have a nice day !!         ");
			System.out.println();
			System.out.println("-------------------  End of the Vehicle Service-------------------");
			System.out.println("__________________________________________________________________");
		
		}else {
			System.out.println("Invalid Payment.");
		}
		
			
			
			
			
		
		
	}

}
