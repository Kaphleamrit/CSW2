import java.util.Arrays;
import java.util.Scanner;

class TestClass {
	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();

		for (int i = 0; i < T; i++) {

			int N = s.nextInt();
			long X = s.nextInt();

			long[] arr = new long[N];

			for (int j = 0; j < N; j++)
				arr[j] = s.nextInt();

			Arrays.sort(arr);

			int flag = 0;
			int counter = -1;
			long accum = 0;

			while (accum <= X) {
				counter++;
				accum += arr[flag++];
			}

			System.out.println(counter);
		}

	}
}