
package ch05.class01;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public String solution(String str) {
        String answer = "YES";

        Stack<Character> s = new Stack<>();
        char[] arr = str.toCharArray();

        for(char c: arr){
            if('(' == c){
                s.push(c);
            }else{
                if(s.isEmpty()){
                    return "NO";
                }else {
                    s.pop();
                }
            }
//            if(s.size() > 0){
//                if(s.peek() == c){
//                    s.push(c);
//                }else{
//                    s.pop();
//                }
//            }else{
//                if(c == ')') return "NO";
//
//                s.push(c);
//            }
        }

        if(!s.isEmpty()){
            return "NO";
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
