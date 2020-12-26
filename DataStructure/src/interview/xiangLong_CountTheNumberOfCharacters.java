package interview;

import java.util.Scanner;

public class xiangLong_CountTheNumberOfCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("================");
        char[] chars = str.toCharArray();
        int[] count = new int[129];
        for (char c : chars) {
            count[c]++;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i] != 0){
                System.out.println((char) i + " : " + count[i]);
            }
        }
    }
}
