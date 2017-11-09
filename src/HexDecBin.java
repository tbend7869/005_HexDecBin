import java.util.Scanner;

import javax.swing.JOptionPane;

public class HexDecBin {

	/*********************************************************************
	 * 
	 * FIX FAULTS! COMPLETE MISSING CODE!
	 * 
	 * ***************************************************
	 */
	// Scanner for float is now working
	Scanner kbd = new Scanner(System.in);
	String name = "";
	String hex = "";
	String base = "";
	String convert = "";
	String msg = "";
	String HValue = "";
	String BinNum = "";
	String check = "";
	Boolean StopLoop = false;
	Boolean LoopCheck = false;
	int DValue;
	int num;

	public HexDecBin() {
		msg = "Welcome to my Hexadecimal, Decimal, or Binary conversion program!";
		JOptionPane.showMessageDialog(null, msg);
		msg = "What is your name?";
		name = JOptionPane.showInputDialog(msg);
		msg = "Very nice to meet you " + name + " let's begin: ";
		JOptionPane.showMessageDialog(null, msg);
	} // end of HexDecBin (constructor)

	public void setHexNumber() {
		/*
		 * System.out.println("\nEnter the hex number :"); hex = kbd.nextLine(); //
		 * mouse over parseInt to read pop=up guide num = Integer.parseInt(hex, 16);
		 * System.out.println("You have entered hex " + hex );
		 * System.out.println("Decimal value is " + num + "(remember 0-" + num + " has "
		 * + (num+1) + "values)");
		 */
		while (StopLoop == false) {
			msg = "What is your starting base Hex, Dec, or Bin?";
			base = JOptionPane.showInputDialog(msg);
			msg = "Your base is " + base + ". What base do you want to convert to Hex, Dec or Bin?";
			convert = JOptionPane.showInputDialog(msg);
			msg = "You want to convert " + base + " to " + convert;
			JOptionPane.showMessageDialog(null, msg);
			if (base.equalsIgnoreCase("Hex")) {
				msg = "Enter Hex base value: ";
				HValue = JOptionPane.showInputDialog(msg);
				num = Integer.parseInt(HValue, 16);
				if (convert.equalsIgnoreCase("Dec")) {
					JOptionPane.showMessageDialog(null, "Decimal Value for Hex input: " + num);
					LoopCheck = true;
				} else if (convert.equalsIgnoreCase("Bin")) {
					BinNum = Integer.toBinaryString(num);
					JOptionPane.showMessageDialog(null, "Binary Value for Hex input: " + BinNum);
					LoopCheck = true;
				} else {
					msg = "You didn't type one of the values listed for the value you want to convert to. Please try again.";
					JOptionPane.showMessageDialog(null, msg);
					StopLoop = false;
				}
			} else if (base.equalsIgnoreCase("Dec")) {
				msg = "Enter Dec base value: ";
				DValue = Integer.parseInt(JOptionPane.showInputDialog(msg));
				if (convert.equalsIgnoreCase("Hex")) {
					HValue = Integer.toHexString(DValue).toUpperCase();
					JOptionPane.showMessageDialog(null, "Hexidecimal value for Dec input: " + HValue);
					LoopCheck = true;
				} else if (convert.equalsIgnoreCase("Bin")) {
					BinNum = Integer.toBinaryString(DValue);
					JOptionPane.showMessageDialog(null, "Binary value for Dec input: " + BinNum);
					LoopCheck = true;
				} else {
					msg = "You didn't type one of the values listed for the value you want to convert to. Please try again.";
					JOptionPane.showMessageDialog(null, msg);
					StopLoop = false;
				}
			} else if (base.equalsIgnoreCase("Bin")) {
				msg = "Enter Bin base value: ";
				BinNum = JOptionPane.showInputDialog(msg);
				DValue = Integer.parseUnsignedInt(BinNum, 2);
				if (convert.equalsIgnoreCase("Hex")) {
					HValue = Integer.toHexString(DValue).toUpperCase();
					JOptionPane.showMessageDialog(null, "Hexidecimal value for Bin input: " + HValue);
					LoopCheck = true;
				} else if (convert.equalsIgnoreCase("Dec")) {
					JOptionPane.showMessageDialog(null, "Decimal value for Bin input: " + DValue);
					LoopCheck = true;
				} else {
					msg = "You didn't type one of the values listed for the value you want to convert to. Please try again.";
					JOptionPane.showMessageDialog(null, msg);
					StopLoop = false;
				}
			} else {
				System.out.println("You didn't type one of the values listed for the base. Please try again.");
				StopLoop = false;
			}
			if (LoopCheck == true) {
				msg = "Would you like to do another conversion? (y/n) ";
				check = JOptionPane.showInputDialog(msg);
				if (check.equalsIgnoreCase("n")) {
					StopLoop = true;
				} else {
					StopLoop = false;
				}
			}
		}
	}
	/*
	 * void convert() {
	 * 
	 * String binary = Integer.toBinaryString(num);
	 * 
	 * System.out.println("Binary value is: " + binary);
	 * System.out.println("Number of bits is " + binary.length()); System.out.
	 * println("Number of whole nibbles (4 bits) is x with y bits left over");
	 * System.out.
	 * println("Number of whole bytes (8 bits) is x with y bits remaining"); }
	 */
}
