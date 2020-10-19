import acm.program.ConsoleProgram;

public class Problem5 extends ConsoleProgram{

	public void run() {
		demonstration();
	}
	
	public void demonstration() {
		String bugger = "bugger";
		String goober = "gooober";
		
		println(removeDoubleChars(bugger));
		println(removeDoubleChars(goober));
		
	}
	
	public String removeDoubleChars(String string) {
		char aChar = ' ';
		String newString = "";
		
		for(int i = 0; i < string.length(); i++) {
			aChar = string.charAt(i);
			
			if(i == 0 || aChar != string.charAt(i - 1)) {
				newString = newString + aChar;
			}
		}
		
		return newString;
	}
}
