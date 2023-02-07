package ch01.class05;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";

        char[] t = str.toCharArray();

        int f = 0;
        int b = t.length - 1;

        while(f < b){
            char fw = t[f];
            char bw = t[b];

            if(!Character.isAlphabetic(fw)){
                f++;
            }else if(!Character.isAlphabetic(bw)){
                b--;
            }else{

                t[f] = bw;
                t[b] = fw;

                f++;
                b--;
            }
        }

        answer = String.valueOf(t);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        String str = keyIn.next();

        System.out.println(T.solution(str));

    }

}
