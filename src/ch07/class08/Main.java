package ch07.class08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import org.w3c.dom.Node;

public class Main {

    public int solution(int s, int e) {

        boolean[] ch = new boolean[10001];
        int c = 0;
        Queue<Integer> q = new LinkedList<>();
//        ch[s] = true;
        q.offer(s);

        while(!q.isEmpty()){
            int len = q.size();

            for(int i=0; i<len; i++){
                int v = q.poll();

                if(ch[v] || v < 1 || v > 10000) continue;
//                ch[v] = true;
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
        long a = System.currentTimeMillis();
        System.out.println(T.solution(s, e));
        long b = System.currentTimeMillis();

        System.out.println((b-a));
    }

}
