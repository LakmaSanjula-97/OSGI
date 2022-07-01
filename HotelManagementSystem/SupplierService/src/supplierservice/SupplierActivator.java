package supplierservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class SupplierActivator implements BundleActivator {

	
	ServiceRegistration publishServiceReg;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Supplier Registration Service started");
		
		SupplierPublish supplierPublish = new SupplierPublishImpl();
		
		publishServiceReg = context.registerService(SupplierPublish.class.getName(), supplierPublish, null);
		
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Supplier Registration Service stopped");
		publishServiceReg.unregister();
		
	}

}
