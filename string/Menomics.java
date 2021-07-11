import java.util.Random;

public class Menomics {
	public static void main(String[] args) {
		String[] codes = { "®", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };

		String s = "2276696";
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - '0';
			Random r = new Random();
			int charIndex = r.nextInt(codes[index].length());
			sb.append(codes[index].charAt(charIndex));
		}
		System.out.println(sb);

	}

}
