package greedy;

public class No_860_LemonadeChange {
    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};
        boolean result = lemonadeChange(bills);
        System.out.println("result = " + result);
    }

    public static boolean lemonadeChange(int[] bills) {
        int bill5 = 0, bill10 = 0;
        for (int bill : bills) {
            switch (bill){
                case 5:
                    bill5++;
                    break;
                case 10:
                    bill5--;
                    bill10++;
                    break;
                case 20:
                    if(bill10 > 0){
                        bill10--;
                        bill5--;
                    }else{
                        bill5 -= 3;
                    }
            }
//            if(bill5 < 0 || bill10 < 0)
            if(bill5 < 0)
                return false;
        }
        return true;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了99.93%的用户
         * 内存消耗：39.6 MB, 在所有 Java 提交中击败了87.51%的用户
         */
    }
}
