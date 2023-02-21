package ch07.class09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {

    int v;
    Node lt;
    Node rt;

    public Node(int v){
        this.v = v;
    }
}

public class Main {


    // BFS
    public int solution(Node n) {

        Queue<Node> q = new LinkedList();
        q.offer(n);

        int cnt = 0;
        while(!q.isEmpty()){
            int len = q.size();

            for(int i=0; i<len; i++){

                Node t = q.poll();
                if(t.lt == null && t.rt == null) {
                    return cnt;
                }

                if(t.lt != null)q.offer(t.lt);
                if(t.rt != null)q.offer(t.rt);
            }
            cnt++;
        }

        return 0;
    }

    // DFS
    public int solution2(int L, Node n){
        if(n.lt == null && n.rt == null) {
            return L;
        }else{
            return Math.min(solution2(L+1, n.lt), solution2(L+1, n.rt));
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        System.out.println(T.solution(root));
        System.out.println(T.solution2(0, root));
    }

}
