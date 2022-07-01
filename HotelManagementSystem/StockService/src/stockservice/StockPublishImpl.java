package stockservice;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPublishImpl implements StockPublish{
	
	//get inputs from keyboard
	private Scanner myScanner = new Scanner(System.in);
	
	/*
	 *Declare variables 
	 * */
	
	private double unitPrice = 0,qty =0, Total = 0, amount = 0;
	
	String more = "Yes",buy = "Yes" , StkId = null, SupId = null, Type = null, Item = null, payment = null;
	
	/*
	 * Create array list
	 * */
	
	ArrayList<String> stock = new ArrayList<String>();
	

	@Override
	public void Stock() {
		
		/*
		 * while loop
		 * */
		
		while(more.equalsIgnoreCase("Yes")) {
			System.out.println();
			buy = "Yes";
			
			// get stock Id
			
			System.out.print("Stock Id : ");
			StkId = myScanner.next();
			stock.add(StkId);
			
			// get supplier id
			
			System.out.print("Supplier Id : ");
			SupId= myScanner.next();
			stock.add(SupId);
			
			while(buy.equalsIgnoreCase("Yes")){
				
				
				//item type
				System.out.print("Item Type : ");
				Item= myScanner.next();
				stock.add(Item);
				
				//get unit price of the Item
				System.out.print("Item Unit Price : ");
				unitPrice = myScanner.nextDouble();
				String price = String.valueOf(unitPrice);
				stock.add(price);
				
				//Get quantity of the item
				System.out.print("Item Quantity : ");
				qty = myScanner.nextDouble();
				String qnty = String.valueOf(qty);
				stock.add(qnty);
				
				//calculate the total price of the Items
				Total = unitPrice * qty;
				
				String payment = String.valueOf(Total);
				stock.add(payment);
				
				System.out.println("Total Payment : " + payment);
				
				//calculate full payment
				amount = amount + Total;
				
				// ask to user inputs
				System.out.print("Do you want add  more items (Yes/No) ?" );
				buy = myScanner.next();
				
			}
			//display details
			
			
			System.out.println();
			System.out.println("------------------------------------------------------------");
			System.out.println("-----------------       STOCK  DETAILS     -----------------");
			System.out.println("------------------------------------------------------------");
			System.out.println();
			System.out.println("Stock Id  : " + StkId);
			System.out.println("Supplier Id  : " + SupId);
			
			System.out.println("Full Payment  : " +  String.format("%.2f",amount));
			System.out.println();
			System.out.println("-------------  Stock Details  Successfully Added     ------------");
			System.out.println();
	
	
			//taking user inputs
			System.out.print("Do you want add  more stock details (Yes/No) ?" );
			more = myScanner.next();
			
		}
	
		//End message Details
		
		System.out.println();
		System.out.println("-------------  All Stock Details Are Successfully Added   ----------");
		System.out.println();
		System.out.println("-------------  End of the Stock Management Service    --------------");
		System.out.println();
	
	
	

			
	}

}
