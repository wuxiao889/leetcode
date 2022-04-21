package dynamic.programing.l509;

import java.util.HashMap;

public class Solution1 {
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (hashMap.get(n) == null) {
            hashMap.put(n, fib(n - 1) + fib(n - 2));
        }
        return hashMap.get(n);
    }

}
