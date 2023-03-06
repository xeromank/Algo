package ch07.class06.review2;

import java.util.Scanner;

public class Main {

    boolean[] arr;

    public void solution(int n) {

        if(n == 0){
            String temp = "";
            for(int i=1; i< arr.length; i++){
                if(arr[i]){
                    temp += i + " ";
                }
            }
            System.out.println(temp);
        }else{
            arr[n] = true;
            solution(n-1);
            arr[n] = false;
            solution(n-1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        T.arr = new boolean[n+1];
        T.solution(n);
    }

}
