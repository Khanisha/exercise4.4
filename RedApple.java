package exercise4_3;

public class RedApple extends Apple {
	private int weight;
	private String color;
	
	public RedApple(String name, int quantity, double price, int weight, String color) {
		super(name,quantity,price);
		this.weight = weight;
		this.color = color;
	}
	
	
	public int getWeight() {
		return this.weight;
	}

	public String getColor() {
		return this.color;
	}
	
	public String price(int quantity, double price) {
		return "Total Price : RM" + (price * quantity);
	}
	
	public int Weight(int weight, int quantity) {
		return weight  * quantity;
	}
	public String TotalWeight() {
		return "Total weight of Redapples: " + Weight(10,3);
	}
	
	public String toString() {
		return "Red Apple color is: ";
	}
	
	public void summary() {
		System.out.println(toString() + getColor());
		System.out.println(TotalWeight() + "g");
		System.out.println(price(2,0.95));
	}
}
