package ch07.class07;

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

    public void solution(Node n) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(n);
        int L = 0;
        while(!Q.isEmpty()){
//            System.out.print(L + " : ");
            int len = Q.size();
            for(int i=0; i<len; i++){
                Node cur = Q.poll();

                System.out.print(cur.v + " ");

                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            L++;
//            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        T.solution(root);
    }

}
