package ch02.class01;

import java.util.Scanner;

public class Main {

    public String solution(int len, String n) {
        String answer = "";

        String[] tmp = n.split(" ");

        answer = tmp[0] + " ";
        for(int i=1; i<len; i++){
            if(Integer.parseInt(tmp[i-1]) < Integer.parseInt(tmp[i])){
                answer += tmp[i] + " ";
            }
        }

//        for(int i=0; i<len; i++){
//            if(i==0){
//                answer += tmp[i] + " ";
//            }else{
//                if(Integer.parseInt(tmp[i-1]) < Integer.parseInt(tmp[i])){
//                    answer += tmp[i] + " ";
//                }
//            }
//        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int len = Integer.parseInt(keyIn.nextLine());
        String n = keyIn.nextLine();
        System.out.println(T.solution(len, n));
    }

}
