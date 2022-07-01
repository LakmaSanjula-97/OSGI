package firealarm;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class FireAlarmActivator implements BundleActivator {

	ServiceRegistration publishServiceReg;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Fire Alarm Service started");
		
		FireAlarmPublish fireAlarmPublish = new FireAlarmPublishImpl();
		
		publishServiceReg = context.registerService(FireAlarmPublish.class.getName(), fireAlarmPublish, null);
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Fire Alarm Service stopped");
		publishServiceReg.unregister();
		
	}

}
