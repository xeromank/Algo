package ch04.class05;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        TreeSet<Integer> set = new TreeSet<>();

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (x == y) {
                    continue;
                }
                for (int z = 0; z < n; z++) {
                    if (x == z || y == z) {
                        continue;
                    }

                    set.add(arr[x] + arr[y] + arr[z]);
                }
            }

        }

        if(set.size() < k) return -1;

        for (int i = 0; i < k; i++) {
            answer = set.pollLast();
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int k = keyIn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = keyIn.nextInt();
        }

        System.out.println(T.solution(n, k, arr));
    }

}
