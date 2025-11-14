package h2;

public class H2_main {
	public static void main(String[] args) {
		boolean x = true; 
		boolean y = true;
		
		boolean a = true;
		boolean b = true;
		boolean c = true;
		
		int input = 11;    
		// Nur 0,1,10 oder 11
		
		// E1: x ist wahr (hat also den Wert true).
		// E2: y ist wahr.
		// E3: die Werte von x und y sind unterschiedlich.
		
		if (input == 10 || input == 11) {
			x = true;
			} else {
			x = false;}
		
		if (input == 11 || input == 1) {
			y = true;
		    } else {
		    y = false;}
		
		if (x && y) {
		    a = true;
		    } else {
			a = false;}
		
		if (x && y) {
		    b = true;
		    } else {
			b = false;}
		
		if (x == y) {
		    b = false;
		    } else {
			b = true;}
		
		if (x && y)
			c = false;
		if (x && !y)
			c = true;
		if (!x && y)
			c = false;
		if (!x && !y)
		   c = true;
			
		System.out.println("input = " + input);
		System.out.println();
		System.out.println("x = " + x + " | y = " + y);
		System.out.println();
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
	}
}
