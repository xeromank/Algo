package ch08;

import java.util.Scanner;

public class Main {

    public void solution(int n) {
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
