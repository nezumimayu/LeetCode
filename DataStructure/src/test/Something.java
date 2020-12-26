package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Something {
    public static void main(String[] args) {
//        Other o = new Other();
//        new Something().addOne(o);
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串(中间能加空格或符号)");
        String s1 = input.nextLine();
        System.out.println(s1);
        System.out.println("请输入一个字符串(中间不能加空格或符号)");
        String s2 = input.next();
        System.out.println(s2);
        System.out.println("请输入一个整数");
        int num = input.nextInt();
        System.out.println(num);
    }

    public void addOne(final Other o) {
        o.i++;
    }
}

class Other {
    public int i;
}

class BaseException extends Exception {
}

class MyException extends BaseException {
}

 class ExceptionTest1 {
    public static void main(String[] args) throws Exception {
        try {
            try {
                throw new MyException();
            } catch (MyException e) {
                System.out.println("Caught MyException1");
                BaseException newException = (BaseException) e;
                throw newException;
            }
        } catch (MyException e) {
            System.out.println("Caught MyException2");
            return;
        } catch (BaseException e) {
            System.out.println("Caught BaseException3");
            throw e;
        } finally {
            System.out.println("finally");
        }
    }
}

 class TestGetValue {
    public static int getValue(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getValue(2));
    }
}