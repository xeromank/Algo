package ch01.class02;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";
        for (char t : str.toCharArray()) {
            if(t >= 97 && t <= 122) answer += (char)(t-32);
            else answer += (char)(t+32);
//            if(Character.isUpperCase(t)){
//                answer += Character.toLowerCase(t);
//            } else {
//                answer += Character.toUpperCase(t);
//            }
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
