package ch07.class01;

import java.util.Scanner;

public class Main {

    public void print(int n, int i){
        System.out.print(i + " ");

        if(i < n){
            i++;
            print(n, i);
        }
    }

    public void solution(int n) {
//        print(n, 1);
        if(n > 0){
            solution(n-1);
            System.out.println(n);
        }

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        T.solution(n);
    }

}
