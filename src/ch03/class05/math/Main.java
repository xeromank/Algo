package ch03.class05.math;

import java.util.Scanner;

public class Main {

    public int solution(int len) {
        int answer = 0;
        int cnt = 1;
        len -= cnt;
        while(len > 0){
            cnt++;
            len -= cnt;
            if(len%cnt == 0) answer++;
        }

//        for(int i=2; i<len/2; i++){
//
//            int tmp = len;
//            for(int j=1; j<=i; j++){
//                tmp -= j;
//            }
//
//            if(tmp < 0){
//                break;
//            }
//
//            int t = tmp % i;
//            if(t == 0){
//                answer++;
//            }
//        }

//        int max = len/2 + 1;
//        int[] arr = new int[max];
//        for(int i=0; i<arr.length; i++){
//            arr[i] = i+1;
//        }
//        int i=max-2;
//        int j=max-1;
//        while(i >= 0 && i <= j){
//
//            int sum = 0;
//            for(int t=i; t<=j; t++){
//                sum += arr[t];
//            }
//
//            if(sum == len){
//                answer++;
//                i--;
//                j--;
//            }else if(sum > len){
//                j--;
//            }else{
//                i--;
//            }
//        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int len = keyIn.nextInt();

        System.out.println(T.solution(len));
    }

}
