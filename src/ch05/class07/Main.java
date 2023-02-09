package ch05.class07;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public String solution(String str, String str2) {
        String answer = "YES";

        Queue<Character> q = new LinkedList();
        for(char c: str.toCharArray()){
            q.offer(c);
        }

        for(char c : str2.toCharArray()){
            if(q.contains(c)){
                if(c != q.poll()){
                    return "NO";
                }
            }
//            if(c == q.peek()){
//                q.poll();
//            }
//
//            if(q.size() == 0){
//                return answer;
//            }
        }

        if(q.isEmpty()){
            return answer;
        }

        return "NO";

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        String str = keyIn.next();
        String str2 = keyIn.next();

        System.out.println(T.solution(str, str2));
    }

}
