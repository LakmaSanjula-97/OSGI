package stockservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class StockActivator implements BundleActivator {
	
	ServiceRegistration publishServiceReg;

	

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Stock Service started");
		
		StockPublish stockPublish = new StockPublishImpl();
		
		publishServiceReg = context.registerService(StockPublish.class.getName(), stockPublish, null);
		
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Stock Service stopped");
		publishServiceReg.unregister();
		
	}

}
