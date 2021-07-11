import java.util.Stack;

/**
 * RPNexpression
 */
public class RPNexpression {

    public static void main(String[] args) {
        System.out.println(getRPN("3,4,+,2,*,1,+"));
        System.out.println(prefixRPN("-,1,*,2,*,5,+,2,6,5,2"));
    }

        public static int getRPN(String s) {
            Stack<String> stack = new Stack<>();

            String[] data = s.split(",");
            for (int i = 0; i < data.length; i++) {
                String c = data[i];
                int x, y;

                if ("+-/*".contains(c)) {
                    switch (c) {
                        case "+":
                            x = Integer.parseInt(stack.pop());
                            y = Integer.parseInt(stack.pop());
                            stack.push(x + y + "");
                            break;
                        case "-":
                            x = Integer.parseInt(stack.pop());
                            y = Integer.parseInt(stack.pop());
                            stack.push(x - y + "");
                            break;

                        case "/":
                            x = Integer.parseInt(stack.pop());
                            y = Integer.parseInt(stack.pop());
                            stack.push(x / y + "");
                            break;
                        case "*":
                            x = Integer.parseInt(stack.pop());
                            y = Integer.parseInt(stack.pop());
                            stack.push(x * y + "");
                            break;
                        default:
                            System.out.println("This is never executed");
                    }
                } else {
                    stack.push(c);
                }

            }
            return Integer.parseInt(stack.peek());
        }

    public static int prefixRPN(String s) {
        
        String[] data = s.split(",");
        Stack<String> stack = new Stack<>();
int x,y;
        for(int i=data.length - 1; i>=0; i--) {
            String c = data[i];
            
            if("*/+-".contains(c)) {
                switch (c) {
                    case "+":
                        x = Integer.parseInt(stack.pop());
                        y = Integer.parseInt(stack.pop());
                        stack.push(x + y + "");
                        break;
                    case "-":
                        x = Integer.parseInt(stack.pop());
                        y = Integer.parseInt(stack.pop());
                        stack.push(x - y + "");
                        break;

                    case "/":
                        x = Integer.parseInt(stack.pop());
                        y = Integer.parseInt(stack.pop());
                        stack.push(x / y + "");
                        break;
                    case "*":
                        x = Integer.parseInt(stack.pop());
                        y = Integer.parseInt(stack.pop());
                        stack.push(x * y + "");
                        break;
                    default:
                        System.out.println("This is never executed");
                }
            } else {
                stack.push(c);
            }
            }
        }
    }
}