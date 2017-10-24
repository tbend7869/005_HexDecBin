
public class RunHere {
	
	/* Grading Req's! */
	/*
	 * 1. All JOP's remove / comment out Scanner, syso
	 * 2. Runnable jar -- stand alone outside of Eclipse
	 * 3. Ask for name, repeat name with friendly "Hello ...
	 * 4. Ask "What base are we starting with, Hex, Cec, or Bin?"
	 * 5. Ask "What base are we converting to, Hex, Dec, or Bin?"
	 * 6. Enter the starting number
	 * 7. Do the conversion, display the result
	 * Ask if they want to go again; if yes start over, if no friendly exit
	 */

		public static void main(String[] args) {
			
			//Added hex to bin funtionality (just for git practice)
			HexDecBin baseConverter = new HexDecBin();
			baseConverter.setHexNumber();
			//baseConverter.convert();
			
			BinPower binpower = new BinPower();
			binpower.setBinary();
		}

}
