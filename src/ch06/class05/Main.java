package ch06.class05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public String solution(int n, int[] arr) {

        Arrays.sort(arr);

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] == arr[i]) {
                return "D";
            }
        }

//        ArrayList<Integer> l = new ArrayList<>();
//        l.ensureCapacity(10000);
//        for (int i : arr) {
//            if (l.contains(i)) {
//                return "D";
//            }
//            l.add(i);
//        }

        return "U";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = keyIn.nextInt();
        }

        System.out.println(T.solution(n, arr));
    }

}
