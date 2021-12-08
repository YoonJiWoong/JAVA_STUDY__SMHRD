package Q6_2;

public class Restaurant extends Store{
	
	double service;
	double flavor;
	double clean;
	
	public Restaurant(double service, double flavor, double clean,String name,String event,Double price) {
		
		this.service = service;
		this.flavor = flavor;
		this.clean = clean;
		this.name = name;
		this.event = event;
		this.price = price;
	}
	
	public double grade() {
		return (service+flavor+clean+price)/4/0.01;
	}
	
	
	
}
