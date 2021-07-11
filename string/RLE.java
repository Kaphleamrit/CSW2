public class RLE {
	// 3e4f2e

	public static void main(String[] args) {
		String s = "3e4f2e";
		String s2 = "eeeffffee";
		System.out.println(decode(s));
		System.out.println(encode(s2));
	}

	static String decode(String s) {

		StringBuilder sb = new StringBuilder();

		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			if (Character.isDigit(c)) {
				int digit = c - '0';
				char nxtChar = s.charAt(j + 1);

				for (int i = 0; i < digit - 1; i++)
					sb.append(nxtChar);
			} else
				sb.append(c);
		}
		return sb.toString();
	}

	static String encode(String s) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length() - 1; i++) {
			int counter = 1;
			char currChar = s.charAt(i);

			while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
				counter++;
				i++;
			}
			if (counter > 1) {

				sb.append(counter);
				sb.append(currChar);

			} else
				sb.append(currChar);
		}

		return sb.toString();
	}
}
