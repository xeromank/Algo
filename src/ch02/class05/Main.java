package ch02.class05;

import java.util.Scanner;

public class Main {

    public int solution(int val) {
        int answer = 0;

        int[] s = new int[val + 1];

//        =========================
        for (int i = 2; i < s.length; i++) {
            if(s[i] == 0){
                answer++;
                for(int j=i; j<s.length; j=j+i){
                    s[j] = 1;
                }
            }
        }
//        =========================

//        =========================
//        s[0] = 0;
//        s[1] = 0;
//        for (int i = 2; i < s.length; i++) {
//            s[i] = 1;
//        }
//
//        for (int i = 2; i < s.length; i++) {
//
//            if (0 == s[i]) {
//                continue;
//            }
//
//            for (int j=i+i; j<s.length; j=j+i) {
//                if (0 == j % i) {
//                    s[j] = 0;
//                }
//            }
//        }
//
//        for (int i = 2; i < s.length; i++) {
//
//            if (1 == s[i]) {
//                answer++;
//            }
//        }
//        =========================


//        answer = (int) Arrays.stream(s).filter(i -> i == 1).count();


//        =========================
//        for(int i=2; i<=val; i++){
//            if(s[i] == 1){
//                continue;
//            }
//            s[i] = 0;
//            for(int j=i+1; j<=val; j++){
//                if(j%i == 0){
//                    s[j] = 1;
//                }
//            }
//        }
//
//        for(int i=0; i<s.length; i++){
//            if(s[i] == 0){
//                answer++;
//            }
//        }

//        for(int i=2; i<=val; i++){
//            answer++;
//            for(int j=2; j<i; j++){
//                int mod = i%j;
//
//                if(mod == 0){
//                    answer--;
//                    break;
//                }
//            }
//        }
//        =========================

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int val = keyIn.nextInt();
        System.out.println(T.solution(val));
    }

}
