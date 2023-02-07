package ch01.class09;

import java.util.Scanner;

public class Main {

    public int solution(String str) {
        int answer = 0;

        str = str.replaceAll("[^0-9]", "");
        answer = Integer.parseInt(str);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        String str = keyIn.nextLine();
        System.out.println(T.solution(str));
    }

}
