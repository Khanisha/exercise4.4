package exercise4_3;

public class Apple extends Fruit {
	private int quantity; 
	private double price;

		
		public Apple (String name, int quantity, double price) {
			super(name,price);
			this.quantity = quantity;
		
		}
		
		public int getQuantity() {
			return quantity;
		}
		public double Getprice() {
			return price;
		}
		public String price(int quantity, double price) {
			return "Total Price : RM " + (price * quantity);
		}
		
		public String toString() {
			return "Total price of apples: ";
		}

		public void summary() {
			System.out.println(toString() + price(2,0.50));
		}
}
