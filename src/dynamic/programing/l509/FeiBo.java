package dynamic.programing.l509;

import java.util.Scanner;

public class FeiBo {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(solution.fib(scanner.nextInt()));
        }
    }
}
