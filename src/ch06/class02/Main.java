package ch06.class02;

import java.util.Scanner;

public class Main {

    public int[] solution(int n, int[] arr) {
        int[] answer = arr;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                int tmp1 = arr[j];
                int tmp2 = arr[j+1];
                if(tmp2 < tmp1){
                    arr[j+1] = tmp1;
                    arr[j] = tmp2;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = keyIn.nextInt();
        }

        for(int i: T.solution(n, arr)){
            System.out.print(i + " ");
        }
    }

}
