import java.util.ArrayList;

public class EffPrimeLister {
    public static void main(String[] args) {
        ArrayList<Boolean> list = new ArrayList<Boolean>();
        ArrayList<Integer> primes= new ArrayList<>();
        for(int i=0; i<=10; i++) {
            list.add(true);
        }
        list.set(0,false);
        list.set(1,false);

        for(int i = 2 ; i<=10; i++) {
            if(list.get(i)) {
            primes.add(i);

            for (int j = i*2; j<=10; j+=i) {
                list.set(j, false);
            }
        }
        }
        System.out.println(primes);
        
    }
    
}
