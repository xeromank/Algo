package ch08.class07;

import java.util.Scanner;
import java.util.Stack;

class Node {

    int n;
    int r;

    public Node(int n, int r) {
        this.n = n;
        this.r = r;
    }
}

public class Main {

    public int solution(int n, int r) {

        int answer = DFS(n, r);
        return answer;
    }

    public int DFS(int n, int r) {

        if (n == r) {
            return 1;
        }
        if (r == 0) {
            return 1;
        }

        if (this.arr[n - 1][r - 1] == 0) {
            return this.arr[n - 1][r - 1] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }

        return this.arr[n - 1][r - 1];
    }

    public int BFS(int n, int r) {

        Stack<Node> s = new Stack<>();

        s.push(new Node(n, r));

        while (!s.isEmpty()) {

            Node node = s.pop();

            if(node.n == node.r || node.r == 0){
                this.arrBFS[node.n ][node.r] = 1;
                continue;
            }

            if (this.arrBFS[node.n - 1][node.r - 1] == 0) {
                s.push(node);
                s.push(new Node(node.n - 1, node.r - 1));
            } else if (this.arrBFS[node.n - 1][node.r] == 0) {
                s.push(node);
                s.push(new Node(node.n - 1, node.r));
            } else {
                this.arrBFS[node.n ][node.r] =
                    this.arrBFS[node.n - 1][node.r - 1] + this.arrBFS[node.n - 1][node.r];
            }
        }

        return this.arrBFS[n][r];
    }

    int[][] arr;
    int[][] arrBFS;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int r = keyIn.nextInt();

        T.arr = new int[n][r];
        T.arrBFS = new int[n+1][r+1];

        System.out.println(T.solution(n, r));
        System.out.println(T.BFS(n, r));
    }

}
