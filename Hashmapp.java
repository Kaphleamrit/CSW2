import java.util.HashMap;
import java.util.Map;

public class Hashmapp {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(194202,"Ram");
        map.put(43345,"Shyam");
        map.put(43554,"Sita");

        for(Map.Entry<Integer,String> e: map.entrySet()) {
            System.out.println(e.getKey() + " --> " + e.getValue());
        }
    }
    
}
