import java.util.ArrayList;
import java.util.Arrays;

/**
 * Q6 Write a program that computes the maximum pro t that can be made by buying
 * and selling a share at mot twice. The second by must be made on another date
 * after the rst sale
 */
public class Q6 {

	public static void main(String[] args) {
		ArrayList<Integer> price = new ArrayList<>(Arrays.asList(10, 22, 5, 75, 65, 80));
		int n = price.size();

		// forward phase

		ArrayList<Integer> firstBuySellProfit = new ArrayList<>();
		int minPriceSoFar = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int i = 0; i < n; i++) {
			minPriceSoFar = Math.min(minPriceSoFar, price.get(i));
			maxProfit = Math.max(maxProfit, price.get(i) - minPriceSoFar);
			firstBuySellProfit.add(maxProfit);
		}

		// backward phase

		int maxPriceSoFar = 0;
		int maxTotalProfit = 0;

		for (int i = n - 1; i > 0; i--) {
			maxPriceSoFar = Math.max(maxPriceSoFar, price.get(i));
			maxTotalProfit = Math.max(maxTotalProfit,
					maxPriceSoFar - price.get(i) + firstBuySellProfit.get(i - 1));
		}
		System.out.println(maxTotalProfit);
	}
}
