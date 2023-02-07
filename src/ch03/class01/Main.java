package ch03.class01;

import java.util.Scanner;

public class Main {

    public int[] solution(int len1, int[] arr1, int len2, int[] arr2) {
        int[] answer = new int[len1 + len2];

        int idx1 = 0;
        int idx2 = 0;

        int idx = 0;
        while(idx1 < len1 && idx2 < len2){
            if(arr1[idx1] < arr2[idx2]){
                answer[idx++] = arr1[idx1++];
            }else{
                answer[idx++] = arr2[idx2++];
            }
        }

        while(idx1 < len1){
            answer[idx++] = arr1[idx1++];
        }

        while(idx2 < len2){
            answer[idx++] = arr2[idx2++];
        }
//        for(int x=0; x<answer.length; x++){
//
//            if((idx1>=arr1.length?Integer.MAX_VALUE:arr1[idx1]) < (idx2>=arr2.length?Integer.MAX_VALUE:arr2[idx2])){
//                answer[x] = arr1[idx1++];
//            }else{
//                answer[x] = arr2[idx2++];
//            }
//        }

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
        for(int s : T.solution(len1, arr1, len2, arr2)){
            System.out.print(s + " ");
        }
    }

}
