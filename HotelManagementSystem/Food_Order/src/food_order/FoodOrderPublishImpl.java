package food_order;

import java.util.Scanner;
import java.util.*;

public class FoodOrderPublishImpl implements FoodOrderPublish {
	
	private Scanner myScanner = new Scanner(System.in);

	
	private double BriyaniRice = 450.00;
	private double FriedRice = 400.00;
	private double RiceCurryVeg = 250.00;
	private double RiceCurryEgg = 270.00;
	private double RiceCurryChicken = 300.00;
	private double StringHoppers = 5.00;
	private double FrenchFries = 100.00;
	private double Cookies = 100.00;
	private double Cake = 50.00;
	private double Pastries = 50.00;
	private double ChocShake = 150.00;
	private double VanilShake = 150.00;
	private double Mango = 120.00;
	private double Coffee = 50.00;
	private double tea = 40.00;
	
	
	private int manue = 0, num =0;
	String more = "Yes";
	private double total = 0.00, qty = 0, payment=0.00, amount= 0.00, change = 0.00;
	
	@Override
	public void FoodOrder() {
		
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println("---------------   FOOD  ORDER  DETAILS   -------------------");
		System.out.println("------------------------------------------------------------");
		System.out.println();
		System.out.println("     1 =>  Food     " );
		System.out.println("     2 =>  Beveragers ");
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------");
		System.out.println();
		
		
		while(more.equalsIgnoreCase("Yes")) {
		
			//user inputs
			System.out.print("Select Manu Number (1. Food / 2. Beveragers) : ");			
			manue = myScanner.nextInt();
			
			//Check whether manue number is valid or invalid
			
			while(!(manue == 1 || manue == 2 )) {
				
					//Error message
			       System.out.println("Invalid Manu Number ");
			       
			     //USer Inputs
			       
			       System.out.print("Select Manu Number (1. Food / 2. Beveragers) : ");	
			      			
			       manue = myScanner.nextInt();
			
			}
		
			if (manue == 1) {
			
				System.out.println();
				System.out.println("------------------------------------------------------------");
				System.out.println("------------------  ALL FOOD  DETAILS  ---------------------");
				System.out.println("------------------------------------------------------------");
				System.out.println();
				System.out.println("     1 =>  Briyani Rice           LKR " + String.format("%.2f",BriyaniRice));
				System.out.println("     2 =>  Fried Rice             LKR " + String.format("%.2f",FriedRice));
				System.out.println("     3 =>  Rice & Curry (Veg)     LKR " + String.format("%.2f",RiceCurryVeg));
				System.out.println("     4 =>  Rice & Curry (Egg)     LKR " + String.format("%.2f",RiceCurryEgg));
				System.out.println("     5 =>  Rice & Curry (Chicken) LKR " + String.format("%.2f",RiceCurryChicken));
				System.out.println("     6 =>  StringHoppers          LKR " + String.format("%.2f",StringHoppers));
				System.out.println("     7 =>  FrenchFries            LKR " + String.format("%.2f",FrenchFries));
				System.out.println("     8 =>  Cookies                LKR " + String.format("%.2f",Cookies));
				System.out.println("     9 =>  Cake                   LKR " + String.format("%.2f",Cake));
				System.out.println("    10 =>  Pastries               LKR " + String.format("%.2f",Pastries));
				System.out.println();
				System.out.println("-------------------------------------------------------------");
				System.out.println("-------------------------------------------------------------");
				System.out.println();
				
				System.out.print("Select Food Item Number: ");			
				num = myScanner.nextInt();
				
				//Check whether food item number is valid or invalid
				
				while(!(num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 6 || num == 7 || num == 8 || num == 9 || num == 10 )) {
					
					//Error message
				     System.out.println("Invalid Food Item Number ");
				       
				     //USer Inputs
				    System.out.print("Select Food Item Number: ");			
					num = myScanner.nextInt();
						
				}

				
				
				//check condition
				if (num == 1) {
					
					System.out.println("Biriyani Rice 1 Price : LKR " + String.format("%.2f",BriyaniRice));
					
					//user inputs
					System.out.print("Quantity : ");			
					qty = myScanner.nextDouble();
					
					//calculation
					total = BriyaniRice * qty;
					
					System.out.println("Total Payment  : LKR " + String.format("%.2f",total ));
				
				}
				else if (num == 2) {
					
					System.out.println("Fried Rice 1 Price : LKR " + String.format("%.2f",FriedRice));
					
					//user inputs
					System.out.print("Quantity : ");			
					qty = myScanner.nextDouble();
					
					//calculation
					total = FriedRice * qty;
					
					System.out.println("Total Payment  : LKR " + String.format("%.2f",total ));
				
				}
				else if (num == 3) {
					
					System.out.println("Rice & Curry (Veg) 1 Price : LKR " + String.format("%.2f",RiceCurryVeg));
					
					//user inputs
					System.out.print("Quantity : ");			
					qty = myScanner.nextDouble();
					
					//calculation
					total = RiceCurryVeg * qty;
					
					System.out.println("Total Payment  : LKR " + String.format("%.2f",total ));
				
				}
				else if (num == 4) {
					
					System.out.println("Rice & Curry (Egg) 1 Price : LKR " + String.format("%.2f",RiceCurryEgg));
					
					//user inputs
					System.out.print("Quantity : ");			
					qty = myScanner.nextDouble();
					
					//calculation
					total = RiceCurryEgg * qty;
					
					System.out.println("Total Payment  : LKR " + String.format("%.2f",total ));
				
				}
				else if (num == 5) {
					
					System.out.println("Rice & Curry (Chicken) 1 Price : LKR " + String.format("%.2f",StringHoppers));
					
					//user inputs
					System.out.print("Quantity : ");			
					qty = myScanner.nextDouble();
					
					//calculation
					total = StringHoppers * qty;
					
					System.out.println("Total Payment  : LKR " + String.format("%.2f",total ));
				
				}
				else if (num == 6) {
					
					System.out.println("StringHoppers 1 Price : LKR " + String.format("%.2f",StringHoppers));
					
					//user inputs
					System.out.print("Quantity : ");			
					qty = myScanner.nextDouble();
					
					//calculation
					total = StringHoppers * qty;
					
					System.out.println("Total Payment  : LKR " + String.format("%.2f",total ));
				
				}
				else if (num == 7) {
					
					System.out.println("FrenchFries  1 Price : LKR " + String.format("%.2f",FrenchFries));
					
					//user inputs
					System.out.print("Quantity : ");			
					qty = myScanner.nextDouble();
					
					//calculation
					total = FrenchFries * qty;
					
					System.out.println("Total Payment  : LKR " + String.format("%.2f",total ));
				
				}
				else if (num == 8) {
					
					System.out.println("Cookies  1 Price : LKR " + String.format("%.2f",Cookies));
					
					//user inputs
					System.out.print("Quantity : ");			
					qty = myScanner.nextDouble();
					
					//calculation
					total = Cookies * qty;
					
					System.out.println("Total Payment  : LKR " + String.format("%.2f",total ));
				
				}
				else if (num == 9) {
					
					System.out.println("Cake 1 Price : LKR " + String.format("%.2f",Cake));
					
					//user inputs
					System.out.print("Quantity : ");			
					qty = myScanner.nextDouble();
					
					//calculation
					total = Cake * qty;
					
					System.out.println("Total Payment  : LKR " + String.format("%.2f",total ));
					
				
				}
				else if (num == 10) {
					
					System.out.println("Pastries   1 Price : LKR " + String.format("%.2f",Pastries));
					
					//user inputs
					System.out.print("Quantity : ");			
					qty = myScanner.nextDouble();
					
					//calculation
					total = Pastries * qty;
					
					System.out.println("Total Payment  : LKR " + String.format("%.2f",total) );
				
				}else {
					
					System.out.println(" INVALID ITEM NUMBER ");
				}
				
			}
			
			else if (manue == 2) {
				
				System.out.println();
				System.out.println("------------------------------------------------------------");
				System.out.println("---------------  ALL BEVERAGERS  DETAILS  ------------------");
				System.out.println("------------------------------------------------------------");
				System.out.println();
				System.out.println("     1 =>  Tea               LKR " + String.format("%.2f",tea));
				System.out.println("     2 =>  Coffee            LKR " + String.format("%.2f",Coffee));
				System.out.println("     3 =>  Mango Juice       LKR " + String.format("%.2f",Mango));
				System.out.println("     4 =>  Chocolate Shake   LKR " + String.format("%.2f",ChocShake));
				System.out.println("     5 =>  Vanila Shake      LKR " + String.format("%.2f",VanilShake));
				System.out.println();
				System.out.println("-------------------------------------------------------------");
				System.out.println("-------------------------------------------------------------");
				System.out.println();
				
				System.out.print("Select Beverage Item Number: ");			
				num = myScanner.nextInt();
				
				//Check whether beverage item number is valid or invalid
				
				while(!(num == 1 || num == 2 || num == 3 || num == 4 || num == 5 )) {
					
					//Error message
				     System.out.println("Invalid Beverage Item Number ");
				       
				     //USer Inputs
				     System.out.print("Select Beverage Item Number: ");			
				     num = myScanner.nextInt();
				    
				}
				
				if (num == 1) {
					
					System.out.println("Cup of Tea Price : LKR " + String.format("%.2f",tea));
					
					//user inputs
					System.out.print("Quantity : ");			
					qty = myScanner.nextDouble();
					
					//calculation
					total = tea * qty;
					
					System.out.println("Total Payment  : LKR " + String.format("%.2f",total ));
				
				}
				else if (num == 2) {
					
					System.out.println("Coffee Cup 1 Price : LKR " + String.format("%.2f",Coffee));
					
					//user inputs
					System.out.print("Quantity : ");			
					qty = myScanner.nextDouble();
					
					//calculation
					total = Coffee * qty;
					
					System.out.println("Total Payment  : LKR " + String.format("%.2f",total ));
				
				}
				else if (num == 3) {
					
					System.out.println("Mango Juice 1 Price : LKR " +String.format("%.2f", Mango));
					
					//user inputs
					System.out.print("Quantity : ");			
					qty = myScanner.nextDouble();
					
					//calculation
					total = Mango * qty;
					
					System.out.println("Total Payment  : LKR " + String.format("%.2f",total) );
				
				}
				else if (num == 4) {
					
					System.out.println("Chocolate Shake  1 Price : LKR " + String.format("%.2f",ChocShake));
					
					//user inputs
					System.out.print("Quantity : ");			
					qty = myScanner.nextDouble();
					
					//calculation
					total = ChocShake * qty;
					
					System.out.println("Total Payment  : LKR " +String.format("%.2f", total ));
				
				}
				else if (num == 5) {
					
					System.out.println("Vanila Shake  1 Price : LKR " + String.format("%.2f",VanilShake));
					
					//user inputs
					System.out.print("Quantity : ");			
					qty = myScanner.nextDouble();
					
					//calculation
					total = VanilShake * qty;
					
					System.out.println("Total Payment  : LKR " +String.format("%.2f", total ));
				
				}
				else {
					
					System.out.println(" INVALID BEVERAGE ITEM NUMBER ");
				}
				
			}else {
				
				System.out.println(" INVALID MANUE NUMBER ");
			}
			//taking user inputs
			System.out.print("Do you want more Food Items (Yes/No)?" );
			more = myScanner.next();
			
			//calculation
			payment = payment + total ;
			
		}
		//display bill
		System.out.println("Your Total Bill is : "+ String.format("%.2f",payment) +" LKR");
		
		//user inputs
		System.out.print("How much would you pay ? : " );
		amount = myScanner.nextDouble();
		
		//check amount
		if (amount >= payment ) {
			
			//calculate balance
			change = amount - payment; 
			
			//displaying final messages
			System.out.println("------------------------------------------------------------------");
			System.out.println("-------------------      CUSTOMER BILL     -----------------------");
			System.out.println("------------------------------------------------------------------");
			System.out.println("                                                                 ");
			System.out.println("    Your Total Bill is : "+ String.format("%.2f",payment) +" LKR                       ");
			System.out.println("    Your Payment  is   : "+ String.format("%.2f",amount) +" LKR                        ");
			System.out.println("    Your Balance  is   : "+ String.format("%.2f",change) +" LKR                        ");
			System.out.println("                                                                 ");
			System.out.println("___________________________________________________________________");
			System.out.println();
			System.out.println("                 Thank you !  Have a nice day !!         ");
			System.out.println();
			System.out.println("-------------------  End of the Food Service  --------------------");
			System.out.println("__________________________________________________________________");
		}else {
			System.out.println("Invalid Payment.");
		}
		
			
		
		
	}

}
