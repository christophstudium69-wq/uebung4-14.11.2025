package h3;

public class H3_main {
	public static void main(String[] args) {
		float  celsiusFloat     = 14.2f;
		float  fahrenheitFloat  = 0;
		
		fahrenheitFloat = celsiusFloat * 9/5 + 32;
		System.out.println("celsiusFloat = " + celsiusFloat);
		System.out.println("fahrenheitFloat = " + fahrenheitFloat);
		
		System.out.println();
		
		double celsiusDouble    = 14.2;
		double fahrenheitDouble = 0;
		
		fahrenheitDouble = celsiusDouble * 9/5 + 32;
		System.out.println("celsiusDouble = " + celsiusDouble);
		System.out.println("fahrenheitDouble = " + fahrenheitDouble);
		}
}
