import java.util.ArrayList;
import java.util.List;

public class AllMnemonics {
	public static void main(String[] args) {
		String[] codes = { "0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
		String s = "2276696";
		char[] c = new char[s.length()];
		ArrayList<String> list = new ArrayList<String>();
		allMnemonics(codes, s, 0, list, c);
		System.out.println(list);

	}

	static void allMnemonics(String[] codes, String s, int flag, List<String> toReturnList, char[] temp) {
		if (flag == s.length())
			toReturnList.add(new String(temp));
		else {

			for (int i = 0; i < codes[flag].length(); i++) {
				char c = codes[s.charAt(flag) - '0'].charAt(i);
				temp[flag] = c;
				allMnemonics(codes, s, flag + 1, toReturnList, temp);
			}

		}

	}

}
