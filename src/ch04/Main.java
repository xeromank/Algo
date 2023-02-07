package ch04;

import java.util.Scanner;

public class Main {

    public String solution(int n, String str) {
        String answer = "";
        System.out.println(n);
        System.out.println(str);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        String str = keyIn.next();

        System.out.println(T.solution(n, str));
    }

}
