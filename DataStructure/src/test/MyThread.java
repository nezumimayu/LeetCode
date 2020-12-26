package test;

import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread {

    public MyThread(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " staring...");
        System.out.println(this.getName() + " end...");
    }

    public static void main(String[] args) {

    }

//    public static void main(String[] args) throws InterruptedException {
//        System.out.println("main thread starting...");
//
//        List<MyThread> list = new ArrayList<>();
//
//        for (int i = 1; i <= 5; i++) {
//            MyThread my = new MyThread("Thrad " + i);
//            my.start();
//            list.add(my);
//        }
//
//        for (MyThread my : list) {
//            my.join();
//        }
//
//        System.out.println("main thread end...");
//    }
}

class Test01Visibility {    // 多个线程都会访问的数据,我们称为线程的共享数据
    private static boolean run = true;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while (run) {
//                synchronized (Test01Visibility.class){
//
//                }
//                System.out.println("");
            }
        });
        t1.start();
        Thread.sleep(1000);
        Thread t2 = new Thread(() -> {
            run = false;
            System.out.println("时间到,线程2设置为false");
        });
        t2.start();
    }
}



class Test02Atomicity {
    private static int number = 0;
//    static Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
        Runnable increment = () -> {
            synchronized (Test02Atomicity.class){
                for (int i = 0; i < 1000; i++) {
                    number++;
                }
            }
        };
        ArrayList<Thread> ts = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(increment);
            t.start();
            ts.add(t);
        }
        for (Thread t : ts) {
            t.join();
        }
        System.out.println("number = " + number);
    }
}

//@JCStressTest
//@Outcome(id = {"1", "4"}, expect = Expect.ACCEPTABLE, desc = "ok")
//@Outcome(id = "0", expect = Expect.ACCEPTABLE_INTERESTING, desc = "danger")
//@State
//public class Test03Orderliness {
//    int num = 0;
//    boolean ready = false;    // 线程一执行的代码
//
//    @Actor
//    public void actor1(I_Result r) {
//        synchronized (Test03Orderliness.class){
//            if (ready) {
//                r.r1 = num + num;
//            } else {
//                r.r1 = 1;
//            }
//        }
//    }
//
//    // 线程2执行的代码
//    @Actor
//    public void actor2(I_Result r) {
//        synchronized (Test03Orderliness.class){
//            num = 2;
//            ready = true;
//        }
//    }
//}