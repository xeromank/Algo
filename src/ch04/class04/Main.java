package ch04.class04;

import java.util.*;

public class Main {

    public boolean check(String s2, Map<Character, Integer> set){
        boolean b = true;
        for(char c : s2.toCharArray()) {
            if(!set.containsKey(c)){
                b = false;
            }
        }
        return b;
    }
    public int solution(String s1, String s2){
        int res = 0;

        Map<Character, Integer> tm = new HashMap<>();
        for(char c : s2.toCharArray()){
            tm.put(c, tm.getOrDefault(c, 0)+1);
        }

        int i=0, j=s2.length() - 1;
        char[] arr = s1.toCharArray();
        Map<Character, Integer> set = new HashMap<>();
        for(int ci = 0; ci < j; ci++){
            char c = arr[ci];
            set.put(c, set.getOrDefault(c, 0)+1);
        }

        while(j<s1.length()){

            set.put(arr[j], set.getOrDefault(arr[j], 0)+1);
            if(set.equals(tm)){
                res++;
            }

            int t = set.get(arr[i]) - 1;
            if(t == 0){
                set.remove(arr[i]);
            }else{
                set.put(arr[i], t);
            }

            i++;
            j++;



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
