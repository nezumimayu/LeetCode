package array;

public class No_1450_NumberOfStudentsDoingHomeworkAtAGivenTime {
    public static void main(String[] args) {
        int[] start = {4};
        int[] end = {4};
        int query = 4;
        int reuslt = busyStudent(start, end, query);
        System.out.println("reuslt = " + reuslt);
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int result = 0;
        for (int i = 0; i < startTime.length; i++) {
            result += queryTime >= startTime[i] && queryTime <= endTime[i] ? 1 : 0;
        }
        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.7 MB, 在所有 Java 提交中击败了100.00%的用户
         */
    }
}
