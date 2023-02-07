package ch03.class06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public int checkArr(int[] arr){

        int max = 0;
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                cnt++;
                max = Math.max(max, cnt);
            }else{
                cnt = 0;
            }
        }

        return max;
    }

    public int solution(int n, int k, int[] arr1) {
        int max = 0;

        int cnt = 0;
        int f = 0;
//        int l = 0;

        for(int i=0; i<n; i++){
            if(arr1[i] == 0){
                cnt++;
            }

            while(cnt > k){
                if(arr1[f] == 0){
                    cnt--;
                }
                f++;
            }

            max = Math.max(max, i - f + 1);
        }


//        Queue<Integer> queue = new LinkedList<>();
//
//        int i = 0;
//        while (i < n) {
//            if (arr1[i] == 0) {
//                arr1[i] = 1;
//
//                if (queue.size() < k) {
//                    queue.add(i);
//                } else {
//                    int s = queue.poll();
//                    arr1[s] = 0;
//                    queue.add(i);
//                }
//            }
//
//            max = Math.max(max, checkArr(arr1));
//
//            i++;
//        }

        return max;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int len1 = keyIn.nextInt();
        int len2 = keyIn.nextInt();
        int[] arr1 = new int[len1];
        for (int i = 0; i < len1; i++) {
            arr1[i] = keyIn.nextInt();
        }

        System.out.println(T.solution(len1, len2, arr1));
    }

}
