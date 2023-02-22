package ch08.class11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {

    int x;
    int y;

    //    List<Node> nodes;
    public Node(int x, int y) {
        this.x = x;
        this.y = y;
//        this.nodes = new ArrayList<>();
//        this.nodes.add(this);
    }

//    public Node(int x, int y, List<Node> nodes){
//        this.x=x;
//        this.y=y;
//        this.nodes = new ArrayList<>();
//        this.nodes.addAll(nodes);
//        this.nodes.add(new Node(x, y));
//    }
//
//    public boolean exists(int x, int y){
//        return this.nodes.contains(new Node(x, y));
//    }

    public boolean gole() {
        return x == 7 && y == 7;
    }
}

public class Main {


    int ch[][] = new int[8][8];

    public int solution(int[][] arr) {

        Queue<Node> q = new LinkedList<>();

        ch[1][1] = 1;
        q.offer(new Node(1, 1));

        int cnt = 0;
        while (!q.isEmpty()) {

//            int len = q.size();

//            for(int i=0; i<len; i++){
            Node node = q.poll();

            if (node.gole()) {
//                    return node.nodes.size() - 1;
                return ch[node.x][node.y] - 1;
            }

            int[] x = {0, 0, -1, 1};
            int[] y = {-1, 1, 0, 0};

            for (int t = 0; t < 4; t++) {
                int tempX = node.x + x[t];
                int tempY = node.y + y[t];
                if (tempX > 7 || tempY > 7 || tempX < 1 || tempY < 1 || ch[tempX][tempY] > 0
                    || arr[tempX][tempY] == 1) {
                    continue;
                }

                ch[tempX][tempY] = ch[node.x][node.y] + 1;
                q.offer(new Node(tempX, tempY));
            }
//            }

//            cnt++;

        }

        return -1;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int[][] arr = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                arr[i][j] = keyIn.nextInt();
            }
        }

        System.out.println(T.solution(arr));
    }

}
