package ch08.class01.copy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public String DFS(int[] arr, int idx, int sum) {
        if(idx >= arr.length) return answer;
        if(sum * 2 == tot) {
            answer = "YES";
            return answer;
        }
        if("YES".equalsIgnoreCase(answer)) return answer;

        DFS(arr, idx+1, sum + arr[idx]);
        DFS(arr, idx+1, sum);

        return answer;
    }

    public String BFS(int[] arr){
        String ans = "NO";

        int tot = Arrays.stream(arr).sum();

        Queue<Integer> q = new LinkedList<>();
        q.offer(arr[0]);
        q.offer(0);

        int i = 1;
        while(!q.isEmpty()){

            int len = q.size();
            for(int l=0; l<len; l++){
                int t = q.poll();
                if(t*2 == tot) return "YES";

                if(i >= arr.length) continue;

                q.offer(t);
                q.offer(t + arr[i]);
            }

            i++;
        }


        return ans;

    }


    static int tot;
    static String answer = "NO";
    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = keyIn.nextInt();
        }
        tot = Arrays.stream(arr).sum();

        long s1 = System.currentTimeMillis();
        System.out.println(T.DFS(arr, 0, 0));
        long s2 = System.currentTimeMillis();
        System.out.println(T.BFS(arr));
        long s3 = System.currentTimeMillis();

        System.out.println(s2 - s1);
        System.out.println(s3 - s2);
    }

}
