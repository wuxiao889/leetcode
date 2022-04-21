package evaluate.reverse.polish.notation;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class Solution {
    @Test
    public void test(){
        Solution1 solution1 = new Solution1();
        System.out.println(evalRPN(new String[]{"2","1","+","3","*"}));
//        System.out.println(evalRPN(solution1.tohouzhui("2*(9+6/3-5)+4")));
        for (String s :solution1.tohouzhui("2*(9+6/3-5)+4")) {
            System.out.print(s);
        }

    }

    public int evalRPN(String[] tokens) {
        LinkedList<Integer> list = new LinkedList<>();
        int left;
        int right;
        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                right = list.pop();
                left = list.pop();
                switch (s) {
                    case "+": {
                        list.push(left + right);
                        break;
                    }
                    case "-": {
                        list.push(left - right);
                        break;
                    }
                    case "*": {
                        list.push(left * right);
                        break;
                    }
                    case "/": {
                        list.push(left / right);
                        break;
                    }
                }
                continue;
            }
            list.push(Integer.parseInt(s));
        }
        return list.pop();
    }
}
