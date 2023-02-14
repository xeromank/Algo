package ch07.class03;

import java.util.Scanner;

public class Main {

    public int solution(int n) {
//        if(n == 0) return 1;
        if(n == 1) return 1;

        return n*solution(n-1);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        System.out.println(T.solution(n));
    }

}
