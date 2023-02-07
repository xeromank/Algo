package ch01.class12;

import java.util.Scanner;

public class Main {

    public String solution(int len, String e) {
        String answer = "";

        for (int i = 0; i < len; i++) {
//            solution 1
//            String tmp = e.substring(i * 7, (i + 1) * 7).replace("#", "1").replace("*", "0");

//            solution 2
            String tmp = e.substring(0, 7).replace("#", "1").replace("*", "0");
            e = e.substring(7);

            answer += (char) Integer.parseInt(tmp, 2);

        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        String sLen = keyIn.nextLine();
        int len = Integer.parseInt(sLen);
        String e = keyIn.nextLine();
        System.out.println(T.solution(len, e));
    }

}
