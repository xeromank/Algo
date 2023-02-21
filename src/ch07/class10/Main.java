package ch07.class10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Node{

    public Node (int v){
        this.v = v;
        this.pre = new ArrayList<>();
        this.pre.add(v);
    }

    public Node (int v, List<Integer> pre){
        this.v = v;
        this.pre = new ArrayList<>();
        this.pre.addAll(pre);
        this.pre.add(v);
    }

    public boolean check(int t){
        return this.pre.contains(t);
    }

    int v;
    List<Integer> pre;
}

public class Main {

    public int solution(int n, int[][] arr) {

        int cnt = 0;
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(1));

        while(!q.isEmpty()){
            int len = q.size();

            for(int i=0; i<len; i++){
                Node node = q.poll();
                if(node.v == n){
                    cnt++;
                }

                for (int j = 0; j < arr[node.v].length; j++) {
                    int temp = arr[node.v][j];
                    if(temp == 0 || node.check(j)) continue;

                    q.offer(new Node(j, node.pre));
                }
            }
        }

        return cnt;
    }
    static int ch[] = new int[6];
    static int answer = 0;
    public int solution(int n, int[][] arr, int curr) {
        if(curr == n) answer++;
        else{
            for(int i=1; i<=n; i++){
                if(arr[curr][i] == 1 && ch[i]==0) {
                    ch[i] = 1;
                    solution(n, arr, i);
                    ch[i] = 0;
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
        int[][] arr = new int[n+1][n+1];
        for (int i = 0; i < m; i++) {
            int t1 = keyIn.nextInt();
            int t2 = keyIn.nextInt();
            arr[t1][t2] = 1;
        }

        System.out.println(T.solution(n, arr));
        T.ch[1] = 1;
        System.out.println(T.solution(n, arr, 1));
    }

}

//5 9
//1 2
//1 3
//1 4
//2 1
//2 3
//2 5
//3 4
//4 2
//4 5
