package ch02;

import java.util.Scanner;

public class Main {

    public int[] solution(int l, int[] ss) {
        int[] answer = new int[l];

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int l = keyIn.nextInt();
        int[] ss = new int[l];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = keyIn.nextInt();
        }
        for(int s : T.solution(l, ss)){
            System.out.print(s + " ");
        }
    }

}
