package ch02.class07;

import java.util.Scanner;

public class Main {

    public int solution(int l, int[] ss) {
        int[] answer = new int[l];

        int sum = 0;
        int acc = 0;
        for (int i = 0; i < l; i++) {
            int s = ss[i];
            acc += s;
            if (s == 0) {
                acc = 0;
            }
            sum += acc;

            answer[i] = acc;
        }

        return sum;
//        return Arrays.stream(answer).sum();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int l = keyIn.nextInt();
        int[] ss = new int[l];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = keyIn.nextInt();
        }
        System.out.println(T.solution(l, ss));
    }

}
