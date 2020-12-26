package stack;

import java.util.ArrayList;
import java.util.List;

public class No_1441_BuildAnArrayWithStackOperations {
    public static void main(String[] args) {
        int[] target = {2,3,6};
        int n = 6;
        List<String> result = buildArray(target, n);
        System.out.println(result);
    }

    public static List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList();
        int num = target[target.length - 1] + 1;
        int index = 0;
        int i = 1;
        while(i != num){
            result.add("Push");
            if(target[index] == i)
                index++;
            else
                result.add("Pop");
            i++;
        }
        return result;
        /**
         * 执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗 :40.3 MB, 在所有 Java 提交中击败了100.00%的用户
         */
    }
}
