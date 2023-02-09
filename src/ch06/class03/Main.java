package ch06.class03;

import java.util.Scanner;

public class Main {

    public int[] solution(int n, int[] arr) {
        int[] answer = arr;

        for(int i=1; i<n; i++){
            int tmp = arr[i];
            int j;
            for(j=i-1; j>=0; j--){
                if(arr[j] > tmp){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = tmp;
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
