/**
 * @author nezumimayu
 * @since 2020-12-25 9:38
 */
public class No_0101_IsUniqueLCCI {
    public static void main(String[] args) {
        String astr = "abc";
        boolean result = isUnique(astr);
        System.out.println("result = " + result);
    }

    public static boolean isUnique(String astr) {
//        boolean[] temp = new boolean[26];
//        char[] chars = astr.toCharArray();
//        for(char c : chars){
//            if(temp[c - 'a'])
//                return false;
//            else
//                temp[c - 'a'] = true;
//        }
//        return true;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36 MB, 在所有 Java 提交中击败了85.40%的用户
         */

//        int mark = 0;
//        for(char ch : astr.toCharArray()) {
//            int index = ch - 'a';
//            System.out.println(1 << index);
//            if((mark & (1 << index)) != 0) {
//                return false;
//            } else {
//                mark |= (1 << index);
//            }
//        }
//        System.out.println("mark = " + mark);
//        return true;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.1 MB, 在所有 Java 提交中击败了73.97%的用户
         * 特点：位运算，用一个 int 来标识位置
         *      把字符串中每个字符转化为一个二进制数，转化方法为 1 向左 N 位的位运算，N 为这个字符和字符‘a'的距离；
         *      例如 Na = 0, Nb=1, Nc = 2... a = 1<<0 = 1, b = 1<<1 = 10, c = 1<<2 = 100..；
         *      所以，每个字符对应一个位的位置；
         *      这种情况下，如果当前字符如果曾经出现过，也就是其中某一位对应位数的值为1，就意味着曾经出现，返回False；
         *      否则，如果没有出现过，那么通过|或运算，把这一位的值改写为1；
         *      例如 'abca' ： a= 1,b=10,c=100,前三次结果mark为111，最后一次111与001有相同符合条件，返回False
         */

        long low64 = 0;
        long high64 = 0;
        for (char c : astr.toCharArray()) {
            if (c >= 64) {
                long bitIndex = 1L << (c - 64);
                if ((high64 & bitIndex) != 0) {
                    return false;
                }
                high64 |= bitIndex;
            } else {
                long bitIndex = 1L << c;
                if ((low64 & bitIndex) != 0) {
                    return false;
                }
                low64 |= bitIndex;
            }
        }
        return true;
    }


}
