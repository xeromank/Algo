package ch08.class06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int m = keyIn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = keyIn.nextInt();
        }

        T.solution(n, m, arr);
    }

    public void solution(int n, int m, int[] arr) {
        long t1 = System.currentTimeMillis();
        DFS(arr, m, new ArrayList<>());
        long t2 = System.currentTimeMillis();
        BFS(arr, m);
        long t3 = System.currentTimeMillis();

        System.out.println(t2 - t1);
        System.out.println(t3 - t2);
    }

    private void BFS(int[] arr, int m) {
        Queue<List<Integer>> q = new LinkedList<>();
        for (Integer i : arr) {
            List<Integer> temp = new ArrayList<>();
            temp.add(i);
            q.offer(temp);
        }

        int cnt = 1;
        while (!q.isEmpty()) {

            if (cnt < m) {
                int len = q.size();
                for (int j = 0; j < len; j++) {
                    List<Integer> t = q.poll();
                    for (Integer i : arr) {
                        if (!t.contains(i)) {
                            List<Integer> temp = new ArrayList<>(t);
                            temp.add(i);
                            q.offer(temp);
                        }
                    }
                }
                cnt++;
            } else {
                System.out.println(
                    String.join(" ",
                        q.poll().stream().map(o -> String.valueOf(o)).toArray(String[]::new)));
            }

        }

    }

    private void DFS(int[] arr, int m, List<Integer> chk) {

        if (chk.size() == m) {
            String r = String.join(" ",
                chk.stream().map(o -> String.valueOf(o)).toArray(String[]::new));
            System.out.println(r);
            return;
        }

        for (int i : arr) {
            if (!chk.contains(i)) {
                List<Integer> newChk = new ArrayList<>(chk);
                newChk.add(i);
                DFS(arr, m, newChk);
            }
        }
    }

}
