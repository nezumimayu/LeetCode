package string;

public class No_657_RobotReturnToOrigin {
    public static void main(String[] args) {
        String str = "UDLL";
        boolean result = judgeCircle(str);
        System.out.println("result = " + result);
    }

    public static boolean judgeCircle(String moves) {
//        int hor = 0, ver = 0;
//        for (char c : moves.toCharArray()) {
//            switch (c){
//                case 'R' :
//                    hor++;
//                    break;
//                case 'L' :
//                    hor--;
//                    break;
//                case 'U' :
//                    ver++;
//                    break;
//                case 'D' :
//                    ver--;
//                    break;
//            }
//        }
//        return hor == 0 && ver == 0;
        /**
         * 执行用时：5 ms, 在所有 Java 提交中击败了95.56%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了14.35%的用户
         */
        int[] cnt = new int[26];
        for (char c : moves.toCharArray())
            cnt[c - 'A']++;
        return cnt['L' - 'A'] == cnt['R' - 'A'] && cnt['U' - 'A'] == cnt['D' - 'A'];
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了11.96%的用户
         * 特点：数组计数法
         */
    }
}
