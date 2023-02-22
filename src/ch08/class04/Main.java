package ch08.class04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public void solution(int n, int m) {

        sol(n, m, "", 0);
    }

    public void sol(int n, int m, String s, int c){
        if(c == m){
            System.out.println(s);
            return;
        }
        for(int i=1; i<=n; i++){
            sol(n, m, s + " "+ i, c+1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int m = keyIn.nextInt();
        T.solution(n, m);
    }

}
