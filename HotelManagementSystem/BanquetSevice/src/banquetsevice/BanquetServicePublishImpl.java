package banquetsevice;

import java.util.Scanner;

public class BanquetServicePublishImpl implements BanquetServicePublish{
	
	private Scanner myScanner = new Scanner(System.in);
	
	
	
	private double wedding_style = 80000.00;
	private double birthday_style = 25000.00;
	private double boardroom_style = 20000.00;
	private double lectureroom_style = 15000.00;
	
	
	int hall = 0;
	double hours ,chargers, payment = 0.00, total = 0.00, amount = 0, change = 0;
	
	String more = "Yes";
	String date1;

	@Override
	public void BanquetService() {
		
		
				//Displaying the items table
				System.out.println();
				System.out.println("------------------------------------------------------------");
				System.out.println("------------------   HALL  DETAILS   -----------------------");
				System.out.println("------------------------------------------------------------");
				
				System.out.println("       1 =>  Wedding Hall         LKR " + String.format("%.2f",wedding_style));
				System.out.println("       2 =>  Birthday Party Hall  LKR " + String.format("%.2f",birthday_style));
				System.out.println("       3 =>  Board Meeting Room   LKR " + String.format("%.2f",boardroom_style ));
				System.out.println("       4 =>  Lecture Room         LKR " + String.format("%.2f",lectureroom_style));
				
				
				System.out.println("-------------------------------------------------------------");
				System.out.println("-------------------------------------------------------------");
				System.out.println();
				
				while(more.equalsIgnoreCase("Yes")) {
					
					System.out.print("Select Hall Number: ");			
					hall = myScanner.nextInt();
					
					
					System.out.println();
					
					if(hall == 1) {
						
						System.out.println("-------------  Wedding Hall  -------------");
						System.out.println();
						
						//User inputs
						System.out.print("Enter resevation date (dd-mm-yyyy)");
					    date1 = myScanner.next();
 
					    payment = wedding_style;
					  //display details
					    System.out.println();
					    System.out.println("You have reserved wedding hall for a day " + date1);
						System.out.println("Your reservetion caharge is LKR " + String.format("%.2f",payment));
						System.out.println();
						System.out.println("-------------------------------------------------------------");
					}
					
					else if (hall == 2) {
						//display details
						System.out.println("-------------  Birthday Party Hall  -------------");
						System.out.println();
						
						//User inputs
						System.out.print("Enter resevation date (dd-mm-yyyy)");
					    date1 = myScanner.next();
 
					  //User inputs
					    System.out.println("Enter reservation hours : ");
					    hours = myScanner.nextDouble();
					    
					    if(hours <= 6) {
					    	
					    	payment = birthday_style;
					    	
					    	//display details
					    	System.out.println();
					    	System.out.println("You have reserved Birthday Party hall for  " + String.format("%.0f",hours) + " for "+ date1);
							System.out.println("Your reservetion caharge is LKR " + String.format("%.2f",payment));
							System.out.println();
							System.out.println("-------------------------------------------------------------");
					    	
					    }
					    else {
					    	
					    	//calculation
					    	chargers = (hours - 6) * 1500;
					    	payment = chargers + birthday_style;
					    	
					    	//display details
					    	System.out.println();
					    	System.out.println("You have reserved Birthday Party hall for  " + String.format("%.0f",hours) + " for "+ date1);
							System.out.println("Your reservetion caharge is LKR " + String.format("%.2f",payment));
							System.out.println();
							System.out.println("-------------------------------------------------------------");
					    }
						
						
					}
					
					else if(hall == 3) {
						
						System.out.println("-------------  Board Meeting Hall  -------------");
						System.out.println();
						
						//User inputs
						System.out.print("Enter resevation date (dd-mm-yyyy)");
					    date1 = myScanner.next();
 
					  //User inputs
					    System.out.println("Enter reservation hours : ");
					    hours = myScanner.nextDouble();
					    
					    if(hours <= 6) {
					    	
					    	payment = boardroom_style;
					    	
					    	//display details
					    	System.out.println();
					    	System.out.println("You have reserved Board Meeting Hall for  " + String.format("%.0f",hours) + " for "+date1);
							System.out.println("Your reservetion caharge is LKR " + String.format("%.2f",payment));
							System.out.println();
							System.out.println("-------------------------------------------------------------");
					    	
					    }
					    else {
					    	
					    	//calculation
					    	chargers = (hours - 6) * 1000;
					    	payment = chargers + boardroom_style;
					    	
					    	//display details
					    	System.out.println();
					    	System.out.println("You have reserved Board Meeting Hall for  " + String.format("%.0f",hours) + " for "+date1);
							System.out.println("Your reservetion caharge is LKR " + String.format("%.2f",payment));
							System.out.println();
							System.out.println("-------------------------------------------------------------");
					    }
						
						
					}
					
					else if(hall == 4) {
						
						System.out.println("-------------  Lecture Room  -------------");
						System.out.println();
						
						//User inputs
						System.out.print("Enter resevation date (dd-mm-yyyy)");
					    date1 = myScanner.next();
 
					  //User inputs
					    System.out.println("Enter reservation hours : ");
					    hours = myScanner.nextDouble();
					    
					    if(hours <= 4) {
					    	
					    	payment = lectureroom_style;
					    	
					    	//display details
					    	System.out.println();
					    	System.out.println("You have reserved Lecture Room for  " + String.format("%.0f",hours )+ " for "+date1);
							System.out.println("Your reservetion caharge is LKR " + String.format("%.2f",payment));
							System.out.println();
							System.out.println("-------------------------------------------------------------");
					    	
					    }
					    else {
					    	
					    	//calculation
					    	chargers = (hours - 4) * 500;
					    	payment = chargers + boardroom_style;
					    	
					    	//display details
					    	System.out.println();
					    	System.out.println("You have reserved Lecture Room for  " + String.format("%.0f",hours) + " for "+date1);
							System.out.println("Your reservetion caharge is LKR " + String.format("%.2f",payment));
							System.out.println();
							System.out.println("-------------------------------------------------------------");
					    }
						
						
					}else {
						//displaying message
						System.out.println("   Invalid inputs ");
					}
					System.out.println();
					//taking user inputs
					System.out.print("Do you want to reserve more halls (Yes/No)?" );
					more = myScanner.next();
					
					//calculate total amount
					total = total + payment;
					
					
				}
				System.out.println();
				//display details
				System.out.println("Your Total Bill is : "+ String.format("%.2f",total )+" LKR");
				
				System.out.print("How much would you pay ? : " );
				amount = myScanner.nextDouble();
				System.out.println();
				if (amount >= total) {
					//calculate balance
					change = amount - total;
							
					
					//displaying final messages
					System.out.println("------------------------------------------------------------------");
					System.out.println("-------------------      CUSTOMER BILL     -----------------------");
					System.out.println("------------------------------------------------------------------");
					System.out.println("                                                                ");
					System.out.println("    Your Total Bill is : "+ String.format("%.2f",total) +" LKR                        ");
					System.out.println("    Your Payment  is   : "+ String.format("%.2f",amount) +" LKR                        ");
					System.out.println("    Your Balance  is   : "+String.format("%.2f", change )+" LKR                        ");
					System.out.println("                                                                 ");
					System.out.println("__________________________________________________________________");
					System.out.println();
					System.out.println("                 Thank you !  Have a nice day !!         ");
					System.out.println();
					System.out.println("-----------------  End of the Banquet Service  -------------------");
					System.out.println("__________________________________________________________________");
						

				}else {
					System.out.println("Invalid Payment.");
				}
				
		
	}

}
