package ch01.class07;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "YES";

        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)){
            return "NO";
        }

//        str = str.toLowerCase();
//        int f=0, b=str.length() - 1;
//        while(f < b){
//
//            if(str.charAt(f) != str.charAt(b)) return "NO";
//
//            f++;
//            b--;
//        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        String str = keyIn.next();
        System.out.println(T.solution(str));
    }

}
