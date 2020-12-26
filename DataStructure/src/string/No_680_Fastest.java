package string;

public class No_680_Fastest {
    public static void main(String[] args) {
//        String str = "lcupuuuupucul";
//        String str = "abca";
        String str = "edaeadeasbccbaedaeadep";
        boolean result = validPalindrome(str);
        System.out.println("result = " + result);
    }

    public static boolean validPalindrome(String s) {
        int low = 0, high = s.length() - 1;
        while (low < high) {
            char c1 = s.charAt(low), c2 = s.charAt(high);
            if (c1 == c2) {
                low++;
                high--;
            } else {
                boolean flag1 = true, flag2 = true;
                for (int i = low, j = high - 1; i < j; i++, j--) {
                    char c3 = s.charAt(i), c4 = s.charAt(j);
                    if (c3 != c4) {
                        flag1 = false;
                        break;
                    }
                }
                for (int i = low + 1, j = high; i < j; i++, j--) {
                    char c3 = s.charAt(i), c4 = s.charAt(j);
                    if (c3 != c4) {
                        flag2 = false;
                        break;
                    }
                }
                return flag1 || flag2;
            }
        }
        return true;
        /**
         * 执行用时：7 ms, 在所有 Java 提交中击败了93.70%的用户
         * 内存消耗：39.9 MB, 在所有 Java 提交中击败了97.80%的用户
         */

//        byte[] sBytes = s.getBytes();
//        int l = 0, r = s.length() - 1;
//        while (l < r) {
//            if (sBytes[l] == sBytes[r]) {
//                l++;
//                r--;
//            } else {
//                // 不等之后分两种情况，要么删除左边，要么删除右边
//                boolean flagL = true,flagR = true;
//                for(int i = l + 1,j = r;i < j;i++,j--) {
//                    if (sBytes[i] != sBytes[j]) {
//                        flagL = false;
//                        break;
//                    }
//                }
//                if (!flagL) {
//                    for(int i = l,j = r-1;i < j;i++,j--) {
//                        if (sBytes[i] != sBytes[j]) {
//                            flagR = false;
//                            break;
//                        }
//                    }
//                }
//                return flagL || flagR;
//            }
//        }
//        return true;
        /**
         * 执行用时：6 ms, 在所有 Java 提交中击败了99.59%的用户
         * 内存消耗：40.5 MB, 在所有 Java 提交中击败了13.64%的用户
         * 特点：两个boolean辅助判断，当 flagL == false 时才进行 flagR 的判断，根据两者的结果共同决定结果
         */
    }

}
