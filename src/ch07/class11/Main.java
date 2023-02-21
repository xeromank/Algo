package ch07.class11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static boolean[] ch;
    static int cnt = 0;
    public int solution(int n, List<Integer>[] arr, int curr) {
        if(curr == n) cnt++;
        else{
            for(int t: arr[curr]){
                if(ch[t]) continue;

                ch[t] = true;
                solution(n, arr, t);
                ch[t] = false;

            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        ch = new boolean[n+1];
        int m = keyIn.nextInt();
        List<Integer>[] arr = new ArrayList[n+1];
        for(int i=0; i<arr.length; i++){
            arr[i] = new ArrayList();
        }
        for (int i = 0; i < m; i++) {
            int t1 = keyIn.nextInt();
            int t2 = keyIn.nextInt();
            arr[t1].add(t2);
        }

        ch[1] = true;
        System.out.println(T.solution(n, arr, 1));
    }

}

//5 9
//1 2
//1 3
//1 4
//2 1
//2 3
//2 5
//3 4
//4 2
//4 5
