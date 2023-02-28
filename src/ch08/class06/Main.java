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
        chkArr = new int[n];
        DFS1(arr, m, "", 0);
        long t2 = System.currentTimeMillis();
        DFS2(arr, m, new ArrayList<>());
        long t3 = System.currentTimeMillis();
        BFS(arr, m);
        long t4 = System.currentTimeMillis();

        System.out.println(t2 - t1);
        System.out.println(t3 - t2);
        System.out.println(t4 - t3);
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

    int[] chkArr;
    private void DFS1(int[] arr, int m, String r, int cnt) {
        if(m == cnt){
            System.out.println(r);
            return;
        }
        for (int i=0; i<arr.length; i++) {
                if(chkArr[i] == 0){
                    chkArr[i] = 1;
                    DFS1(arr, m, r + arr[i] + " ", cnt + 1);
                    chkArr[i] = 0;
                }
        }
    }

    private void DFS2(int[] arr, int m, List<Integer> chk) {

        if (chk.size() == m) {
            String r = String.join(" ",
                chk.stream().map(o -> String.valueOf(o)).toArray(String[]::new));
            System.out.println(r);
            return;
        }

        for (int i=0; i<arr.length; i++) {
            if (!chk.contains(arr[i])) {
                chk.add(arr[i]);
//                List<Integer> newChk = new ArrayList<>(chk);
//                newChk.add(arr[i]);
                DFS2(arr, m, chk);
                chk.remove(chk.indexOf(arr[i]));
            }
        }
    }

}
