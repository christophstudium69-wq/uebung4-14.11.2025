package h1;

public class H1_main {
	public static void main(String[] args) {
		int zone = 4;
		double price = 40.35;
		
		price = 2.00;
		
		switch (zone) {
		case 1:
			price = 2.00;
			System.out.println("price = " + price + "$");
			break;
		case 2:
			price = 2.00;
			price += 0.35;
			System.out.println("price = " + price + "$");
			break;
		case 3:
			price = 2.35;
			price += 0.5;
			System.out.println("price = " + price + "$");
			break;
		case 4:
			price = 2.35;
			price += 0.5;
			System.out.println("price = " + price + "$");
			break;
		case 5:
			price = 2.85;
			price += 0.70;
			System.out.println("price = " + price + "$");
			break;
		default:
			price = 4;
			System.out.println("price = " + price + "$");
			break;
		}
	}
}
