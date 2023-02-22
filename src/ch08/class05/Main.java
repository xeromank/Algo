package ch08.class05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    int min = Integer.MAX_VALUE;
    public int solution(int n, Integer[] arr, int m) {

        sol(arr, m, 0, 0);
        return min;
    }

    public void sol(Integer[] arr, int m, int sum, int cnt){
        if(m < sum) return;
        if(cnt >= min) return;
        if(m == sum) {
            min = Math.min(min, cnt);
            return;
        }else{
            for(int i=0; i<arr.length; i++){
                sol(arr, m, sum + arr[i], cnt+1);
            }
        }

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i] = keyIn.nextInt();
        }
        int m = keyIn.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(T.solution(n, arr, m));
    }

}
