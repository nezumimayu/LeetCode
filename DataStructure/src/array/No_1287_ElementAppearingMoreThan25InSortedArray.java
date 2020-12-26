package array;

public class No_1287_ElementAppearingMoreThan25InSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};
//        int[] arr = {1};
//        int[] arr = {1,2,3,3};
        int result = findSpecialInteger(arr);
        System.out.println("result = " + result);
    }

    public static int findSpecialInteger(int[] arr) {
//        if(arr.length == 1)
//            return arr[0];
//        int val = arr.length / 4;
//        System.out.println("val = " + val);
//        for (int i = 1, index = 0; i < arr.length; i++) {
//            if(arr[i - 1] == arr[i]){
//                index+=2;
//                if(index > val)
//                    return arr[i];
//            }else
//                index = 0;
//        }
//        return -1;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.9 MB, 在所有 Java 提交中击败了41.67%的用户
         */
        int len = arr.length / 4;
        for(int i = 0; i + len < arr.length; i++){
            if(arr[i] == arr[i + len]){
                return arr[i];
            }
        }
        return arr[0];
    }
}
