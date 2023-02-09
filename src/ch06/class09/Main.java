package ch06.class09;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int count(int[] arr, int cap){
        int cnt=1, sum=0;
        for(int x: arr){
            if(sum + x > cap){
                cnt++;
                sum = x;
            }else{
                sum += x;
            }
        }
        return cnt;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();



        while (lt <= rt) {

            int mid = (lt + rt) / 2;
            if(count(arr, mid) <= m){
                answer=mid;
                rt = mid-1;
            }else lt = mid+1;

        }

//        int answer = 0;
//
//        int tmp = 0;
//        for (int i : arr) {
//            tmp += i;
//        }
//        tmp = tmp / m;
//
//        while (true) {
//            int tmp2 = tmp;
//            int cnt = 1;
//            for (int i = 0; i < n - 1; i++) {
//                tmp2 = tmp2 - arr[i];
//                if (0 > tmp2 - arr[i + 1]) {
//                    cnt++;
//                    tmp2 = tmp;
//                }
//            }
//
//            if (cnt > m) {
//                tmp++;
//            } else {
//                answer = tmp;
//                break;
//            }
//
//        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int m = keyIn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = keyIn.nextInt();
        }

        System.out.print(T.solution(n, m, arr));
    }

}
