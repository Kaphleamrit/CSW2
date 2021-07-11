public class LookAndSay {
	public static void main(String[] args) {
		System.out.println(getNth(4));
	}

	static String getNth(int n) {
		String currString = "1";

		for (int i = 1; i < n; i++) {
			StringBuilder sb = new StringBuilder();

			for (int j = 0; j < currString.length(); j++) {
				int count = 1;
				while (j + 1 < currString.length()
						&& currString.charAt(j) == currString.charAt(j + 1)) {
					++count;
					++j;
				}
				sb.append(count);
				sb.append(currString.charAt(j));
			}
			currString = sb.toString();
		}
		return currString;
	}

}
