package ch05.class04;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(String str) {
//        352+*9-

        char[] arr = str.toCharArray();
        Stack<Integer> s2 = new Stack<>();
        for (char c : arr) {
            if (Character.isDigit(c)) {
                s2.push(Integer.parseInt(String.valueOf(c)));
            } else {
                int r = s2.pop();
                int l = s2.pop();
                int tmp = 0;
                switch (c) {
                    case '+':
                        tmp = l + r;
                        break;
                    case '-':
                        tmp = l - r;
                        break;
                    case '*':
                        tmp = l * r;
                        break;
                    case '/':
                        tmp = l / r;
                        break;
                }
                s2.push(tmp);
            }
        }

        return s2.pop();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        String str = keyIn.next();

        System.out.println(T.solution(str));
    }

}
