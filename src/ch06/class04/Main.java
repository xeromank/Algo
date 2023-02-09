package ch06.class04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public int[] solution(int s, int n, int[] arr) {

        Queue<Integer> q = new LinkedList<>();

        for(int i : arr){

            if(q.contains(i)){
                q.remove(i);
                q.offer(i);
            }else{
                q.offer(i);
                if(q.size() > s){
                    q.poll();
                }
            }
        }

        int[] answer = new int[q.size()];
        for(int i=answer.length-1; i>=0; i--){
            answer[i] = q.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int s = keyIn.nextInt();
        int n = keyIn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = keyIn.nextInt();
        }

        for(int i: T.solution(s, n, arr)){
            System.out.print(i + " ");
        }
    }

}
