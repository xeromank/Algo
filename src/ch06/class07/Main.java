package ch06.class07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public class Location implements Comparable<Location> {

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int x;
        int y;

        @Override
        public int compareTo(Location o) {
            if (this.x > o.x) {
                return 1;
            } else if (this.x < o.x) {
                return -1;
            } else {
                return this.y - o.y;
            }
        }
    }

    public Integer[][] solution(int n, int[][] arr) {

        Integer[][] answer;

        List<Location> list = new ArrayList<>();

        for (int[] i : arr) {
            list.add(new Location(i[0], i[1]));
        }
        Collections.sort(list);

        answer = list.stream().map(o -> {
            Integer[] tmp = new Integer[2];
            tmp[0] = o.x;
            tmp[1] = o.y;

            return tmp;
        }).toArray(Integer[][]::new);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = keyIn.nextInt();
            arr[i][1] = keyIn.nextInt();
        }

        for (Integer[] i : T.solution(n, arr)) {
            System.out.println(i[0] + " " + i[1]);
        }
    }

}
