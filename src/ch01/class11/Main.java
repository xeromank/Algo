package ch01.class11;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";

        str = str + " ";

        int i = 1;

        for(int x=0; x<str.length() - 1; x++){
            if(str.charAt(x) == str.charAt(x+1)){
                i++;
            }else{
                answer += str.charAt(x)  + (i > 1 ? String.valueOf(i) : "");
                i = 1;
            }
        }


//        char last = str.charAt(0);
//        for(char c : str.toCharArray()){
//            if(last == c){
//                i++;
//            }else{
//                answer += String.valueOf(last) + (i > 1 ? String.valueOf(i) : "");
//                last = c;
//                i = 1;
//            }
//        }
//        answer += String.valueOf(last) + (i > 1 ? String.valueOf(i) : "");

//        String tmp = "";
//        for(char c : str.toCharArray()){
//            if(tmp.length() == 0){
//                tmp = String.valueOf(c);
//            }else if(tmp.charAt(tmp.length() - 1) != c){
//                tmp += c;
//            }
//        }
//
//        int count = 0;
//        for(char c : tmp.toCharArray()){
//            str = str.substring(str.indexOf(c));
//            for(char t : str.toCharArray()){
//                if(c == t){
//                    count++;
//                }else{
//                    break;
//                }
//            }
//
//            if(count > 1){
//                answer += String.valueOf(c) + count;
//            }else{
//                answer += String.valueOf(c);
//            }
//            count = 0;
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
