package ch04.class02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public String solution(String s1, String s2) {
        String res = "YES";


        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            m1.put(arr1[i], m1.getOrDefault(arr1[i], 0) + 1);
            m2.put(arr2[i], m2.getOrDefault(arr2[i], 0) + 1);
        }

        for (char k : m1.keySet()) {

            if (m1.get(k) != m2.getOrDefault(k, 0)) {
                return "NO";
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Main T = new Main();

        Scanner ki = new Scanner(System.in);
        String s1 = ki.next();
        String s2 = ki.next();

        System.out.println(T.solution(s1, s2));
    }
}
