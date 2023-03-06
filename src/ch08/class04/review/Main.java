package ch08.class04.review;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class ForBFS{

    String r;
    int cnt;
    int v;
    public ForBFS(int cnt, int v, String r){
        this.r = r;
        this.cnt = cnt;
        this.v = v;
    }

}
public class Main {

    public void solution(int n, int m) {

        long t1 = System.currentTimeMillis();

        solDFS(n, m, "", 0);
        long t2 = System.currentTimeMillis();

        solBFS(n, m);
        long t3 = System.currentTimeMillis();

        solExSearch(n, m) ;
        long t4 = System.currentTimeMillis();

        System.out.println(t2 - t1);
        System.out.println(t3 - t2);
        System.out.println(t4 - t3);
    }
    public void solExSearch(int n, int m){
        Integer[] arr = new Integer[m];
        for(int i=0; i<m; i++){
            arr[i] = n;
        }

        Stack<String> s = new Stack<>();

        int currPoint = m - 1;
        while(arr[currPoint] > -1){
            if(arr[currPoint] == 0){
                arr[currPoint] = n;
                currPoint--;
                if(currPoint < 0) break;
                arr[currPoint]--;

                continue;
            }

            currPoint = m - 1;
            s.push(String.join(" ", Arrays.stream(arr).map(o -> o.toString()).toArray(String[]::new)));
            arr[currPoint]--;
        }

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }


    public void solBFS(int n, int m){

        for(Integer i=1; i<=n; i++){
            Queue<ForBFS> q = new LinkedList<>();
            q.offer(new ForBFS(1, i, i + " "));

            while (!q.isEmpty()){
                int len = q.size();
                for(int j=0; j<len; j++){
                    ForBFS f = q.poll();

                    if(f.cnt >= m){
                        System.out.println(f.r);
                        continue;
                    }

                    for(Integer t=1; t<=n; t++){
                        String temp = f.r + t + " ";
                        int tempCnt = f.cnt + 1;
                        q.offer(new ForBFS(tempCnt, i, temp));
                    }

                }
            }

        }
    }

    public void solDFS(int n, int m, String r, int cnt){

        if(cnt == m){
            System.out.println(r);
            return;
        }

        for(int i=0; i<n; i++){
            solDFS(n, m, r + (i+1) + " ",cnt+1);
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
