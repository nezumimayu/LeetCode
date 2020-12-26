package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No_1200_Fastest {
    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
//        int[] arr = {4,2,1,3};
        List<List<Integer>> result = minimumAbsDifference(arr);
        for (List<Integer> list : result) {
            for (Integer num : list) {
                System.out.print(num);
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        return new java.util.AbstractList<List<Integer>>() {
            int[] buffer;
            int size;
            int min;
            boolean init;

            private void init() {
                Arrays.sort(arr);
                buffer = new int[arr.length];
                min = Integer.MAX_VALUE;

                for (int i = 1; i < arr.length; i++) {
                    int dif = arr[i] - arr[i - 1];
                    if (dif > min) {
                        continue;
                    }
                    if (dif < min) {
                        size = 0;
                        min = dif;
                    }
                    buffer[size++] = arr[i];
                }

                init = true;
            }

            // 缺少范围检查
            @Override
            public List<Integer> get(int index) {
                if (!init) {
                    init();
                }
                return Arrays.asList(buffer[index] - min, buffer[index]);
            }

            @Override
            public int size() {
                if (!init) {
                    init();
                }
                return size;
            }
        };
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：51 MB, 在所有 Java 提交中击败了100.00%的用户
         */
    }
}
