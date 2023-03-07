package bm.c02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

    public String solution(String[] leftArray, String[] rightArray) {

        Set<String> fst = new HashSet<>();
        Set<String> dup = new TreeSet<>();
        for(String s: leftArray){
            fst.add(s);
        }

        for(String s: rightArray){
            if(fst.contains(s)){
                dup.add(s);
                fst.remove(s);
            }
        }

        if(dup.size() == 0){
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for(String s : dup){
            sb.append(s).append(",");
        }

        return sb.substring(0, sb.length()-1);

//        String[] arr = dup.toArray(new String[dup.size()]);
//        Arrays.sort(arr);
//
//        for(int i=0; i<arr.length; i++){
//            sb.append(arr[i]);
//            if(i < arr.length - 1){
//                sb.append(",");
//            }
//        }
//        return sb.toString();
    }
}
