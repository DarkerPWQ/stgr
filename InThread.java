package com.pwq.ThreadPool;

/**
 * @Author：WenqiangPu
 * @Description
 * @Date：Created in 18:38 2017/8/1
 * @Modified By：
 */
//第2次提交master
    //dev1的第一次提交
    //dev2的第2次提交
    master
public class InThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName());
        while (true) {
            try {
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void see(){
        System.out.println("keyi");
    }
}
