package ch04.class03;

import java.util.*;

public class Main {

    public List<Integer> solution(int m, int k, int[] arr) {

        List<Integer> l = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        while (j < m && i <= j) {

            if(j - i == k){
                int t = map.get(arr[i]);
                t = t - 1;
                if(t == 0){
                    map.remove(arr[i]);
                }else{
                    map.put(arr[i], t);
                }
                i++;
            }
            map.put(arr[j], map.getOrDefault(arr[j], 0)+1);

            if(j - i == k-1){
                l.add(map.size());
            }

            j++;

//            Set<Integer> set = new HashSet();
//            for(int x=i; x<i+k; x++){
//                set.add(arr[x]);
//            }
//
//            l.add(set.size());
//            i++;
        }

        return l;
    }

    public static void main(String[] args) {

        Main T = new Main();

        Scanner ki = new Scanner(System.in);
        int m = ki.nextInt();
        int k = ki.nextInt();

        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = ki.nextInt();
        }

        for (int r : T.solution(m, k, arr)) {
            System.out.print(r + " ");
        }

    }
}
