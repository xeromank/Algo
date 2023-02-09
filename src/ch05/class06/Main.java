package ch05.class06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public int solution(int n, int k) {
        int answer = 0;

        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++){
            q.offer(i);
        }

        while (!q.isEmpty()){
            for(int i=1; i<k; i++) q.offer(q.poll());

            q.poll();

            answer = q.size() == 1 ? q.poll():0;
        }
//        int idx = 0;
//        while(q.size() > 1){
//            idx++;
//
//            if(idx == 3){
//                q.poll();
//                idx = 0;
//            }else{
//                q.offer(q.poll());
//            }
//
//        }
//
//        answer = q.poll();

//        List<Integer> l = new ArrayList<>();
//        for(int i=1; i<=n; i++){
//            l.add(i);
//        }
//
//        int idx = 0;
//        int cnt = 0;
//        while(l.size() > 1){
//            if(idx >= l.size()){
//                idx = 0;
//            }
//            cnt++;
//
//            if(k == cnt){
//                l.remove(idx);
//                idx--;
//                cnt = 0;
//            }
//            idx++;
//        }
//        answer = l.get(0);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int k = keyIn.nextInt();

        System.out.println(T.solution(n, k));
    }

}
