package ArrayList;

public class Q11 {
    	public static void main(String[] args) {
		System.out.println(work(11));
		
	}

	public static int work(int num) {

		while( ( (num >>> i) & 1) == ((num >>> i + 1) & 1 )) {
			i++;
		}
		return swap(num,i,i+1);
		
	}
	
	public static int swap(int num, int i, int j) {
		int intermediate = 0;
		if( ((num >>> i) & 1) != ((num >>> j) & 1) ) {
			intermediate =(1 << i) | (1 << j);
			return intermediate ^ num;
		}
		return num;
	}
}
