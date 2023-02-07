package ch03.class02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<Integer> solution(int len1, int[] arr1, int len2, int[] arr2) {
        List<Integer> answer = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int p1 = 0, p2 = 0;
        while (p1 < len1 && p2 < len2) {

            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1]);
                p1++;
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
//        for(int i=0; i<len1; i++){
//            for(int j=0; j<len2; j++){
//                if(arr1[i] == arr2[j]){
//                    answer.add(arr1[i]);
//                    break;
//                }
//            }
//        }
//
//        answer.sort(((o1, o2) ->
//            o1 > o2 ? 1 : -1
//        ));

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int len1 = keyIn.nextInt();
        int[] arr1 = new int[len1];
        for (int i = 0; i < len1; i++) {
            arr1[i] = keyIn.nextInt();
        }
        int len2 = keyIn.nextInt();
        int[] arr2 = new int[len2];
        for (int i = 0; i < len2; i++) {
            arr2[i] = keyIn.nextInt();
        }

        for(int a : T.solution(len1, arr1, len2, arr2)){
            System.out.print(a + " ");
        }
    }

}
