import java.util.ArrayList;

/**
 * Q7 Write a program that takes an integer argument and return all the primes
 * between 1 and the integer.
 */
public class Q7 {

	public static void main(String[] args) {
		ArrayList<Boolean> a = new ArrayList<Boolean>();
		ArrayList<Integer> b = new ArrayList<>();

		int n = 20;
		b.add(2);

		for (int i = 0; i < (int) Math.floor((0.5 * (n - 3) + 1)); i++) {
			a.add(true);
		}
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i)) {
				int p = 2 * i + 3;
				b.add(p);

				for (int j = (2 * (i * i) + 6 * i + 3); j < a.size(); j += p) {
					a.set(j, false);
				}
			}
		}

		System.out.println(b);

	}
}