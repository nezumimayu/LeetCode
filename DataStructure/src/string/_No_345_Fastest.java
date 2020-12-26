package string;

public class _No_345_Fastest {
    public static void main(String[] args) {
//        String str = "hello";
        String str = "Aa";
        String result = reverseVowels(str);
        System.out.println("result = " + result);
    }

    public static String reverseVowels(String s) {
        int[] vowels = new int[123];
        vowels['a'] = 1;
        vowels['i'] = 1;
        vowels['o'] = 1;
        vowels['e'] = 1;
        vowels['u'] = 1;
        vowels['A'] = 1;
        vowels['I'] = 1;
        vowels['O'] = 1;
        vowels['E'] = 1;
        vowels['U'] = 1;
        char[] temp = s.toCharArray();
        int left = 0,right = temp.length - 1;
        while (left < right){
            while (left < right && vowels[temp[left]] != 1){
                left++;
            }
            while (right >= 0 && vowels[temp[right]] != 1){
                right--;
            }
            if(left >= right)
                break;
            char c = temp[left];
            temp[left++] = temp[right];
            temp[right--] = c;
        }
        return new String(temp);
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.8 MB, 在所有 Java 提交中击败了73.64%的用户
         * 特点：创建全字母数组，将元音设置为 1
         */
    }

}
