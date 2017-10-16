import java.util.Scanner;

public class BinPower {
	
	//Fixed Scanner bug for float inputs
	Scanner input = new Scanner(System.in);
	
	/*
	 * String is cap'd, reason: It is a Class
	 * int is not cap'd, reason: It is a "primitive" type, means not a Class
	 * Integer -- full name, with cap is a Class!
	 * double, lower case is also a "primitive 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public BinPower() {
		
	}
	
	public void setBinary() {
		
		// 2**2 does not work, differs from Python, got an error msg
		
		double exp = 2;
		double base = 0;
		int ans = 0;
		double answer;
		String name = "";
		
		//ans  = 2^2;
		//System.out.println("Answer is: " ans);
		//Does not work, but doesn't give error msg
		
		// don't need!!!!!
		// Math myMath = new Math();
		// why? because it is "static" -- means just use it!
		
		System.out.println("Hello most amazing Java student! What is your name?");
		name = input.nextLine();
		System.out.println("Thanks for using my most awesome program " + name);
		
		System.out.println(name + " what base number do you want to enter?");
		/// what goes here???
		base = input.nextDouble();
		System.out.println(name + " you have entered: " + base);
		
		System.out.println(name + " what binary eponent do you want to enter?");
		/// what goes here???
		exp = input.nextDouble();
		System.out.println(name + "you have entered: " + exp);
		

		// (int) "Type Casting" -- pow requires double, which makes no sense in binary
		// so type cast to correct answer
		answer = Math.pow(base, exp);
		System.out.println("Answer is: " + answer);
		
		
		
	}
}
		
