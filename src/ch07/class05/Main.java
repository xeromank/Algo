package ch07.class05;

import java.util.Scanner;

class Node{
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt = rt = null;
    }
}

public class Main {

    Node root;
    // 전위순위
    public void solution1(Node root) {
        if(root == null) return;

        System.out.print(root.data + " ");
        solution1(root.lt);
        solution1(root.rt);
    }
    // 중위순위
    public void solution2(Node root) {
        if(root == null) return;

        solution2(root.lt);
        System.out.print(root.data + " ");
        solution2(root.rt);
    }
    // 후위순위
    public void solution3(Node root) {
        if(root == null) return;

        solution3(root.lt);
        solution3(root.rt);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Main T = new Main();

        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        T.root.rt.lt = new Node(6);
        T.root.rt.rt = new Node(7);
        T.solution1(T.root);
        System.out.println();
        T.solution2(T.root);
        System.out.println();
        T.solution3(T.root);
        System.out.println();

    }

}
