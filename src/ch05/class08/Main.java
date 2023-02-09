package ch05.class08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public class P {

        public P(int idx, int wp) {
            this.idx = idx;
            this.wp = wp;
        }

        final public int idx;
        final public int wp;

    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;

        Queue<P> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(new P(i, arr[i]));
        }

        while (!q.isEmpty()) {
            P p = q.poll();
            for (P tmp : q) {
                if (p.wp < tmp.wp) {
                    q.offer(p);
                    p = null;
                    break;
                }
            }

            if (p != null) {
                answer++;

                if (p.idx == m) {
                    return answer;
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int m = keyIn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = keyIn.nextInt();
        }

        System.out.println(T.solution(n, m, arr));
    }

}
