package test;

import org.junit.Test;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.*;

 class testSpeedMethod {
//    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//
//        long endTime = System.currentTimeMillis();
//        System.out.println("运行时间:" + (endTime - startTime) + "ms");
//    }

//    public static void main(String[] args){
//        fun(10);
//        System.out.println("count = " + count);
//    }

    static int count = 0;

    public static int fun(int num){
        count++;
        if(num <= 2)
            return 1;
        return fun(num - 2) + fun(num - 4) + 1;
    }

    @Test
    public void test(){
        final int a = 100;
        double b = 3.0;
        double c = a / b;
        System.out.println(c);

        Integer flag = 2;
        Integer test = 2;
        flag = (test = 4);
        System.out.println(flag);

    }

    @Test
    public void test1(){
        int num = method();
        System.out.println("num = " + num);
    }

    private int method() {
        int num = 5;
        try {
            num = num / 2;
            return num;
        } catch (Exception e) {
            num = 10;
        } finally {
            num = 15;
//            return num;
        }
        return num;
    }

    @Test
    public void test2() {
        int num1 = 5, num2 = 12;
//        num1 = num1 ^ num2;
//        num2 = num1 ^ num2;
//        num1 = num1 ^ num2;
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    @Test
    public void test3(){
        byte b1 = 1, b2 = 2, b3, b6;
        final byte b4 = 4, b5 = 6;
        b6 = b4 + b5;
        b3 = (byte)(b1 + b2);
        System.out.println(b3 + b6);
    }

    @Test
    public void test4(){
        int x = 20, y = 5;
        System.out.println(x + y + "" + (x + y) + y);
    }



    public static void main2(String[] args) {
//        MyThread thread = new MyThread();
//        thread.start();

        MyRunableThread runableThread = new MyRunableThread();
        Thread thread = new Thread(runableThread);
        thread.start();
    }

    @Test
    public void test5(){
        String str = "";
        System.out.println(str.split(",").length);
        System.out.println(Arrays.toString(str.split(",")));
    }

    @Test
    public void test6() throws IOException {
//        Socket socket = new Socket("127.0.0.1", 8080);

        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
    }

    @Test
    public void test7(){
        System.out.println("(-12 >> 2) = " + (-12 >> 2));
    }

    @Test
    public void test8(){
        Father s = new Son();
        s.method1();
        System.out.println(s instanceof Son);
        System.out.println(s instanceof Father);
//        System.out.println(Son instanceof Father);
    }

    @Test
    public void test9(){
        Integer i = Integer.valueOf("23");
        Integer ii = Integer.parseInt("23");
        int num = i;
        Object obj = true ? new Long(1) : new Float(2.0);
        System.out.println("obj = " + obj);
        System.out.println(obj.getClass());
    }

    @Test
    public void test10(){
//        Father f = new Father();
//        Father.Girl girl = f.new Girl();
        Father.Girl girl = new Father().new Girl();
        girl.sing();
    }

    public static void setValue(final int i) {
        //编译通不过，基本数据类型不能够改变
//        i = 10;
    }

    @Test
    public void test11(){
        Son son = new Son();
        son.method1();
    }

    @Test
    public void test12(){
        System.out.println(int.class.getName());
        System.out.println(void.class.getName());
        System.out.println(Integer.class.getName());
        System.out.println(int[].class.getName());
        System.out.println(int[][].class.getName());
        System.out.println(String[].class.getName());
    }

    @Test
    public void test13(){
        Integer x = new Integer(123);
        Integer y = new Integer("123");

        Integer _x = Integer.valueOf(123);
        Integer _y = Integer.valueOf(123);
        System.out.println("(x == y) = " + (x == y));
        System.out.println("(_x == _y) = " + (_x == _y));
    }

    @Test
    public void test14(){
        float f = 42.0f;
        float f1[] = new float[2];
        float f2[] = new float[2];
        float[] f3 = f1;
        long x = 42;
        f1[0] = 42.0f;
        System.out.println(f1 == f2);
        System.out.println(x == f1[0]);
        System.out.println(f1 == f3);
//        System.out.println(f2 == f1[1]);
    }

    @Test
    public void test15(){
        int i = 1000;
//        float f = 45.0;
        char s = '\u0639';
        Object o = 'f';
        String str = "hello,world\0";
//        Double d = 100;
// 大写的Double是封装类，进行装箱过程中调用的Double类的valueOf( double d )方法， 而这里是100为int型， 所以编译会“cannot convert from int to Double”
        double dd = 100;
        System.out.println("i = " + i);
        System.out.println("s = " + s);
        System.out.println("o = " + o);
        System.out.println("str = " + str);
        System.out.println("dd = " + dd);
    }

    @Test
    public void test16() {
        String s1 = new String("xyz");
        String s2 = new String("xyz");
        Boolean b1 = s1.equals(s2);
        Boolean b2 = (s1 == s2);
        System.out.print(b1 + " " + b2);
    }

    @Test
    public void test17(){
        String s1 = "xyz";
        String s2 = "xyz";
        Boolean b1 = s1.equals(s2);
        Boolean b2 = (s1 == s2);
        System.out.print(b1 + " " + b2);
    }

    @Test
    public void test18(){
        String s2 = "abc";
        String s1 = new String("abc");
        System.out.println("(s1.equals(s2)) = " + (s1.equals(s2)));
        System.out.println("(s1 == s2) = " + (s1 == s2));
    }
    
    @Test
    public void test19(){
        char[] chars = {'h', 'e', 'l', 'l', '0'};
        String s = "hello";
        System.out.println("(s.equals(chars)) = " + (s.equals(chars)));
    }

    @Test
    public void test20(){
        String s1 = "xyz";
        String s2 = "xyz";
        String s3 = new String("xyz");
        String s4 = new String("xyz");
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);
    }

    @Test
    public void test21(){
        System.out.println(AccountType.FIXED);
    }

    @Test
    public void test22(){
        final StringBuilder sb = new StringBuilder();
        sb.append("ab");
//        sb = new StringBuilder();
    }

    @Test
    public void test23(){
        int[] arr = new int[]{12,3,3,34,56,77,432};
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = arr[i] / arr[0];
        }
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test24(){
        char[] chars = new char[]{'a', 'b'};
        System.out.println(chars);
    }

    @Test
    public void test25(){
        System.out.println("\thello");
    }

    @Test
    public void test26(){
        ByteBuffer buffer = ByteBuffer.allocateDirect(1024);

    }

    private static boolean run = true;

    @Test
    public void test27() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while (run) {
            }
        });
        t1.start();
        Thread.sleep(1000);
        Thread t2 = new Thread(() -> {
            run = false;
            System.out.println("时间到，线程2设置为false");
        });
        t2.start();
    }

    @Test
    public void test28(){
        Long l1 = 100l;
        Long l2 = 100l;
        System.out.println(l1 == l2);
        Long l3 = 200l;
        Long l4 = 200l;
        System.out.println(l3 == l4);

        final char[] chars = {'a', 'b', 'c'};

        chars[1] = 'd';
        System.out.println(chars);

//        String str = ;
    }

     public static void main(String[] args) {
         System.out.println(Arrays.toString(method5()));
     }

    public static int[] method5(){
        int[] nums = new int[]{3, 5, 6, 9, 10, 4};
        int target = 9;
        int l = 0, r = nums.length - 1;
        while(l <= r){
            if(nums[l] + nums[r] == target){
                return new int[]{l, r};
            }else if(nums[l] + nums[r] < target){
                l++;
            }else{
                r--;
            }
        }
        return null;
    }

    @Test
    public void test29(){
//        final String a = "abc";
//        final String b = "def";
//        String c = "abcdef";
//        String d = "abc" + "def";
//        String f = a + b;
//        System.out.println(c == d);
//        System.out.println(c == f);
        int a = 2, b = 3;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    @Test
    public void test30(){
        int[] nums = new int[]{1,8,5,10,90,0};
        boolean flag;
        for (int i = 0; i < nums.length - 1; i++) {
            flag = false;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    flag = true;
                }
            }
            if(!flag)
                break;
        }
        System.out.println(Arrays.toString(nums));
    }

    void waitForSignal() {
        Object obj = new Object();
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            obj.notify();
        }
    }
}

