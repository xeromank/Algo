package ch05.class05;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(String str) {
        int answer = 0;
        Stack<Character> s = new Stack<>();
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            char c = arr[i];
            if (c == '(') {
                s.push(c);
            } else {
                s.pop();
                if (arr[i - 1] == '(') { // 레이저
                    answer += s.size();
                } else { //파이프 닫기
                    answer++;
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
