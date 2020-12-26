package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No_1237_FindPositiveIntegerSolutionForAGivenEquation {
    public static void main(String[] args) {
        int z = 5;
        List<List<Integer>> result = findSolution(new CustomFunction(), z);
        for (List<Integer> list : result) {
            for (Integer i : list)
                System.out.print(i + " -> ");
            System.out.println();
        }
    }

    public static List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
//        List<List<Integer>> result = new ArrayList<>();
//        for (int i = 1; i < 1000; i++) {
//            int val = customfunction.f(i, 1);
//            if(val == z)
//                result.add(new ArrayList<>(Arrays.asList(i, 1)));
//            else if(val > z)
//                break;
//            for (int j = 2; j < 1000; j++) {
//                val = customfunction.f(i, j);
//                if(val == z)
//                    result.add(new ArrayList<>(Arrays.asList(i, j)));
//                else if(val > z)
//                    break;
//            }
//        }
//        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.46%的用户
         * 内存消耗：36.3 MB, 在所有 Java 提交中击败了92.41%的用户
         */

        List<List<Integer>> result = new ArrayList<>();
        int left = 1, right = 1000;
        while(right > 0 && left < 1000){
            int val = customfunction.f(left, right);
            if(val == z){
                result.add(new ArrayList<>(Arrays.asList(left, right)));
                left++;
                right--;
            }else if(val > z){
                right--;
            }else{
                left++;
            }
        }
        return result;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了54.59%的用户
         * 内存消耗：36.8 MB, 在所有 Java 提交中击败了20.16%的用户
         */
    }
}

class CustomFunction{
    int f(int x, int y){
        return x * y;
    }
}
