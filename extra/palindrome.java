package extra;

public class palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(15));
	}

	public static boolean isPalindrome(int n) {

		return rev(n) == n ? true : false;
	}

	// 1100101

	public static int rev(int n) {
		int res = 0;
		while (n > 0) {
			int bit = (n & 1);
			res = res * 2 + bit;
			n = n / 2;
		}
		return res;

	}
}
