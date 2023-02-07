package ch03.class04;

import java.util.Scanner;

public class Main {

    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;

        int lt = 0, rt = 0;
        while(rt < n && lt < n){
            sum += arr[rt];
            rt++;
            if(sum == k){
                answer++;
            }else if(sum > k){
                sum -= arr[--rt];
                sum -= arr[lt++];
            }
        }

//        int f = 0;
//        for(int i=0; i<n; i++){
//
//            sum += arr[i];
//            while (sum > k){
//               sum -= arr[f++];
//            }
//
//            if(sum == k){
//                answer++;
//            }
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
