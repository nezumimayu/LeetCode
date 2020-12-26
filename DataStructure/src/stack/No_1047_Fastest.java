package stack;

public class No_1047_Fastest {
    public static void main(String[] args) {
        String S = "abbaca";
        String result = removeDuplicates(S);
        System.out.println(result);

        /**
         * 执行用时 :3 ms
         */
    }

    public static String removeDuplicates(String S) {
        int i=0;
        char[] res = S.toCharArray();
        for(int j=0;j<res.length;j++,i++){
            res[i] = res[j];
            if(i>0 && res[i]==res[i-1]){
                i -= 2;
            }
        }
        return new String(res, 0, i);
    }
}
