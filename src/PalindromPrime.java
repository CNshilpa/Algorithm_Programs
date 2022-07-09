
public class PalindromPrime {
	public static void main(String[] args) {
		System.out.println("Armstrong Numbers 0 to 1000 >>");
		for (int i = 1; i <= 1000; i++) {
			if (Armstrong(i) == true) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\nPalindrome Numbers 0 to 1000 >>");
		for (int i = 0; i <= 1000; i++) {
			if (Palindrome(i) == true) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\nPrime Numbers up to 100 >>");
		for (int i = 1; i <= 100; i++) {
			if (Prime(i) == true) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean Armstrong(int num) {
		int num1 = num;

		String str = Integer.toString(num);
		int rem;
		int result = 0;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			result = result + ((int) Math.pow(rem, str.length()));
		}
		if (result == num1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean Palindrome(int num) {
		int num1 = num;
		int rem;
		int result = 0;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			result = (result + rem) * 10;
		}
		result /= 10;
		if (result == num1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean Prime(int num) {
		if (num < 2) {
			return false;
		}
		int div = num / 2;
		for (int i = 2; i <= div; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
