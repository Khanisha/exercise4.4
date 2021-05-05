package exercise4_3;

public class Fruit {
	private String name;
    private double price;
    
	public Fruit(String name,double price) {
		this.name = name;
		this.price = price;
		
		System.out.println(name + " constructor is invoked");
	}
	
	public String price(double price) {
		return "Price : RM" + price;
	}
}
