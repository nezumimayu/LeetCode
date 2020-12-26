package stack;

public class No_1021_RemoveOutermostParentheses{
    public static void main(String[] args) {

        String S = "(()())(())";

        long startTime = System.currentTimeMillis();

        String result = removeOuterParentheses(S);
        System.out.println(result);

        long endTime = System.currentTimeMillis();
        System.out.println("运行时间:" + (endTime - startTime) + "ms");
        /**
         * 执行用时 :3 ms, 在所有 Java 提交中击败了92.88%的用户
         * 内存消耗 :39.5 MB, 在所有 Java 提交中击败了7.69%的用户
         */
    }

    public static String removeOuterParentheses(String S) {
        char[] arr = S.toCharArray();
        int sta = 0;
        int end ;
        int a = 0;
        StringBuffer buffer = new StringBuffer();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '('){
                if(a==0){
                    sta = i + 1;
                }
                a++;
            }else{
                a--;
                if(a==0){
                    end = i ;
                    buffer.append(arr, sta, end - sta);
                }
            }
        }
        return buffer.toString();
    }
}
