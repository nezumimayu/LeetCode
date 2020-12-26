package stack;

public class No_1047_RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String S = "abbaca";
        long startTime = System.currentTimeMillis();

        String result = removeDuplicates(S);
        System.out.println(result);

        long endTime = System.currentTimeMillis();
        System.out.println("运行时间:" + (endTime - startTime) + "ms");
        /**
         * 执行用时 :9 ms, 在所有 Java 提交中击败了92.84%的用户
         * 内存消耗 :40.1 MB, 在所有 Java 提交中击败了7.69%的用户
         */
    }

    public static String removeDuplicates(String S) {
        char[] arr = S.toCharArray();
        StringBuilder str = new StringBuilder();
        int data = 0;
        for(int i = 0; i < arr.length; i++){
            if((int)arr[i] == data){
                if(str.length() < 2){
                    data = 0;
                }else{
                    data = (int)str.charAt(str.length() - 2);
                }
                str.delete(str.length() - 1, 99999);
            }else{
                data = (int)arr[i];
                str.append(arr[i]);
            }
        }
        return str.toString();

    }
}
