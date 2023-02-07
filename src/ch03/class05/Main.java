package ch03.class05;

import java.util.Scanner;

public class Main {

    public int solution(int len) {
        int answer = 0;

        int max = len/2 + 1;
        int[] arr = new int[max];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        int i=max-2;
        int j=max-1;
        while(i >= 0 && i <= j){

            int sum = 0;
            for(int t=i; t<=j; t++){
                sum += arr[t];
            }

            if(sum == len){
                answer++;
                i--;
                j--;
            }else if(sum > len){
                j--;
            }else{
                i--;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int len = keyIn.nextInt();

        System.out.println(T.solution(len));
    }

}
