package graph;

import java.util.*;

public class No_1042_FlowerPlantingWithNoAdjacent {
    public static void main(String[] args) {
        int[][] paths = {{4,1},{4,2},{4,3},{2,5},{1,2},{1,5}};
//        int[][] paths = {{1,2},{3,4}};
//        int[][] paths = {{1,2},{2,3},{3,4},{4,1},{1,3},{2,4}};
        int N = 5;
        int[] result = gardenNoAdj(N, paths);
        System.out.println(Arrays.toString(result));
    }

    public static int[] gardenNoAdj(int N, int[][] paths) {
        if(paths.length == 0){
            int[] result = new int[N];
            Arrays.fill(result, 1);
            return result;
        }
        HashMap<Integer, ArrayList<Integer>> link = new HashMap<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] path : paths) {
            ArrayList<Integer> list = link.getOrDefault(path[0], new ArrayList<>());
            list.add(path[1]);
            link.put(path[0], list);
        }
        int last = 1;
        for (int i = 1; i <= N; i++) {
            if(!map.containsKey(i)){
                int index = 1;
                map.put(i, index++);
                List<Integer> list = link.getOrDefault(i, new ArrayList<>());
                for (Integer l : list) {
                    map.put(l, index++);
                }
                last = Math.max(last, index);
            }else{
                int temp = map.get(i);
                int index = 1;
                List<Integer> list = link.getOrDefault(i, new ArrayList<>());
                for (Integer l : list) {
                    if(!map.containsKey(l)){
                        map.put(l, index++);
                    }else{
                        if(map.get(l) == temp){
                            map.put(l, last++);
                        }
                    }
                }
            }
        }
        int[] result = new int[N];
        for (int i = 1; i <= N; i++) {
            result[i - 1] = map.get(i);
        }
        return result;
    }
}
