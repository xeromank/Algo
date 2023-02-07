package ch02.class06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public boolean isPrime(int num){

        if(num == 1){
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public List<Integer> solution(int l, int[] ss) {

        List<Integer> list = new ArrayList<>();

        Arrays.stream(ss).forEach(s -> {

            int tmp = s;
            int res = 0;
            while(tmp > 0){
                int t = tmp%10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if(isPrime(res)){
                list.add(res);
            }

//            int ns = Integer.parseInt(new StringBuffer(String.valueOf(s)).reverse().toString());
//            if(isPrime(ns)){
//                list.add(ns);
//            }

        });

        return list;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int l = keyIn.nextInt();
        int[] ss = new int[l];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = keyIn.nextInt();
        }
        for(int s : T.solution(l, ss)){
            System.out.print(s + " ");
        }
    }

}
