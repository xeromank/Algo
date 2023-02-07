package ch02.class02;

import java.util.Scanner;

public class Main {

    public int solution(int len, int[] heights) {
        int answer = 1;
        int max = heights[0];
        for(int i=1; i<len; i++){
            if(heights[i] > max){
                answer++;
                max = heights[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int len = keyIn.nextInt();
        int[] heights = new int[len];

        for(int i=0; i < len; i++){
            heights[i] = keyIn.nextInt();
        }
        System.out.println(T.solution(len, heights));
    }

}
