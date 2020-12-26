package sort;

public class No_1491_AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public static void main(String[] args) {
        int[] salary = {8000,9000,2000,3000,6000,1000};
        double result = average(salary);
        System.out.println("result = " + result);
    }

    public static double average(int[] salary) {
//        int min = Math.min(salary[0], salary[1]), max = Math.max(salary[0], salary[1]);
//        int result = 0;
//        for (int i = 2; i < salary.length; i++) {
//            if(salary[i] > max){
//                result += max;
//                max = salary[i];
//            }else if(salary[i] < min){
//                result += min;
//                min = salary[i];
//            }else{
//                result += salary[i];
//            }
//        }
//        return (double)result / (salary.length - 2);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.2 MB, 在所有 Java 提交中击败了79.72%的用户
         */

        double sum = 0;
        double maxValue = Integer.MIN_VALUE, minValue = Integer.MAX_VALUE;
        for (int num : salary) {
            sum += num;
            maxValue = Math.max(maxValue, num);
            minValue = Math.min(minValue, num);
        }
        return (sum - maxValue - minValue) / (salary.length - 2);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.2 MB, 在所有 Java 提交中击败了79.72%的用户
         */
    }
}
