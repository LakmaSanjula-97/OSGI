package employeeservice;

import java.util.Scanner;


public class EmployeePublishImpl implements EmployeePublish{
	
	//keyboard inputs
	private Scanner myScanner = new Scanner(System.in);
	
	//declare variables
	private double Manager = 100000.00;
	private double Receptionist = 50000.00;
	private double Chef = 75000.00;
	private double CleaningService = 35000.00;
	private double Security = 30000.00;
	private double Driver = 40000.00;
	private double salary = 0;
	private int manue = 0;
	String more = "Yes";
	String empName = null, address = null, nic = null, dateOfBirth = null, gender = null, type = null;

	@Override
	public void Employee() {
		
		//display details
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println("---------------  ALL EMPLOYEE TYPES  DETAILS ---------------");
		System.out.println("------------------------------------------------------------");
		System.out.println();
		System.out.println("     1 =>  Manager     " );
		System.out.println("     2 =>  Receptionist");
		System.out.println("     3 =>  Chef");
		System.out.println("     4 =>  Cleaning Service");
		System.out.println("     5 =>  Security");
		System.out.println("     6 =>  Driver");
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------");
		System.out.println();
		
		
		
		while(more.equalsIgnoreCase("Yes")) {
			System.out.println();
			
			//user inputs
			System.out.print("Employee Name : ");
			empName = myScanner.next();
			
			//user inputs
			System.out.print("Employee Address : ");
			address = myScanner.next();
			
			//user inputs
			System.out.print("Employee NIC Number : ");
			nic = myScanner.next();
			
			//user inputs
			System.out.print("Employee Birth Date : ");
			dateOfBirth = myScanner.next();
			
			//user inputs
			System.out.print("Employee Gender : ");
			gender = myScanner.next();
			
			//user inputs
			System.out.print("Select Employee type (1. Manager  2. Receptionist   3. Chef  4. Cleaning Service   5. Security   6. Driver  ) : ");			
			manue = myScanner.nextInt();
			
			//check condition
			if (manue == 1) {
				
				type = "Manager";
				
				salary = Manager;
				
				
			}
			//check condition
			else if (manue == 2) {
				
				type = "Receptionist";
				
				salary = Receptionist;
				
				
			}
			//check condition
			else if (manue == 3){
				
				type = "Chef";
				
				salary = Chef;
				
				
			}
			//check condition
			else if (manue == 4) {
				
				type = "Cleaning Service";
				
				salary = CleaningService;
				
				
			}
			//check condition
			else if (manue == 5) {
				
				type = "Security";
				
				salary = Security;
				
				
			}
			//check condition
			else if (manue == 6) {
				
				type = "Driver";
				
				salary = Driver;
				
				
				
			}else 
			{
				System.out.println("Invalid Employee Category Number ");
			}
			
			//display details
			
			System.out.println();
			System.out.println("------------------------------------------------------------");
			System.out.println("----------- RECENTLY ADDED  EMPLOYEE  DETAILS   ------------");
			System.out.println("------------------------------------------------------------");
			System.out.println();
			System.out.println("Employee Name : " + empName);
			System.out.println("Employee Address : " + address);
			System.out.println("Employee NIC : " + nic);
			System.out.println("Employee Date Of Birth : " + dateOfBirth);
			System.out.println("Employee Gender : " + gender);
			System.out.println("Employee Type : " + type);
			System.out.println("Employee Basic Salary : " + String.format("%.2f",salary));
			System.out.println();
			System.out.println("-------------  Employee  Successfully Added     ------------");
			System.out.println();
		
		
			//taking user inputs
			System.out.print("Do you want add  more employees (Yes/No) ?" );
			more = myScanner.next();
				
		}
		
		//end message
		System.out.println();
		System.out.println("-------------  End of the Employee Registration Service     ------------");
		System.out.println();
		
		
		
	}

}
