package ch05.class03;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(int n, int[][] arr1, int m, int arr2[]) {
        int answer = 0;

        Stack<Integer> s = new Stack<>();

        for(int t : arr2){
            for(int i=0; i<n; i++){
                int j = t-1;
                int d = arr1[i][j];
                if(d != 0){
                    arr1[i][j] = 0;
                    if(s.isEmpty()){
                        s.push(d);
                    }else{
                        if(s.peek() == d){
                            s.pop();
                            answer+=2;
                        }else{
                            s.push(d);
                        }
                    }
                    break;
                }
            }
        }

        return answer;
    }
    // 4 2 0 4

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int arr1[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr1[i][j] = keyIn.nextInt();
            }
        }

        int m = keyIn.nextInt();
        int arr2[] = new int[m];
        for(int i=0; i<m; i++){
            arr2[i] = keyIn.nextInt();
        }

        System.out.println(T.solution(n, arr1, m, arr2));
    }

}
