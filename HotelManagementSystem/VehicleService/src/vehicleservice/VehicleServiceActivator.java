package vehicleservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class VehicleServiceActivator implements BundleActivator {
	
	ServiceRegistration publishServiceReg;

	
	
	
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Vehicle Service is started");
		
		VehicleServicePublish vehicleServicePublish  = new VehicleServicePublishImpl();
		
		publishServiceReg = context.registerService(VehicleServicePublish.class.getName(), vehicleServicePublish, null);
		
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Vehicle Service is stopped");
		publishServiceReg.unregister();
		
	}

}
