package mainapp;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;


import roomreservation.RoomReservationPublish;
import stockservice.StockPublish;
import supplierservice.SupplierPublish;
import vehicleservice.VehicleServicePublish;
import banquetsevice.BanquetServicePublish;
import employeeservice.EmployeePublish;
import firealarm.FireAlarmPublish;
import food_order.FoodOrderPublish;



public class MainAppActivator implements BundleActivator {
	
	ServiceReference serviceReference;
	
	Scanner sc = new Scanner(System.in);
	int num = 0;
	
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Start Hotel Management System");
		System.out.println();
				
		while (true) {
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.println("#########################################################################");
			System.out.println("::::::::::::::::::  Welcome to Hotel Management System   ::::::::::::::::");
			System.out.println("#########################################################################");
			System.out.println("#                                                                       #");
			System.out.println("#                              MAIN MENU                                #");
			System.out.println("# --------------------------------------------------------------------- #");
			System.out.println("#     1  ->  Food and Beveragers                                        #");
			System.out.println("#     2  ->  Room Service                                               #");
			System.out.println("#     3  ->  Banquet Service                                            #");
			System.out.println("#     4  ->  vehicle Service                                            #");
			System.out.println("# --------------------------------------------------------------------- #");
			System.out.println("#     5  ->  Employee Service                                           #");
			System.out.println("#     6  ->  Supplier Service                                           #");
			System.out.println("#     7  ->  Stock Service                                              #");
			System.out.println("#     8  ->  Fire Dictetor Service                                      #");
			System.out.println("#     0  ->  EXIT                                                       #");
			System.out.println("# --------------------------------------------------------------------- #");
			System.out.println();
			
			
			System.out.print("Enter Menu No: ");			
			num = sc.nextInt();
			
			System.out.println();
			
			/*
			 * Food
			 * */
			if (num == 1) {
				System.out.println("----  Food Order Service    ----");
				System.out.println();
				
				serviceReference = bundleContext.getServiceReference(FoodOrderPublish.class.getName());
				FoodOrderPublish foodOrderPublish  = (FoodOrderPublish) bundleContext.getService(serviceReference);
				
				foodOrderPublish.FoodOrder();
				
			} 
			/*
			 * ROOM
			 * */
			else if (num == 2) {
				System.out.println("----  Room  Service ----");
				System.out.println();
				
				serviceReference = bundleContext.getServiceReference(RoomReservationPublish.class.getName());
				RoomReservationPublish roomReservationPublish = (RoomReservationPublish) bundleContext.getService(serviceReference);
				
				roomReservationPublish.RoomReservation();;
				
			}
			/*
			 * Banquet Service
			 * */
			else if (num == 3) {
				
				System.out.println("----------  Banquet   ----------");
				System.out.println();
				
				serviceReference = bundleContext.getServiceReference(BanquetServicePublish.class.getName());
				BanquetServicePublish banquetServicePublish = (BanquetServicePublish) bundleContext.getService(serviceReference);
				
				banquetServicePublish.BanquetService();
			}
			/*
			 * Vehicle service
			 * */
			else if (num == 4) {
				System.out.println("-------- Vehicle Service   -------");
				System.out.println();
				
				serviceReference = bundleContext.getServiceReference(VehicleServicePublish.class.getName());
				VehicleServicePublish vehicleServicePublish = (VehicleServicePublish) bundleContext.getService(serviceReference);
				
				vehicleServicePublish.VehicleService();
			}
			
			/*
			 * Employee service
			 * */
			
			else if (num == 5) {
				System.out.println("-------- Employee Registration Service   -------");
				System.out.println();
				
				serviceReference = bundleContext.getServiceReference(EmployeePublish.class.getName());
				EmployeePublish employeePublish = (EmployeePublish) bundleContext.getService(serviceReference);
				
				employeePublish.Employee();
				
				
			}
			
			/*
			 * Supplier service
			 * */
			
			else if (num == 6) {
				System.out.println("-------- Supplier Registration Service   -------");
				System.out.println();
				
				serviceReference = bundleContext.getServiceReference(SupplierPublish.class.getName());
				SupplierPublish supplierPublish = (SupplierPublish) bundleContext.getService(serviceReference);
				
				supplierPublish.Supplier();
				
				
			}
			
			/*
			 * Stock service
			 * */
			
			else if (num == 7) {
				System.out.println("-------- Stock Service   -------");
				System.out.println();
				
				serviceReference = bundleContext.getServiceReference(StockPublish.class.getName());
				StockPublish stockPublish = (StockPublish) bundleContext.getService(serviceReference);
				
				stockPublish.Stock();
				
				
			}
			
			/*
			 * Fire Alarm
			 * */
			
			else if (num == 8) {
				System.out.println("-------- Fire Alarm Service   -------");
				System.out.println();
				
				serviceReference = bundleContext.getServiceReference(FireAlarmPublish.class.getName());
				FireAlarmPublish fireAlarmPublish = (FireAlarmPublish) bundleContext.getService(serviceReference);
				
				fireAlarmPublish.FireAlarm();
				
				
			}
			
			
			/*
			 * EXIT
			 * */
			else if (num == 0) {
				System.out.println("----  See You Again ----");	
				System.out.println();
				break;
				
			} else {
				System.out.println("Enter a valid menu number");
				System.out.println();
				continue;
				
			}
						
		}
		
		
		
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Stop Hotel Management System");
		bundleContext.ungetService(serviceReference);
	}

}


	
