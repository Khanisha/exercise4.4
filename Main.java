package exercise4_3;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("-APPLE-");
		Apple objapple = new Apple("Apple", 2, 0.50);
		objapple.summary();
		System.out.println();
		
		System.out.println("-REDAPPLE-");
		RedApple objredapple = new RedApple("HoneyCrisp",2,0.95,25,"Bright Red");
		objredapple.summary();
		System.out.println();
		
		System.out.println("-GREENAPPLE-");
		GreenApple objgreenapple = new GreenApple("Crispin",3,0.90,"Light Green",10,40);
		objgreenapple.summary();
		System.out.println();
		
	}
	}

