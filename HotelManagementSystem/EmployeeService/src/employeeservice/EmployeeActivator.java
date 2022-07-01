package employeeservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class EmployeeActivator implements BundleActivator {
	
	ServiceRegistration publishServiceReg;

	
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Employee Registration Service started");
		
		EmployeePublish employeePublish = new EmployeePublishImpl();
		
		publishServiceReg = context.registerService(EmployeePublish.class.getName(), employeePublish , null);
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Employee Registration Service stopped");
		publishServiceReg.unregister();
		
	}

}
