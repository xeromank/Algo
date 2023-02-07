package ch03;

import java.util.Scanner;

public class Main {

    public int solution(int len1, int[] arr1, int len2, int[] arr2) {
        int answer = 0;
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

        System.out.println(T.solution(len1, arr1, len2, arr2));
    }

}
