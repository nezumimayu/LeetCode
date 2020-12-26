package binary_search;

public class No_852_PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        int result = peakIndexInMountainArray(arr);
        System.out.println("result = " + result);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = (left + right) >> 1;
            if((mid - 1 >= 0 && arr[mid] > arr[mid - 1]) && (mid + 1 < arr.length && arr[mid] > arr[mid + 1])){
                return mid;
            }else if(arr[mid] < arr[mid + 1]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.5 MB, 在所有 Java 提交中击败了5.30%的用户
         */

//        int left = 0, right = arr.length - 1;
//        while(left < right){
//            int mid = (left + right) >> 1;
//            if(arr[mid] < arr[mid + 1])
//                left = mid + 1;
//            else
//                right = mid;
//        }
//        return left;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39 MB, 在所有 Java 提交中击败了73.70%的用户
         */
    }
}
