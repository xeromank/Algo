package ch06.class10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution(int n, int c, int[] arr) {
        int answer = 0;

        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[n - 1];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            int cnt = 1;
            int ep = arr[0];
            for(int i=0; i<n; i++){
                if(arr[i] - ep >= mid){
                    ep = arr[i];
                    cnt++;
                }
            }

            if(cnt >= c){
                answer = mid;
                lt = mid + 1;
            }else{
                rt = mid - 1;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int c = keyIn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = keyIn.nextInt();
        }

        System.out.print(T.solution(n, c, arr));
    }

}
