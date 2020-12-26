package interview;

import java.util.ArrayList;
import java.util.Scanner;

public class xiangLong_PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int val = num;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("=============");
        while(val != 1){
            for (int i = 2; i <= val; i++) {
                if(val % i == 0){
                    list.add(i);
                    val /= i;
                    break;
                }
            }
        }
        System.out.print(num + " = ");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + " * ");
        }
        System.out.print(list.size() == 1 ? "1 * " + list.get(list.size() - 1) : list.get(list.size() - 1));
    }
}
