import java.util.ArrayList;
import java.util.Arrays;

public class AdvancingGame {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 3, 1, 0, 2, 0, 1));
        int noOfJumps = 0;
        int prevPos = 0;
        boolean hasReached = false;
        for (int i = 0; i < list.size(); i++) {
            int curr = i + list.get(i);

            int pos = Math.max(curr, prevPos);

            if (pos > prevPos) {
                prevPos = pos;
                noOfJumps++;
            }

            if (pos == list.size() - 1) {
                hasReached = true;
                break;
            }
        }

        System.out.println(hasReached);
        System.out.println("No of jumps: " + noOfJumps);

    }

}
