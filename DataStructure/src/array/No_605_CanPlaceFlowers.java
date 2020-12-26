package array;

public class No_605_CanPlaceFlowers {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1};
//        int[] arr = {0,0,1,0,1,0,0};
        int n = 2;
        boolean result = canPlaceFlowers(arr, n);
        System.out.println("result = " + result);
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
//        if(flowerbed.length == 1 && flowerbed[0] == 0 && n == 1)
//            return true;
//        int val = 0, temp = 0;
//        for (int i = 0; i < flowerbed.length; i++) {
//            if(flowerbed[i] == 0){
//                if(i == 0 || i == flowerbed.length - 1)
//                    temp++;
//                temp++;
//            }else{
//                val += ((temp - 1) / 2);
//                temp = 0;
//            }
//        }
//        val += ((temp - 1) / 2);
//        System.out.println("val = " + val);
//        return val >= n;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：41 MB, 在所有 Java 提交中击败了90.85%的用户
         */
        int result = 0;
        int count = 1;              //左边界补零

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                result += (count - 1) / 2;
                count = 0;
            } else {
                count++;
            }
        }
        result += count / 2;        //右边界补零
        return result >= n;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：41.1 MB, 在所有 Java 提交中击败了84.31%的用户
         * 特点：边界补零
         */
    }

}
