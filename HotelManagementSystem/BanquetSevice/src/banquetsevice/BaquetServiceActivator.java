package banquetsevice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class BaquetServiceActivator implements BundleActivator {
	

	ServiceRegistration publishServiceReg;
	
	

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Banquet Service is started");
		
		BanquetServicePublish banquetServicePublish =  new BanquetServicePublishImpl();
		
		publishServiceReg = context.registerService(BanquetServicePublish.class.getName(), banquetServicePublish, null);
			
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Banquet Service is stopped");
		publishServiceReg.unregister();
	}

}
