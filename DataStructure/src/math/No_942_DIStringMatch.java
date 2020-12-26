package math;

import java.util.Arrays;

public class No_942_DIStringMatch {
    public static void main(String[] args) {
        String s = "DDI";
        int[] result = diStringMatch(s);
        System.out.println(Arrays.toString(result));
    }

    public static int[] diStringMatch(String S) {
        char[] chars = S.toCharArray();
        int[] result = new int[chars.length + 1];
        int left = 0, right = chars.length;
        int index = 0;
        while(index <= chars.length){
            if(index == chars.length || chars[index] == 'I'){
                result[index] = left++;
            }else{
                result[index] = right--;
            }
            index++;
        }
        return result;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了63.19%的用户
         */
    }
}
