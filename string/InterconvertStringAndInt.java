

public class InterconvertStringAndInt {
    public static void main(String[] args) {
        
        System.out.println(stringToInt("-1234"));
        System.out.println(intToString(-1234));
        
    }

    static int stringToInt(String s) {
        int start = s.charAt(0)=='-'? 1 : 0;
        int toReturn = 0;
        for(int i = start; i<s.length(); i++) {
           toReturn = 10*toReturn + (s.charAt(i) - '0');
           
        }
        if(start == 1) toReturn *= -1;

        return toReturn;

    }

    static String intToString(int num) {
        StringBuilder sb = new StringBuilder();
        boolean isNeg = num<0? true : false;
        num = Math.abs(num);

        while(num > 0) {
           int rem = num % 10;
           char c = (char) (rem + '0');
           sb.append(c);
           num /= 10;
        }

        if(isNeg) sb.append('-');
        sb.reverse();
        return sb.toString();
    }
    
}
