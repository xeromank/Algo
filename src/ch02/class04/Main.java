package ch02.class04;

import java.util.Scanner;

public class Main {

    public int[] solution(int l) {

        int[] o = new int[l];

        int a = 1;
        int b = 1;

        System.out.print(a + " ");
        System.out.print(b + " ");

        for(int i=2; i<l; i++){
            System.out.print((a + b) + " ");
            b = a + b;
            a = b - a;
        }

//        o[0] = 1;
//        o[1] = 1;
//
//        for(int i=2; i<l; i++){
//            o[i] = o[i-2] + o[i-1];
//        }

        return o;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int l = keyIn.nextInt();
        for(int t : T.solution(l)){
//            System.out.print(t + " ");
        }
    }

}
