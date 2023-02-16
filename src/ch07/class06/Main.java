package ch07.class06;

import java.util.Scanner;

public class Main {

    public void solution(int n) {

        if(n == max+1){
            for(int i=1; i<=max; i++){
                if(ch[i] == 1){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }else{
            ch[n] = 1;
            solution(n+1);
            ch[n] = 0;
            solution(n+1);
        }
    }

    static int max = 0;
    static int[] ch;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        ch = new int[n+1];
        max = n;
        T.solution(1);
    }

}
