package ch07.class02;

import java.util.Scanner;

public class Main {

    public void solution(String b, int n) {
        if(n > 0){
            solution(b,n-1);
            System.out.print(b.substring(n-1, n) + " ");
        }

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        String b = Integer.toBinaryString(n);
//        T.solution(b, b.length());

        T.solution2(n);
    }

    public void solution2(int n){
        if(n == 0) return;

        Double d = n / 2d;
        int p = n % 2;
        int m = d.intValue();

        solution2(m);
        System.out.print(p + " ");
    }


}
