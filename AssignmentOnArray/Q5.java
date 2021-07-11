import java.util.ArrayList;
import java.util.Arrays;

/**
 * Q5 Write a program that takes an array denoting the daily stock price, and
 * return the maximum pro t that could be made by buying and then selling one
 * share of that stock.
 */
public class Q5 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 5, 7, 4, 2, 5, 7));
		int minSoFar = list.get(0);
		int maxProfit = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			minSoFar = Math.min(minSoFar, list.get(i));
			maxProfit = Math.max(maxProfit, list.get(i) - minSoFar);
		}

		System.out.println(maxProfit);
	}
}