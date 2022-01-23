package fibonacci;

/*
 * This application is written to display a given number in the fibonacci sequence.
 * @author "Caleb Beck"
 */



public class Fibonacci {
	
	public static void main(String[] args) {
		int fibPos = 10;
		
		System.out.println("The " + fibPos + "th number in the fibonacci sequence is:  " +  calcFib(10));
	}

	/*
	 * Method for displaying the specified number in the fibonacci sequence.
	 * @param num	Desired position in the fibonacci sequence.
	 * @returns		Calculated fibonacci sequence number.
	 */
	static int calcFib(int num) {
		if ((num == 0) || (num == 1)) {
			return num;
		} else {
			return calcFib(num-1) + calcFib(num-2);
		}
	}
}
