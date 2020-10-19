import acm.program.ConsoleProgram;

public class Problem3 extends ConsoleProgram {

	private int biggest;
	private int secondBiggest;

	public void run() {
		demonstration();
	}

	public void demonstration() {

		println("Enter at least two integers and then enter 0 to end the program.");
		while (true) {
			int input = readInt("Please enter a number: ");

			if (input == 0) {
				break;
			}

			assignBiggestAndSecondBiggest(input);
		}

		printResults();
	}

	public void assignBiggestAndSecondBiggest(int number) {
		if (number > biggest) {
			secondBiggest = biggest;
			biggest = number;
		} else {
			if (number > secondBiggest) {
				secondBiggest = number;
			}
		}
	}

	public void printResults() {
		println("The biggest number = " + biggest);
		println("The second biggest number = " + secondBiggest);
	}

}
