
package ch05.class02;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public String solution(String str) {
        String answer = "";

        Stack<Character> s = new Stack<>();
        char[] arr = str.toCharArray();

        for(char c: arr){
            if('(' == c){
                s.push(c);
            }else if(')' == c){
                s.pop();
            }else{
                if(s.isEmpty()) {
                    answer += c;
                }
            }
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
