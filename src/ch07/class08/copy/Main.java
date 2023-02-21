package ch07.class08.copy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public int solution(int s, int e) {

        boolean[] ch = new boolean[10001];
        int[] range = {-1, 1, 5};
        Queue<Integer> q = new LinkedList<>();
        ch[s] = true;
        q.offer(s);

        int cnt = 0;
        while (!q.isEmpty()) {

            int len = q.size();
            for (int i = 0; i < len; i++) {
                int t = q.poll();
                if (t == e) {
                    return cnt;
                }

                for (int r : range) {
                    int temp = t + r;
                    if (temp < 1 || temp > 10000 || ch[temp]) {
                        continue;
                    }

                    ch[temp] = true;
                    q.offer(temp);
                }
            }
            cnt++;
        }

        return 0;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int s = keyIn.nextInt();
        int e = keyIn.nextInt();
        System.out.println(T.solution(s, e));
    }

}
