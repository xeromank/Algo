package ch06.class08;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution(int n, int m, int[] arr) {
        int answer = 0;

        Arrays.sort(arr);
        int min = 0, max = n - 1;

        while (min != max) {
            int div = (max + min) / 2;
            if (arr[div] > m) {
                max = div - 1;
            } else if (arr[div] < m) {
                min = div + 1;
            } else {
                return div + 1;
            }
        }

        answer = max + 1;

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
