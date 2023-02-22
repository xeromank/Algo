package ch08.class01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public String solution(int[] arr, int idx, int sum) {
        if(idx == arr.length || "YES".equalsIgnoreCase(answer)) return "";

        if(Arrays.stream(arr).sum() == sum * 2){
            answer = "YES";
        }

        solution(arr, idx+1, sum);
        solution(arr, idx+1, sum + arr[idx]);

        return answer;
    }

    static String answer = "NO";
    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = keyIn.nextInt();
        }
        System.out.println(T.solution(arr, 0, 0));
    }

}
