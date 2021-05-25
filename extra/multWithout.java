package extra;

public class multWithout {

	public static void main(String[] args) {

		System.out.println(add(75, 6));
		System.out.println(multiply(5, 4));

	}

	public static int add(int a, int b) {
		int c = 0;
		int res = 0;
		int sum;
		int lastA = 0;
		int lastB = 0;
		int flag = (a | b) << 1;
		int x = 0;
		while (flag > 0) {
			lastA = a & 1;
			lastB = b & 1;
			sum = lastA ^ lastB ^ c;

			c = lastA & lastB | c & (lastA ^ lastB);

			System.out.println(sum);
			res = (int) (sum * Math.pow(2, x)) + res;

			a = a >>> 1;
			b = b >>> 1;
			flag >>>= 1;
			x++;
		}

		return res;
	}

	public static int multiply(int a, int b) {

		int c = a > b ? a : b;
		int d = a > b ? b : a;
		int product = 0;
		for (int i = 0; i < d; i++) {
			product += add(product, c);
		}
		return product;
	}

	public static int divide(int a, int b) {
		return -1;
	}
}
