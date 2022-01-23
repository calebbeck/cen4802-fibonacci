package fibonacci;

public class Fibonacci {
	
	public static void main(String[] args) {
		int fibPos = 10;
		
		System.out.println("The " + fibPos + "th number in the fibonacci sequence is:  " +  calcFib(10));
	}

	static int calcFib(int num) {
		if ((num == 0) || (num == 1)) {
			return num;
		} else {
			return calcFib(num-1) + calcFib(num-2);
		}
	}
}
