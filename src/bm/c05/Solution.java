package bm.c05;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        TreeMap<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        Solution sol = new Solution();
        System.out.println(sol.solution(k, map));
    }

    public String solution(int k, TreeMap<Integer, Integer> map) {
        String answer = "IMPOSSIBLE";


        Set<Entry<Integer, Integer>> entrySet = map.entrySet();
        if (entrySet.size() >= k) {
            int i = 0;
            for (Entry<Integer, Integer> entry : entrySet) {
                i++;

                if (i == k) {
                    answer = entry.getKey() + " " + entry.getValue();
                    break;
                }

            }
        }

//        Set<Integer> keys = map.keySet();
//        Integer[] arr = new Integer[keys.size()];
//        int i = 0;
//        for (Integer key : keys) {
//            arr[i] = key;
//            i++;
//        }
//
//        if (arr.length >= k) {
//            Arrays.sort(arr, Collections.reverseOrder());
//            int t = arr[k-1];
//            answer = t + " "+  map.get(t);
//        }

        return answer;
    }


}
