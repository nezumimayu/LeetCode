package string;

public class No_551_StudentAttendanceRecordI {
    public static void main(String[] args) {
        String str = "PPALLP";
        boolean result = checkRecord(str);
        System.out.println("result = " + result);
    }

    public static boolean checkRecord(String s) {
//        if(s.indexOf('A') != s.lastIndexOf('A'))
//            return false;
//        int late = 0;
//        for (char c : s.toCharArray()) {
//            if(c == 'L'){
//                if(++late > 2)
//                    return false;
//            }else{
//                late = 0;
//            }
//        }
//        return true;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.9 MB, 在所有 Java 提交中击败了17.62%的用户
         */

        return s.indexOf("A") == s.lastIndexOf("A") && !s.contains("LLL");
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.6 MB, 在所有 Java 提交中击败了55.33%的用户
         */
    }
}
