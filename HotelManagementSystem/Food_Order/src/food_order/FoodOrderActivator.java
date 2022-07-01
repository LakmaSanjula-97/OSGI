package food_order;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class FoodOrderActivator implements BundleActivator {

	ServiceRegistration publishServiceReg;

	
	
	
	
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Food Order Service started");
		
		FoodOrderPublish foodOrderPublish = new FoodOrderPublishImpl();
		
		publishServiceReg = context.registerService(FoodOrderPublish.class.getName(), foodOrderPublish, null);
		
	}
	
	

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Food Order Service stopped");
		publishServiceReg.unregister();
	}

}
