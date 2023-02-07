package ch01.class03;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";

//        for(String word : str.split(" ")){
//            if(answer.length() < word.length()){
//                answer = word;
//            }
//        }

        int pos;
        while((pos = str.indexOf(" ")) != -1){
            String tmp = str.substring(0, pos);
            if(tmp.length() > answer.length()){
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }

        if(str.length() > answer.length()){
            answer = str;
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
