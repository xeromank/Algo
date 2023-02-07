package ch04.class01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public String solution(int n, String str) {
        String answer = "";

        Map<Character, Integer> m = new HashMap<>();
        for (Character c : str.toCharArray()) {
            if (m.containsKey(c)) {
                m.put(c, m.get(c) + 1);
            } else {
                m.put(c, 1);
            }
        }

        int max = 0;
        for (Entry<Character, Integer> e : m.entrySet()) {
            if (e.getValue() > max) {
                answer = String.valueOf(e.getKey());
                max = e.getValue();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        String str = keyIn.next();

        System.out.println(T.solution(n, str));
    }

}
