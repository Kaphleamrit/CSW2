// wap that does base conversion let the input String se, base b1, base b2. se represents integer form base b1  , the output should be the
// integer in base b2


public class BaseConversion {
    public static void main(String[] args) {
        System.out.println(convert("-A", 16, 10));
    }

    static String convert(String s, int b1, int b2) {

        StringBuilder sb = new StringBuilder();
        int start = s.charAt(0) == '-'? 1 : 0;
        int dec = 0;
        char c ;
        for(int i = start ; i<s.length() ; i++ ) {
            c = s.charAt(i) ;
            if (c>9) {  
                c = (char) (c - 'A' + 10);
            }
            else c = (char) (c - '0');
            dec = dec * b1 + c;
        }
        
        while(dec != 0) {
            int rem = dec % b2;
            if(rem >= 10) sb.append((char)(rem % 10 + 'A'  ));
           else sb.append(rem);
            dec /=b2;

        }
        if(start == 1) sb.append('-');
        
        return sb.reverse().toString();
    }
    
}
