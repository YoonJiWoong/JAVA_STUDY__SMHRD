package Q6_2;

public class Salon extends Store{
	
	double technology;
	double kindness;
	
	public double grade() {
		return (technology+kindness+price)/3/0.01;
	}

	
	
	public Salon(double technology, double kindness,String name, String event, Double price) {
		this.name= name;
		this.event= event;
		this.price = price;
		this.technology = technology;
		this.kindness = kindness;
	}
	
	
	
	
}
