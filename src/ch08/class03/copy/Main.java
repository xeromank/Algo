package ch08.class03.copy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int m = keyIn.nextInt(); // 총 시간
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = keyIn.nextInt(); // 점수
            arr[i][1] = keyIn.nextInt(); // 시간
        }
        T.solution(n, m, arr);
        System.out.println(T.maxDFS);
        System.out.println(T.maxBFS);
    }

    int maxDFS = Integer.MIN_VALUE;
    int maxBFS = Integer.MIN_VALUE;
    private void solution(int n, int m, int[][] arr) {
        long t1 = System.currentTimeMillis();
        DFS(n, m, 0, 0, 0, arr);
        long t2 = System.currentTimeMillis();
        // BFS
        Queue<Integer[]> q = new LinkedList<>();
        q.offer(new Integer[]{0, 0});

        int i=0;
        while(!q.isEmpty()){
            int len = q.size();
            for(int j=0; j<len; j++){

                Integer[] t = q.poll();

                if(i >= n) continue;

                int tempPoint = arr[i][0] + t[0];
                int tempTime = arr[i][1] + t[1];

                if(tempTime > m){
                    q.offer(t);
                }else{
                    maxBFS = Math.max(maxBFS, tempPoint);
                    q.offer(new Integer[]{tempPoint, tempTime});
                    q.offer(t);
                }
            }
            i++;
        }
        long t3 = System.currentTimeMillis();

        System.out.println(t2 - t1);
        System.out.println(t3 - t2);
    }



    private void DFS(int n, int m, int idx, int totPoint, int totTime, int[][] arr){
        if(idx >= n) return;
        if(totTime > m) return;

        maxDFS = Math.max(totPoint, maxDFS);

        DFS(n, m, idx+1, totPoint + arr[idx][0], totTime + arr[idx][1], arr);
        DFS(n, m, idx+1, totPoint, totTime, arr);
    }

}
