package ch02.class03;

import java.util.Scanner;

public class Main {

    public String[] solution(int len, int[][] d) {
        String[] answer = new String[len];

        for(int i=0; i<len; i++){
            int a = d[0][i];
            int b = d[1][i];

            if(a == b){
                answer[i] = "D";
            }else{
                if(a == 2 && b == 1) {
                    answer[i] = "A";
                }else if(a == 3 && b == 2){
                    answer[i] = "A";
                }else if(a == 1 && b == 3){
                    answer[i] = "A";
                }else{
                    answer[i] = "B";
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int len = keyIn.nextInt();

        int[][] d = new int[2][len];
        for(int i=0; i<2; i++){
            for(int j=0; j<len; j++){
                d[i][j] = keyIn.nextInt();
            }
        }

        for(String t : T.solution(len, d)){
            System.out.println(t);
        }
    }

}
