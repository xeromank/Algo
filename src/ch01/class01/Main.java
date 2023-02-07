package ch01.class01;

import java.util.Scanner;

public class Main {

    public int solution(String str, char c) {
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for (char t : str.toCharArray()) {
            if (t == c) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        String str = keyIn.next();
        char c = keyIn.next().charAt(0);
        System.out.println(T.solution(str, c));
    }

}
