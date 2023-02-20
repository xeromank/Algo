package ch07.class08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import org.w3c.dom.Node;

public class Main {

    public int solution(int s, int e) {

        int[] ch = new int[10001];
        int c = 0;
        Queue<Integer> q = new LinkedList<>();
        ch[s] = 1;
        q.offer(s);

        while(!q.isEmpty()){
            int len = q.size();

            for(int i=0; i<len; i++){
                int v = q.poll();
                ch[v] = 1;
                if(v == e){
                    return c;
                }

                q.offer(v + 1);
                q.offer(v - 1);
                q.offer(v + 5);
            }
            c++;
        }

        return 0;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int s = keyIn.nextInt();
        int e = keyIn.nextInt();
        System.out.println(T.solution(s, e));
    }

}
