
public enum BodyType {
	
		SEDAN("Sedan"), TRUCK("Truck"), CROSSOVER("Crossover"), 
		SUV("Sport-Utility Vehicle"), HATCHBACK("Hatchback"), 
		VAN("Van"), COMPACT("Compact"), SPORTSCAR("Sportscar"), OTHER("Other");
		
		String name; 
		
		BodyType(String name)
		{
			this.name = name;
		}
}
