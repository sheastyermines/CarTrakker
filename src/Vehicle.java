import java.util.ArrayList;

public class Vehicle {
	
	private BodyType body;
	private int year; 
	private String make; 
	private String model;
	
	private int milage;
	private String vin;
	private String licensePlate;
	private ArrayList<ServiceEvent> serviceHistory;
	
	public Vehicle(BodyType body, int year, String make, String model, 
					int milage, String vin, String licensePlate) 
	{
		this.body = body;
		this.year = year;
		this.make = make;
		this.model = model;
		this.milage = milage;
		this.vin = vin;
		this.licensePlate = licensePlate;
	} 
	
	
	public void addServiceEvent(ServiceEvent service)
	{
		serviceHistory.add(service);
	}
}
