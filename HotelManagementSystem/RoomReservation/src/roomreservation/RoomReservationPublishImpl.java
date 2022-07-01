package roomreservation;

import java.util.Scanner;

public class RoomReservationPublishImpl implements RoomReservationPublish{
	
	//get inputs from the keyboard
	private Scanner myScanner = new Scanner(System.in);
	
	//declare variables
	private double Orchid_Single = 8000.00;
	private double Orchid_Single_AC = 10000.00;
	private double Orchid_Double = 12000.00;
	private double Orchid_Double_AC = 14000.00;
	private double Lotus_Single = 9000.00;
	private double Lotus_Single_AC = 11000.00;
	private double Lotus_Double = 13000.00;
	private double Lotus_Double_AC= 15000.00;
	
	
	String more = "Yes";
	int type, condition, size;
	double  payment = 0.00, qty=0, total = 0.00, amount =0, change = 0, days;

	@Override
	public void RoomReservation() {
		
		
		// display details
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println("-----------------    ROOM  DETAILS    ----------------------");
		System.out.println("------------------------------------------------------------");
		System.out.println();
		System.out.println("    ROOM TYPE 1 ( ORCHID )    " );
		System.out.println();
		System.out.println("    Single Bed Room           " + String.format("%.2f",Orchid_Single) + "  LKR");
		System.out.println("    Single Bed Room With A/C  " + String.format("%.2f",Orchid_Single_AC) + "  LKR");
		System.out.println("    Double Bed Room           " + String.format("%.2f",Orchid_Double )+ "  LKR");
		System.out.println("    Double Bed Room With A/C  " + String.format("%.2f",Orchid_Double_AC )+ "  LKR");
		System.out.println();
		System.out.println("_____________________________________________________________");
		System.out.println();
		System.out.println("    ROOM TYPE 2   (  LOTUS  )    " );
		System.out.println();
		System.out.println("    Single Bed Room           " + String.format("%.2f",Lotus_Single) + "  LKR");
		System.out.println("    Single Bed Room With A/C  " + String.format("%.2f",Lotus_Single_AC) + "  LKR");
		System.out.println("    Double Bed Room           " + String.format("%.2f",Lotus_Double )+ "  LKR");
		System.out.println("    Double Bed Room With A/C  " + String.format("%.2f",Lotus_Double_AC) + "  LKR");
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println();

		

		
		//loop for repetition
		while(more.equalsIgnoreCase("Yes")) {
			
			//taking user inputs
			System.out.print("Select Room Type (1. Orchid / 2. Lotus ) : ");			
			type = myScanner.nextInt();
			
			/*
			 * check Room type*/
			if (type == 1) {
				// display details
				System.out.print("Your Room Type is ORCHID ");
				
				//USer Inputs
				System.out.print("Do you need (1. Single Bed Room  / 2. Double Bed Room ) : ");			
				size = myScanner.nextInt();
				
				//check room size
				if(size == 1) {
					
					System.out.print("Select Room Condition (1. Without A/C / 2. With A/C ) : ");			
					condition = myScanner.nextInt();
					
					//check air condition
					if(condition == 1) {
						
						//USer Inputs
						System.out.print("How many rooms do you need to book  : ");			
						qty = myScanner.nextDouble();
						
						//USer Inputs
						System.out.print("How many days do you need to reserve the room  : ");			
						days = myScanner.nextDouble();
						
						//calculate total price
						total = Orchid_Single * days * qty;
						
						//display details
						System.out.println("You have booked "+ String.format("%.0f",qty) +" Orchid Without A/C Single Bed Room for " +String.format("%.0f", days) + " days.");
						System.out.println("Your payment is " +String.format("%.2f",total) + " LKR");
						
					}
					else if( condition == 2) {
						
						//USer Inputs
						System.out.print("How many rooms do you need to book  : ");			
						qty = myScanner.nextDouble();
						
						//USer Inputs
						System.out.print("How many days do you need to reserve the room  : ");			
						days = myScanner.nextDouble();
						
						//calculate total
						total = Orchid_Single_AC * days * qty;
						
						//display details
						System.out.println("You have booked "+String.format("%.0f",qty)+" Orchid With A/C Single Bed Room for " + String.format("%.0f",days )+ " days.");
						System.out.println("Your payment is " +String.format("%.2f",total )+ " LKR");
						
					}
					else {
						System.out.println("INVALID NUMBER");
					}
					
					
				}
				else if (size == 2) {
					
					//USer Inputs
					System.out.print("Select Room Condition (1. Without A/C / 2. With A/C ) : ");			
					condition = myScanner.nextInt();
					
					if(condition == 1) {
						
						//USer Inputs
						System.out.print("How many rooms do you need to book  : ");			
						qty = myScanner.nextDouble();
						
						//USer Inputs
						System.out.print("How many days do you need to reserve the room  : ");			
						days = myScanner.nextDouble();
						
						//calculate total
						total = Orchid_Double * days * qty;
						
						//display Details
						System.out.println("You have booked "+String.format("%.0f",qty)+" Orchid WithOut A/C Double Bed Room for " + String.format("%.0f",days )+ " days.");
						System.out.println("Your payment is " +String.format("%.2f",total) + " LKR");
					}
					else if( condition == 2) {
						
						//USer Inputs
						System.out.print("How many rooms do you need to book  : ");			
						qty = myScanner.nextDouble();
						
						//USer Inputs
						System.out.print("How many days do you need to reserve the room  : ");			
						days = myScanner.nextDouble();
						
						//calculate total
						total = Orchid_Double_AC * days * qty;
						
						//display details
						System.out.println("You have booked "+String.format("%.0f",qty)+" Orchid With A/C Double Bed Room for " + String.format("%.0f",days )+ " days.");
						System.out.println("Your payment is " +String.format("%.2f",total) + " LKR");
						
					}
					else {
						System.out.println("INVALID NUMBER");
					}
					
				}else {
					System.out.println("INVALID ROOM NUMBER");
				}
			}
			else if (type == 2) {
				
				System.out.print("Your Room Type is LOTUS ");
				
				//USer Inputs
				System.out.print("Do you need (1. Single Bed Room  / 2. Double Bed Room ) : ");			
				size = myScanner.nextInt();
				
				if(size == 1) {
					
					//USer Inputs
					System.out.print("Select Room Condition (1. Without A/C / 2. With A/C ) : ");			
					condition = myScanner.nextInt();
					
					if(condition == 1) {
						
						//USer Inputs
						System.out.print("How many rooms do you need to book  : ");			
						qty = myScanner.nextDouble();
						
						//USer Inputs
						System.out.print("How many days do you need to reserve the room  : ");			
						days = myScanner.nextDouble();
						
						//calculation
						total = Lotus_Single * days * qty;
						
						System.out.println("You have booked "+String.format("%.0f",qty)+" Lotus WithOut A/C Single Bed Room for " + String.format("%.0f",days )+ " days.");
						System.out.println("Your payment is " +String.format("%.2f",total) + " LKR");
					}
					else if( condition == 2) {
						
						//USer Inputs
						System.out.print("How many rooms do you need to book  : ");			
						qty = myScanner.nextDouble();
						
						System.out.print("How many days do you need to reserve the room  : ");			
						days = myScanner.nextDouble();
						
						//calculation
						total = Lotus_Single_AC * days * qty;
						
						System.out.println("You have booked "+String.format("%.0f",qty)+" Lotus With A/C Single Bed Room for " + String.format("%.0f",days )+ " days.");
						System.out.println("Your payment is " +String.format("%.2f",total) + " LKR");
						
					}
					else {
						System.out.println("INVALID NUMBER");
					}
					
					
				}
				else if (size == 2) {
					
					//USer Inputs
					System.out.print("Select Room Condition (1. Without A/C / 2. With A/C ) : ");			
					condition = myScanner.nextInt();
					
					if(condition == 1) {
						
						//USer Inputs
						System.out.print("How many rooms do you need to book  : ");			
						qty = myScanner.nextDouble();
						
						//USer Inputs
						System.out.print("How many days do you need to reserve the room  : ");			
						days = myScanner.nextDouble();
						
						//calculation
						total = Lotus_Double * days * qty;
						
						System.out.println("You have booked "+String.format("%.0f",qty)+" Lotus WithOut A/C Double Bed Room for " + String.format("%.0f",days) + " days.");
						System.out.println("Your payment is " +String.format("%.2f",total) + " LKR");
					}
					else if( condition == 2) {
						
						//USer Inputs
						System.out.print("How many rooms do you need to book  : ");			
						qty = myScanner.nextDouble();
						
						//USer Inputs
						System.out.print("How many days do you need to reserve the room  : ");			
						days = myScanner.nextDouble();
						
						//calculation
						total = Lotus_Double_AC * days * qty;
						
						
						System.out.println("You have booked "+String.format("%.0f",qty)+" Lotus With A/C Double Bed Room for " + String.format("%.0f",days )+ " days.");
						System.out.println("Your payment is " +String.format("%.2f",total) + " LKR");
						
					}
					else {
						System.out.println("INVALID NUMBER");
					}
					
				}else {
					System.out.println("INVALID ROOM NUMBER");
				}
			}
			System.out.println();
			System.out.print("Do you want to reserve more Rooms (Yes/No)?" );
			more = myScanner.next();
			
			//calculate total amount
			payment = payment + total ;
		
		}
		
		//Display 
		System.out.println();
		System.out.println("Your Total Bill is : "+ String.format("%.2f",payment) +" LKR");
		
		System.out.print("How much would you pay ? : " );
		amount = myScanner.nextDouble();
		
		
		if (amount >= payment ) {
			
			change = amount - payment; 
			
		//displaying final messages
				System.out.println("------------------------------------------------------------------");
				System.out.println("-------------------      CUSTOMER BILL     -----------------------");
				System.out.println("------------------------------------------------------------------");
				System.out.println();
				System.out.println("    Your Total Bill is : "+ String.format("%.2f",payment)+" LKR                    ");
				System.out.println("    Your Payment  is   : "+ String.format("%.2f",amount )+" LKR                        ");
				System.out.println("    Your Balance  is   : "+ String.format("%.2f",change) +" LKR                        ");
				System.out.println();
				System.out.println("__________________________________________________________________");
				System.out.println();
				System.out.println("                 Thank you !  Have a nice day !!         ");
				System.out.println();
				System.out.println("-------------------  End of the Room Service  --------------------");
				System.out.println("__________________________________________________________________");
					
		}
		else {
			System.out.println("Invalid Payment.");
		}
		
		
		

		
	}

}
