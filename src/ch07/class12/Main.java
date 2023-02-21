package ch07.class12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public void solution(List<Integer>[] arr) {

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);

        int lv = 0;
        while(!q.isEmpty()){

            int len = q.size();
            for(int i=0; i<len; i++){
                int t = q.poll();
                for(int temp : arr[t]){
                    if(map.containsKey(temp)) continue;

                    map.put(temp, lv+1);
                    q.offer(temp);
                }
            }
            lv++;
        }

        map.entrySet().stream().filter(k -> !k.getKey().equals(1)).forEach(k -> System.out.println(k.getKey() + " : " + k.getValue()));
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int m = keyIn.nextInt();

        List<Integer>[] arr = new ArrayList[n+1];
        for(int i=0; i<arr.length; i++){
            arr[i] = new ArrayList();
        }
        for (int i = 0; i < m; i++) {
            int t1 = keyIn.nextInt();
            int t2 = keyIn.nextInt();
            arr[t1].add(t2);
        }

        T.solution(arr);
    }

}
