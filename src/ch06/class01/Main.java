package ch06.class01;

import java.util.Scanner;

public class Main {

    public int[] solution(int n, int[] arr) {
        int[] answer = arr;

        for(int i=0; i<n-1; i++){
            int targetIdx = i;
            for(int j=i+1; j<n; j++){
                int tmp2 = arr[j];
                if(tmp2 < arr[targetIdx]){
                    targetIdx = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[targetIdx];
            arr[targetIdx] = tmp;
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
