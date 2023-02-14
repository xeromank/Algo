package ch07.class04;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    static int[] fibo;
    static Map<Integer, Integer> map = new HashMap();

    public int solution(int n) {
        if(n==1) {
            if(fibo[n] == 0){
                fibo[n] = 1;
            }
        }
        else if(n==2) {
            if(fibo[n] == 0){
                fibo[n] = 1;
            }
        }
        else {
            if(fibo[n] == 0){
                fibo[n] = solution(n-2) + solution(n-1);
            }
        }

        return fibo[n];
    }

//    public int solution(int n) {
//        if(n==1) {
//            if(!map.containsKey(n)){
//                map.put(n, 1);
//            }
//        }
//        else if(n==2) {
//            if(!map.containsKey(n)){
//                map.put(n, 1);
//            }
//        }
//        else {
//            if(!map.containsKey(n)){
//                map.put(n, solution(n-2) + solution(n-1));
//            }
//        }
//
//        return map.get(n);
//    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        fibo = new int[n+1];
        T.solution(n);
        for(Entry e : map.entrySet()){
            System.out.print(e.getValue() + " ");
        }
//        System.out.print(T.solution(n) + " ");
//        for(int i=1; i<=n; i++) System.out.print(T.solution(i) + " ");
        for(int i=1; i<=n; i++) System.out.print(fibo[i] + " ");
    }

}
