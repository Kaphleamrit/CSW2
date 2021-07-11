public class FirstOccurance {
	public static void main(String[] args) {
		System.out.println(getIndex("aaaabcdabc", "abc"));
	}

	static int getIndex(String s, String key) {

		int keyHash = 0;
		int sHash = 0;

		for (int i = 0; i < key.length(); i++) {
			// keyHash = res * 26 + key.charAt(i) - 'a' + 1;
			// res *= 26;
			keyHash += (key.charAt(i) - 'a' + 1) * Math.pow(3, i);
			sHash += (s.charAt(i) - 'a' + 1) * Math.pow(3, i);
		}

		for (int i = key.length(); i < s.length(); i++) {
			if (keyHash == sHash && s.substring(i - key.length(), i).equals(key)) {
				return i - key.length();
			}

			int firstDigit = (s.charAt(i - key.length()) - 'a' + 1);
			int lastDigit = s.charAt(i) - 'a' + 1;

			sHash = (sHash - firstDigit) / 3 + lastDigit * (int) Math.pow(3, 2);
		}
		if (keyHash == sHash && s.substring(s.length() - key.length()).equals(key)) {
			return s.length() - key.length();
		}
		return -1;

	}

}
