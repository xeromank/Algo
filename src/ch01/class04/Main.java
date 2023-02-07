package ch01.class04;

import java.util.Scanner;

public class Main {

    public String[] solution(int len, String[] str) {
        String[] answer = new String[len];

        for(int i=0; i<len; i++){
            answer[i] = "";
            char[] t = str[i].toCharArray();

            int f = 0;
            int b = t.length - 1;

            while(f < b){
                char tmp = t[f];
                t[f] = t[b];
                t[b] = tmp;

                f++;
                b--;
            }

            answer[i] = String.valueOf(t);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        String sLen = keyIn.next();
        int len = Integer.parseInt(sLen);
        String[] str = new String[len];
        for(int i=0; i<len; i++){
            str[i] = keyIn.next();
        }

        String[] results = T.solution(len, str);
        for(String r : results){
            System.out.println(r);
        }

    }

}
