package array;

public class No_561_Fastest {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,6,4,7,9,7,7};
        int result = arrayPairSum(arr);
        System.out.println("result = " + result);
    }

    public static int arrayPairSum(int[] nums) {
        boolean[] flag = new boolean[20001];
        int sum = 0;
        for(int n : nums){
            // 如果相同的两个元素，则差值为0，不需要再循环里计算
            flag[n+10000] = !flag[n+10000];
            sum += n;
        }

        boolean odd = true;
        int nSum = 0;
        for(int i=0; i<20001; i++){
            if(flag[i]){
                if(odd){
                    nSum += -(i-10000);
                } else {
                    nSum += i-10000;
                }
                odd = !odd;
            }
        }

        // 假设a=分组里小值之和，b=分组里的大值之和,a是所求的目标值
        // sum=a+b,nSum=b-a,故(sum+bSum)/2=(a+b-(b-a))/2=a
        return (sum-nSum)/2;
        /**
         * 执行用时：5 ms, 在所有 Java 提交中击败了99.44%的用户
         * 内存消耗：42.1 MB, 在所有 Java 提交中击败了8.33%的用户
         */

//        if(nums.length == 0){
//            return 0;
//        }
//        int[] bucket = new int[20001];
//        for(int i = 0; i < nums.length; i++){
//            bucket[nums[i] + 10000]++;
//        }
//        boolean flag = true;
//        int sum = 0;
//        for(int i = 0; i < bucket.length; i++){
//            while (bucket[i] > 0){
//                if(flag){
//                    sum += (i - 10000);
//                }
//                flag = !flag;
//                bucket[i]--;
//            }
//        }
//        return sum;
        /**
         * 执行用时：7 ms, 在所有 Java 提交中击败了97.73%的用户
         * 内存消耗：41.3 MB, 在所有 Java 提交中击败了8.33%的用户
         */
    }

}
