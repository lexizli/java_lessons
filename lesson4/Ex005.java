package Lesson_04;

import java.util.Stack;

public class Ex005 {

    public static void main(String[] args) {
        // (1+2*3*4)*(10/5) - 20
        // 1 2 3 * 4 * + 10 5 / * 20 -
        
        //var exp = "20 30 - 10 *".split(" "); // (20-30)*10
        //var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3
        
        //var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        var exp = "100 7 / sin".split(" "); // 100 / (2 + 3)
        double res = 0;
        for (int i = 0; i < exp.length; i++) {
            System.out.println(exp[i]);
        }
       
        
        Stack<Double> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) {
                st.push(Double.parseDouble(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "sin":
                        res = Math.sin(st.pop());
                        st.push(res);
                        break;                        
                    case "/":
                        res = ((1 / st.pop()) * st.pop());

                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%f\n", st.pop());
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}