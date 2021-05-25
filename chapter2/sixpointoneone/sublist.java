import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;



public class sublist {
    static List<Integer> randomSub(ArrayList<Integer> a, int k) {
		
		Random r = new Random();
		int size = a.size();
		for(int i=0; i<k; i++) {
			int rnd = r.nextInt(size);
			Collections.swap(a, i, rnd);
		}
		
		List<Integer> ret = a.subList(0, k);
		return ret; 	 	
	}


    
}
