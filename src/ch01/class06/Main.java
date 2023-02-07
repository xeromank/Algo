package ch01.class06;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";

        char[] arr = str.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(str.indexOf(arr[i]) == i){
                answer += arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        String str = keyIn.next();
        System.out.println(T.solution(str));
    }

}
