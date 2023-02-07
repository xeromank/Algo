package ch03.class03;

import java.util.Scanner;

public class Main {

    public int solution(int n, int k, int[] arr) {
        int answer = 0;

        int sum = 0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        answer = Math.max(answer, sum);

        for(int i=k; i<n; i++){
            sum += arr[i];
            sum -= arr[i-k];
            answer = Math.max(answer, sum);
        }
//        int ei = k;
//        while(ei <= n){
//            int sum = 0;
//            for(int i=ei-k; i<ei; i++){
//                sum += arr[i];
//            }
//            answer = Math.max(answer, sum);
//            ei++;
//        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int k = keyIn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = keyIn.nextInt();
        }

        System.out.println(T.solution(n, k, arr));
    }

}
