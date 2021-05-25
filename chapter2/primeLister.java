import java.util.ArrayList;

public class primeLister {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            if (isPrime(i))
                list.add(i);
        }
        System.out.println(list);
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
