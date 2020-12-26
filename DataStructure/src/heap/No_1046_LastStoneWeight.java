package heap;

import java.util.Arrays;

public class No_1046_LastStoneWeight {
    public static void main(String[] args) {
        int[] stones = {1,3};
        System.out.println(lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones) {
//        int len = stones.length - 1;
//        Arrays.sort(stones);
//        for(int i = len; i > 0; i--){
//            stones[len] = Math.abs(stones[len] - stones[len - 1]);
//            stones[len - 1] = 0;
//            System.out.println("stones = " + Arrays.toString(stones));
//            Arrays.sort(stones);
//        }
//        return stones[len];

        if (stones.length == 2) {
            return Math.abs(stones[0] - stones[1]);
        }
        if (stones.length == 1) {
            return stones[0];
        }
        Arrays.sort(stones);
        if (stones[stones.length - 3] == 0) {
            return stones[stones.length - 1] - stones[stones.length - 2];
        }
        stones[stones.length - 1] = stones[stones.length - 1] - stones[stones.length - 2];
        stones[stones.length - 2] = 0;
        return lastStoneWeight(stones);
    }
}
