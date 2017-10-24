import java.util.Scanner;

public class HexDecBin {

	/*********************************************************************
	 * 
	 * FIX FAULTS! COMPLETE MISSING CODE!
	 * 
	 * ***************************************************
	 */
	//Scanner for float is now working
	Scanner kbd = new Scanner(System.in);
	String name = "";
	String hex = "";
	String base = "";
	String convert = "";
	int num;
	
	public HexDecBin() {
		System.out.println("Welcome to my Hexadecimal, Decimal, or Binary conversion program!");
		System.out.println("What is your name?");
		name = kbd.nextLine();
		System.out.println("Very nice to meet you " + name + " let's begin: \n");
	} //end of HexDecBin (constructor)
	
	public void setHexNumber() {
		/*
		System.out.println("\nEnter the hex number :");
		hex = kbd.nextLine();
		// mouse over parseInt to read pop=up guide
		num = Integer.parseInt(hex, 16);
		System.out.println("You have entered hex " + hex );
		System.out.println("Decimal value is " + num + "(remember 0-" + num + " has " + (num+1) + "values)");
		*/
		System.out.println("\nWhat is your starting base Hex, Dec, or Bin?");
		base = kbd.nextLine();
		System.out.println("Your base is " + base + ". What base do you want to convert to Hex, Dec or Bin?");
		convert = kbd.nextLine();
		System.out.println("You want to convert " + base + " to " + convert);
		if(base == "Hex") {
			System.out.println("Enter Hex base value: ");
			int HValue = kbd.nextInt();
			if(convert == "Dec") {
				
			} else if(convert == "Bin") {
				
			} else {
				System.out.println("You didn't type one of the values listed for the value you want to convert to. Please try again.");
			}
		} else if (base == "Dec") {
			System.out.println("Enter Dec base value: ");
			int DValue = kbd.nextInt();
			if(convert == "Hex") {
				
			} else if(convert == "Bin") {
				
			} else {
				System.out.println("You didn't type one of the values listed for the value you want to convert to. Please try again.");
			}
		} else if (base == "Bin") {
			System.out.println("Enter Bin base value: ");
			int BValue = kbd.nextInt();
			if(convert == "Bin") {
				
			} else if(convert == "Hex") {
				
			} else {
				System.out.println("You didn't type one of the values listed for the value you want to convert to. Please try again.");
			}
		} else {
			System.out.println("You didn't type one of the values listed for the base. Please try again.");
		}
	}
	/*
	void convert() {
		
		String binary = Integer.toBinaryString(num);
		
		System.out.println("Binary value is: " + binary);
		System.out.println("Number of bits is " + binary.length());
		System.out.println("Number of whole nibbles (4 bits) is x with y bits left over");
		System.out.println("Number of whole bytes (8 bits) is x with y bits remaining");
	}
	*/	
}
