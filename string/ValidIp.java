import java.util.ArrayList;
import java.util.List;

public class ValidIp {
	public static void main(String[] args) {
		System.out.println(validIps("19216811"));
	}

	static List<String> validIps(String s) {
		List<String> list = new ArrayList<>();
		for (int i = 1; i < 4; i++) {
			String firstSub = s.substring(0, i);

			if (isValid(firstSub)) {
				for (int j = 1; i + j < s.length() && j < 4; j++) {
					String secondSub = s.substring(i, i + j);
					if (isValid(secondSub)) {
						for (int k = 1; i + j + k < s.length() && k < 4; k++) {
							String thirdSub = s.substring(i + j, i + j + k);
							if (isValid(thirdSub)) {
								String fourthSub = s.substring(i + j + k, s.length());
								if (isValid(fourthSub))
									list.add(firstSub + "." + secondSub + "."
											+ thirdSub + "." + fourthSub);
							}
						}
					}
				}
			}
		}
		return list;
	}

	static boolean isValid(String s) {

		if (s.startsWith("0") && s.length() > 1)
			return false;

		int num = Integer.parseInt(s);
		if (num > 255 || num < 0)
			return false;
		return true;
	}

}
