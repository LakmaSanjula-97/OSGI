package supplierservice;

import java.util.ArrayList;
import java.util.Scanner;

public class SupplierPublishImpl implements SupplierPublish {
	
	//get inputs from the keyboard
	private Scanner myScanner = new Scanner(System.in);
	
	
	//declare variables
	String more = "Yes";
	String type = "Yes";
	String supName = null, address = null, nic = null, sup_type = null;
	private int manue = 0;
	
	//create array List
	
	ArrayList<String> items = new ArrayList<String>();
	
	@Override
	public void Supplier() {
		
		// display details
		
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println("---------------  ALL SUPPLIER TYPES  DETAILS ---------------");
		System.out.println("------------------------------------------------------------");
		System.out.println();
		System.out.println("     1 =>  Furniture     " );
		System.out.println("     2 =>  Decorations ");
		System.out.println("     3 =>  Cleaning Items ");
		System.out.println("     4 =>  Electric Items ");
		System.out.println("     5 =>  Food Items");
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------");
		System.out.println();
		
		
		//loop for repetition

		while(more.equalsIgnoreCase("Yes")) {
			System.out.println();
			
			//USer Inputs
			System.out.print("Supplier Name : ");
			supName = myScanner.next();
			
			//USer Inputs
			System.out.print("Supplier Address : ");
			address = myScanner.next();
			
			//USer Inputs
			System.out.print("Supplier NIC Number : ");
			nic = myScanner.next();
			
			//USer Inputs
			System.out.print("Select Supplier type (1. Furniture  2. Decoration   3. Cleaning Items  4.  Electric Items   5. Food Items  ) : ");			
			manue = myScanner.nextInt();
			
			//Check whether manue number is valid or invalid
			
			while(!(manue == 1 || manue == 2 || manue == 3 || manue == 4 || manue == 5)) {
				
					//Error message
			       System.out.println("Invalid Supplier Type Number ");
			       
			     //USer Inputs
			       
			       System.out.print("Select Supplier type (1. Furniture  2. Decoration   3. Cleaning Items  4.  Electric Items   5. Food Items  ) : ");	
			      			
			       manue = myScanner.nextInt();
			
			}
			
			items.removeAll(items);	
			
			//check manue number
			if (manue == 1) {
				
				sup_type = "Furniture";
				
				//USer Inputs
				System.out.println("Types of Furniture items  :  ");
				
				/*
				 * of user need to stop enter data to the array user 
				 * should input 'no' as a keyboard input*/
				System.out.println("-- please enter 'No'  after enter all the ietms --  ");
				type = myScanner.next();
				
				//loop for repetition
				while(!type.equalsIgnoreCase("No")) {
					
					items.add(type);
					type = myScanner.next();
					

					
				}
				
			}
			else if (manue == 2) {
				
				sup_type = "Decoration";
				
				System.out.println("Types of Decorations items  :  ");
				
				/*
				 * of user need to stop enter data to the array user 
				 * should input 'no' as a keyboard input*/
				
				System.out.println("-- please enter 'No'  after enter all the ietms --  ");
				type = myScanner.next();
				//loop for repetition
				while(!type.equalsIgnoreCase("No")) {
					
					items.add(type);
					type = myScanner.next();
					

					
				}
				
			}
			else if (manue == 3) {
				
				sup_type = "Cleaning Items";
				System.out.println("Types of Cleaning Items items  :  ");
				
				/*
				 * of user need to stop enter data to the array user 
				 * should input 'no' as a keyboard input*/
				System.out.println("-- please enter 'No'  after enter all the ietms --  ");
				type = myScanner.next();
				
				//loop for repetition
				while(!type.equalsIgnoreCase("No")) {
					
					items.add(type);
					type = myScanner.next();
					

					
				}
							}
			else if (manue == 4) {
				
				sup_type = "Electric Items";
				
				System.out.println("Types of Electric Items  :  ");
				
				/*
				 * of user need to stop enter data to the array user 
				 * should input 'no' as a keyboard input*/
				System.out.println("-- please enter 'No'  after enter all the ietms --  ");
				type = myScanner.next();
				
				//loop for repetition
				while(!type.equalsIgnoreCase("No")) {
					
					items.add(type);
					type = myScanner.next();
					

					
				}
				
				
			}
			else if (manue == 5) {
				
				sup_type = "Food Items";
				
				System.out.println("Types of Food items  :  ");
				
				/*
				 * of user need to stop enter data to the array user 
				 * should input 'no' as a keyboard input*/
				System.out.println("-- please enter 'No'  after enter all the ietms --  ");
				type = myScanner.next();
				
				//loop for repetition
				while(!type.equalsIgnoreCase("No")) {
					
					items.add(type);
					type = myScanner.next();
					

					
				}
				
				
				
			}
			//display supplier details
			System.out.println();
			System.out.println("------------------------------------------------------------");
			System.out.println("----------- RECENTLY ADDED  SUPPLIER  DETAILS   ------------");
			System.out.println("------------------------------------------------------------");
			System.out.println();
			System.out.println("Supplier Name : " + supName);
			System.out.println("Supplier Address : " + address);
			System.out.println("Supplier NIC : " + nic);
			System.out.println("Supplier Type : " + sup_type);
			System.out.println("Types of items : " + items);
			System.out.println();
			System.out.println("-------------  Supplier  Successfully Added     ------------");
			System.out.println();
			
			
			//taking user inputs
			System.out.print("Do you want add moe suppliers (Yes/No)?" );
			more = myScanner.next();
			
			System.out.println();
			
		}
		
		// end message
		System.out.println();
		System.out.println("-------------  End of the Employee Registration Service     ------------");
		System.out.println();
		
	}

}