class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("线程执行...");
    }
}

class MyRunableThread implements Runnable{

    @Override
    public void run() {
        System.out.println("线程执行...");
    }
}

class Father{

    static int age = 18;

    public void method1(){
        System.out.println("父类的方法");
    }

    static{
//        Girl g = new Girl();      //'test.Father.this' 不能从静态上下文引用
//        g.sing();
    }

    class Girl{
        public void sing(){
            Father.age = 20;
            System.out.println("唱歌");
        }
    }
}

class Son extends Father{
    @Override
    public void method1() throws ArithmeticException{
        System.out.println("子类重写方法");
    }

}

class A {
    public void foo() throws IOException {}
}

class B extends A {
    @Override
    public void foo() throws SocketException {} // allowed

//    @Override
//    public void foo() throws SQLException {} // NOT allowed
}

interface D{

}

abstract class E{
    int num;

}

class Person{
    String name;
    private static int age;
    //非静态成员内部类
    class Bird{
        String name;
        public void display(String name){
            System.out.println(name);				//方法的形参
            System.out.println(this.name);			//内部类的属性
            System.out.println(Person.this.name);	//外部类的属性
            System.out.println(Person.age);         //外部类的私有的静态属性
        }
    }
}
 class Example{
    String str = new String("hello");
    char[] ch = {'a', 'b'};
    public static void main(String args[]) {
        Example ex = new Example();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
    }
    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'c';
    }
}

enum AccountType{
    SAVING, FIXED, CURRENT;
    private AccountType(){
        System.out.println("It is a account type");
    }
}

class Test1{
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void method(int a, int b) {
        a = 100;
        b = 200;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.exit(0);
    }
}

class Test2 {
    public void add(Byte b) {
        System.out.println(b);
        b = b++;
    }

    public void test() {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.println(a + " ");
        add(b);
        System.out.println(b + "");
    }


    public static void main(String[] args) {

        Test2 test2 = new Test2();
        test2.test();
        int num = 10;
//        num += 2;

    }
}

class ABC{
    private static void demo2() {
        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                printNumber("A");
            }
        });
        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("B 开始等待 A");
                try {
                    A.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                printNumber("B");
            }
        });
        Thread C = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    System.out.println("C 开始等待 A");
                    A.join();
                    System.out.println("C 开始等待 B");
                    B.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                printNumber("C");
            }
        });
        B.start();
        C.start();
        A.start();
    }
    private static void printNumber(String threadName) {
        int i=0;
        while (i++ < 3) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " print: " + i);
        }
    }

    public static void main(String[] args) {
        demo2();
    }
}



