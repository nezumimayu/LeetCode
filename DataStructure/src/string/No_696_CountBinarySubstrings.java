package string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class No_696_CountBinarySubstrings {
    public static void main(String[] args) {
//        String str = "00110011";
        String str = "10101";
        int result = countBinarySubstrings(str);
        System.out.println("result = " + result);
    }

    public static int countBinarySubstrings(String s) {
//        LinkedList<Integer> list = new LinkedList<>();
//        char[] temp = s.toCharArray();
//        int val = 1;
//        for (int i = 1; i < temp.length; i++) {
//            if(temp[i] == temp[i - 1]){
//                val++;
//            }else{
//                list.add(val);
//                val = 1;
//            }
//        }
//        list.add(val);
//        int prv = list.removeFirst(), last = 0;
//        int result = 0;
//        while(!list.isEmpty()){
//            last = list.removeFirst();
//            result += Math.min(prv, last);
//            prv = last;
//        }
//        return result;
        /**
         * 执行用时：14 ms, 在所有 Java 提交中击败了47.74%的用户
         * 内存消耗：40.5 MB, 在所有 Java 提交中击败了19.62%的用户
         */

        char[] temp = s.toCharArray();
        int prv = 0, val = 1;
        int result = 0;
        for (int i = 1; i < temp.length; i++) {
            if(temp[i] == temp[i - 1]){
                val++;
            }else{
                result += Math.min(prv, val);
                prv = val;
                val = 1;
            }
        }
        result += Math.min(prv, val);
        return result;
        /**
         * 执行用时：8 ms, 在所有 Java 提交中击败了97.03%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了79.73%的用户
         */

//        int last = 0, res = 0;
//        int cur = 1;
//        char[] temp = s.toCharArray();
//        for(int i=1; i<temp.length; i++){
//            if(temp[i] == temp[i-1])
//                cur ++;
//            else{
//                last = cur;
//                cur = 1;
//            }
//            if(last >= cur)
//                res++;
//        }
//        return res;
        /**
         * 执行用时：8 ms, 在所有 Java 提交中击败了97.03%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了80.75%的用户
         */

    }
}
