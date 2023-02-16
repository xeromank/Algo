package ch07.class05.copy;

import java.util.Scanner;

class Node {

    public Node(int v){
        this.v = v;
    }
    int v;
    Node lt;
    Node rt;
}
public class Main {


    public void solution(Node n) {

        if(n == null)return;

        // 전위탐색
//        System.out.print(n.v + " ");
        solution(n.lt);
        // 중위탐색
//        System.out.print(n.v + " ");
        solution(n.rt);
        // 후위탐색
//        System.out.print(n.v + " ");
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);

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
