package ch08.class04.copy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class ForBFS{

    String r = "";
    int lv = 0;
    int cnt = 0;
    int[][] chk;
    public ForBFS(int v, int n, int m){
        r = v + " ";
        lv = 1;
        chk = new int[m][n];
    }

}
public class Main {

    public void solution(int n, int m) {

//        solDFS(n, m, "", 0);

        solBFS(n, m);
    }

    public void solBFS(int n, int m){

        for(Integer i=1; i<=n; i++){
            Queue<ForBFS> q = new LinkedList<>();
            q.offer(new ForBFS(i));
            while (!q.isEmpty()){
                int len = q.size();
                for(int j=0; j<len; j++){
                    ForBFS f = q.poll();
                }
            }

        }
    }

    public void solDFS(int n, int m, String r, int idx){

        if(idx == m){
            System.out.println(r);
            return;
        }

        for(int i=0; i<n; i++){
            solDFS(n, m, r + (i+1) + " ",idx+1);
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
