package ch08.class02.review;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public int solutionDFS(int c, int n, int[] arr) {
        return sol(c, 0, 0, arr);
    }

    public int sol(int c, int idx, int sum, int[] arr){
        if(sum > c) return 0;
        if(idx >= arr.length) return sum;

        return Math.max(sol(c, idx+1, sum + arr[idx], arr), sol(c, idx+1, sum, arr));
    }

    public int solutionBFS(int c, int n, int[] arr) {
        int max = Integer.MIN_VALUE;

        Queue<Integer> q = new LinkedList<>();
        int j = 0;
        q.offer(arr[j]);
        q.offer(0);
        while(!q.isEmpty()){
            j++;
            int len = q.size();
            for(int i=0; i<len; i++){
                int t = q.poll();

                if(t > c) continue;

                max = Math.max(max, t);

                if(j >= n) continue;

                q.offer(t);
                q.offer(t + arr[j]);

            }
        }

        return max;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int c = keyIn.nextInt();
        int n = keyIn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = keyIn.nextInt();
        }
        long s1 = System.currentTimeMillis();
        System.out.println(T.solutionDFS(c, n, arr));
        long s2 = System.currentTimeMillis();
        System.out.println(T.solutionBFS(c, n, arr));
        long s3 = System.currentTimeMillis();

        System.out.println(s2 - s1);
        System.out.println(s3 - s2);
    }

}
