public class Help {
    public static void main(String[] args) {
        String s = "sf129fg";
        System.out.println(findCharsOrDigitSum(s, 1));
    }
    
    static String findCharsOrDigitSum(String a,int b) {

        if (b == 0) {
            int sum =0;

            for(int i =0; i<a.length(); i++) {
                try {
                    int no = Integer.parseInt(a.charAt(i) + "");
                    sum+=no;
                }
                catch(Exception e) {
                }
                
            }
            return sum + "";
        }
       
        else {
            StringBuilder sb = new StringBuilder();

            for(char c : a.toCharArray()) {
                if(c >=97 && c<=122 || c>=65 && c<=90) sb.append(c);
            }
            return sb.toString();
        }
    }
}
