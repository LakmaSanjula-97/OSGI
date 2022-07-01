package roomreservation;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class RoomReservationActivator implements BundleActivator {
	
	
	ServiceRegistration publishServiceReg;

	

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Room Reservation is started");
		
		RoomReservationPublish roomReservationPublish = new RoomReservationPublishImpl();
		
		publishServiceReg = context.registerService(RoomReservationPublish.class.getName(), roomReservationPublish, null);
		
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Room Reservation is stopped");
		publishServiceReg.unregister();
		
	}

}
