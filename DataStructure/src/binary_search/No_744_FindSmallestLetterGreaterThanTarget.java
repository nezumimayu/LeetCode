package binary_search;

public class No_744_FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'e','e','e','e','e','e','n','n','n','n'};
//        char[] letters = {'c', 'f', 'j'};
        char target = 'e';
        char result = nextGreatestLetter(letters, target);
        System.out.println("result = " + result);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;
        while(left <= right){
            int mid = (left + right) >>> 1;
            if((mid - 1 < 0 || letters[mid - 1] <= target) && letters[mid] > target){
                return letters[mid];
            }else if(letters[mid] <= target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return letters[0];
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.2 MB, 在所有 Java 提交中击败了46.94%的用户
         */
    }
}
