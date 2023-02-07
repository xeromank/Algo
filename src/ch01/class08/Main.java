package ch01.class08;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "NO";

        str = str.replaceAll("[^A-Za-z]", "");

        StringBuilder tmp = new StringBuilder(str);
//        StringBuilder tmp = new StringBuilder();
//        char[] c = str.toCharArray();
//        for (int i = 0; i < c.length; i++) {
//            if (Character.isAlphabetic(c[i])) {
//                tmp.append(c[i]);
//            }
//        }

        System.out.println(tmp);
        System.out.println(tmp.reverse());

        if (tmp.toString().equalsIgnoreCase(tmp.reverse().toString())) {
            return "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        String str = keyIn.nextLine();
        System.out.println(T.solution(str));
    }

}
