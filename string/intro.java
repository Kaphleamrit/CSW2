// 3. wap to input a string as "123:foo:144:xyz" and separate each word/token and display and convert into an array of tokens
// 2. wap to take an input string as "this is an example " and find the output string as . "this was an example"
// wap to take the string s = "hello world" and your output will bw coming as he llo wor ld

public class intro {
   public static void main(String[] args) {
       String s = "123:foo:144:xyz";
       String[] arr = s.split(":");

       for(String a : arr) {
           System.out.println(a);
       }

       String t = "hello world";

       int counter = 0;

       for(int i = 0; i<s.length(); i++) {
           if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') counter++;
       }
       System.out.println(counter);

       String p= "this is an example";
       p = p.replace(" is", " was"); 
       System.out.println(p);

       System.out.println(t.substring(0,2));
       System.out.println(t.substring(2,5));
       System.out.println(t.substring(6,8));
       System.out.println(t.substring(8,10));
       System.out.println(t.startsWith("he"));
       System.out.println(t.startsWith("wo",6));
       
   } 
    
} 
// wap to enter a string "hello to all" and check whether the string is starting with he and also check within the string after space starts with wo