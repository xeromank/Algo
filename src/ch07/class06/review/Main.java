package ch07.class06.review;

import java.util.Scanner;

public class Main {

    public void solution(int n) {

        if(n < 0) return;

        if(n == 0){
            String s = "";
            int length = arr.length;
            for(int i =1; i<length; i++){
                if(arr[i] == 1){
                    s += i + " ";
                }
            }

            System.out.println(s);
        }else{
            arr[n] = 1;
            solution(n -1);
            arr[n] = 0;
            solution(n -1);
        }




    }

    static int[] arr;
    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        arr = new int[n+1];
        T.solution(n);
    }

}
