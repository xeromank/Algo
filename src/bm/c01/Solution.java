package bm.c01;

public class Solution {

    public boolean check(String str){
        int len = str.length();
        if(len > 4 && len < 11){
            return true;
        }
        return false;
    }

    public String solution(String[] params) {
        String answer = "없음";

        for(String s: params){
            String temp = s.toUpperCase();
            if(check(temp)){
                return temp;
            }
        }

        return answer;
    }
}
