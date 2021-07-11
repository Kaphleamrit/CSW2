import java.io.BufferedReader;
import java.io.InputStreamReader;

public class codechef {
	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());

			for (int i = 1; i <= T; i++) {
				String[] inp = br.readLine().split(" ");
				int N = Integer.parseInt(inp[0]);
				int M = Integer.parseInt(inp[1]);

			}

		} catch (Exception e) {
			return;
		}
	}

}
