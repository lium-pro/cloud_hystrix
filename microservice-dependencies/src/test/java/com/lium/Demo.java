package com.lium;

public class Demo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
//        myThread.run();
        //myThread.start();
        String i = new String("abc");
        String c = new String("abc");
        String b = "abc";
        String d = b;
       /* System.out.println(i == b);
        System.out.println(i.equals(b));
        */System.out.println(i.equals(c));

        System.out.println(b.equals(d));
    }
}

class MyThread extends Thread {
    /*
    这是被主线程调用的，即main
     */
    public MyThread() {
        System.out.println("run方法的打印1：" + Thread.currentThread().getName());
    }

    /*
    这是被子线程调用，也就是说主线程调用一切子线程，所以构造器里的方法会先执行。同时我们也要理解，
    当一个方法启动时，至少启动两个线程，一个是main，一个是GC（垃圾回收器）
    run方法本身是被main函数调用的
     */
    @Override
    public void run() {
        System.out.println("run方法的打印2：" + Thread.currentThread().getName());

    }
}
