package firealarm;

import java.util.Scanner;

public class FireAlarmPublishImpl implements FireAlarmPublish{

	
	private Scanner scanner = new Scanner(System.in);
	private int temperture;								
	private int tempScale;
	private int co;
	private int val;
	private String in;
	private boolean isAlarmOff = false;
	
	

	/*
	 * If the temperature has exceed the normal limit,
	 * Fire detection system will start warning and ask to contact fire brigade.
	 * Manually stop warning alarms. 
	 * */
	
	
	
	@Override
	public void FireAlarm() {
		
		while (true) {
			System.out.println("Choose a tempertaure scale"); 
			System.out.println("1) Celsius"); 
			System.out.println("2) Fahrenheit"); 
			System.out.print("Enter menu number: "); 
			tempScale = scanner.nextInt();
			
			System.out.println();
			
			if (tempScale == 1) {
				System.out.print("Enter temperature in Celsius: ");
				temperture = scanner.nextInt();
				
				if (temperture > 58) {
					/**
					 * if temperature is above 58 Celsius; 
					 * Start Warning
					 * */					
					startWarning();		
					
					if (isAlarmOff) {
						/* * 
						 * If the alarm is off break the loop
						 * and stop the service 
						 * */
						break;
					}					
					
					
				} else {
					/**
					 * if temperature is below the limit; 
					 * Display a message
					 * */
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("-------------------          NO FIRE DETECTED          -------------------");
					System.out.println("--------------------------------------------------------------------------");
					System.out.println();	
					break;
				}
				
			}
			else if (tempScale == 2) {
				System.out.print("Enter temperature in Fahrenheit: ");
				temperture = scanner.nextInt();
				
				if (temperture > 135) {
					/**
					 * if temperature is above 135 Fahrenheit; 
					 * Start Warning
					 * */
					startWarning();		
					
					if (isAlarmOff) {
						/* * 
						 * If the alarm is off break the loop
						 * and stop the service 
						 * */
						break;
					}
					
				} else {
					/**
					 * if temperature is below the limit; 
					 * Display a message
					 * */
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("-------------------          NO FIRE DETECTED          -------------------");
					System.out.println("--------------------------------------------------------------------------");
					System.out.println();	
					break;
				}
				
			}
			else {
				System.out.print("Wrong Input");
				System.out.println();
				continue;
			}
			
		}
						
	}
	
	/*
	 * This method displays a warning message
	 * and status of the different items 
	 * of the fire detection system
	 * */
	public void startWarning() {
		System.out.println();	
		System.out.println("##########################################################################");
		System.out.println(":::::::::  WARNING!!!   ---    FIRE DETECTED   ---    WARNING!!! :::::::::");
		System.out.println("##########################################################################");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("---------  Fire Alarm           :   ACTIVE     ---------------------------");
		System.out.println("---------  Water Sprinklers     :   ACTIVE     ---------------------------");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println();
		
		/*
		 * Contact the fire brigade if necessary
		 * */
		System.out.print("Do you want to contact fire brigade ? (Y/N): ");
		in = scanner.next();
		System.out.println();
			
		if (in.equalsIgnoreCase("Y")) {
			System.out.println("Contacting fire brigade.... ");
			System.out.println("........................... ");
			System.out.println();
				
		}
		
		while (true) {				
			System.out.print("Do you want to stop the alarm system ? (Y/N): ");
			in = scanner.next();
			System.out.println();
			
			/*
			 * If user choose to set off the alarm system;
			 * alarm system goes off and display the messages in the terminal
			 * and breaks the loop to stop the service
			 * */
			if (in.equalsIgnoreCase("Y")) {
				isAlarmOff = true;
				stoptWarning();		
				break;
			} else {
				isAlarmOff = false;
				System.out.println("---   Alarm system is running   --- ");	
				System.out.println();
				continue;
			}		
			
			
		}
		
		
		
	}	
	/*
	 * This method prints messages on the terminal
	 * when the user choose to stop the alarm system
	 * */
	public void stoptWarning() {
		System.out.println();	
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("---------  Fire Alarm           :   INACTIVE     ---------------------------");
		System.out.println("---------  Water Sprinklers     :   INACTIVE     ---------------------------");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();		

		System.out.println("---   Thank you for using the service   --- ");
		System.out.println();
	}
	
		

}
