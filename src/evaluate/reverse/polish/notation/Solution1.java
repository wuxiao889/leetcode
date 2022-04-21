package evaluate.reverse.polish.notation;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Solution1 {

    public String[] tohouzhui(String tokens) {
        Vector<String> vector = new Vector<>();
        HashMap<String, Integer> map = new HashMap<>();
        LinkedList<String> list = new LinkedList<>();
        map.put("+", 1);
        map.put("-", 1);
        map.put("*", 2);
        map.put("/", 2);
        map.put("(", 3);
        map.put(")", 3);
        int left = 0;
        int right = 0;
        for (char c : tokens.toCharArray()) {
            String s = Character.toString(c);
            left++;
            if (notNumber(s)) {
                if (left - 1 >= right) {
                    vector.add(tokens.substring(right, left - 1));
                }
                if (s.equals("(")) {
                    list.push(s);
                } else if (s.equals(")")) {
                    while (!list.peek().equals("(")) {
                        vector.add(list.pop());
                    }
                    list.pop();
                } else if (!list.isEmpty() && map.get(s) > map.get(list.peek())) {
                    list.push(s);
                } else {
                    while (!list.isEmpty() && !list.peek().equals("(") && map.get(s) <= map.get(list.peek())) {
                        vector.add(list.pop());
                    }
                    list.push(s);
                }
            }

        }
        while (!list.isEmpty()) {
            vector.add(list.pop());
        }

        return vector.toArray(new String[]{});
    }

    public boolean notNumber(String s) {
        return (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("(") || s.equals(")"));
    }
}
