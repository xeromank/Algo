package ch08.class05.copy;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i] = keyIn.nextInt();
        }
        int m = keyIn.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());

        long t1 = System.currentTimeMillis();
        System.out.println(T.solutionDFS(n, arr, m));
        long t2 = System.currentTimeMillis();
        System.out.println(T.solutionBFS(n, arr, m));
        long t3 = System.currentTimeMillis();

        System.out.println(t2 - t1);
        System.out.println(t3 - t2);
    }

    int min = Integer.MAX_VALUE;
    public int solutionDFS(int n, Integer[] arr, int m){
        DFS(arr, 0, 0, m);

        return min;
    }

    private void DFS(Integer[] arr, int cnt, int sum, int limit){
        if(cnt >= min) return;
        if(limit < sum) return;
        if(limit == sum) {
            min = Math.min(cnt, min);
            return;
        }
        for(int i: arr){
            DFS(arr, cnt + 1, sum + i, limit);
        }
    }

    public int solutionBFS(int n, Integer[] arr, int m){

        Queue<Integer> q = new LinkedList<>();
        for(int i: arr){
            q.offer(i);
        }

        int cnt = 1;
        while(!q.isEmpty()){
            cnt++;

            int len = q.size();
            for(int j=0; j<len; j++){
                int p = q.poll();
                for(int i: arr){
                    int temp = p + i;

                    if(temp > m) continue;
                    if(temp == m) return cnt;

                    q.offer(temp);

                }
            }
        }

        return 0;

    }

}
