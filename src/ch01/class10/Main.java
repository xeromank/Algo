package ch01.class10;

import java.util.Scanner;

public class Main {

    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];

        int l = 1000;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == c){
                l = 0;
            }else{
                l++;
            }

            answer[i] = l;
        }

        int r = 1000;
        for(int i=str.length() - 1; i>-1; i--){
            if(str.charAt(i) == c){
                r = 0;
            }else{
                r++;
            }

            answer[i] = Math.min(answer[i], r);
        }

        return answer;
    }

//    public String solution(String str, char c) {
//        String answer = "";
//
//        int[] left = new int[str.length()];
//        int l = 1000;
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i) == c){
//                l = 0;
//            }else{
//                l++;
//            }
//
//            left[i] = l;
//        }
//
//        int[] right = new int[str.length()];
//        int r = 1000;
//        for(int i=str.length() - 1; i>-1; i--){
//            if(str.charAt(i) == c){
//                r = 0;
//            }else{
//                r++;
//            }
//
//            right[i] = r;
//        }
//
//        for(int i=0; i<left.length; i++){
//            if(left[i] < right[i]){
//                answer += left[i] + " ";
//            }else{
//                answer += right[i] + " ";
//            }
//        }
//
//        return answer;
//    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        String str = keyIn.next();
        char c = keyIn.next().charAt(0);
//        System.out.println(T.solution(str, c));

        for(int i : T.solution(str, c)){
            System.out.print(i + " ");
        }
    }

}
