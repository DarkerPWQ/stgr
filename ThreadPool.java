package com.pwq.ThreadPool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author：WenqiangPu
 * @Description
 * @Date：Created in 19:52 2017/8/1
 * @Modified By：
 */
mster 5
ds
public class ThreadPool implements Runnable{
    ExecutorService executorService = Executors.newFixedThreadPool(2);
    @Override
    public void run() {
        System.out.println("线程池里面的线程"+Thread.currentThread().getName());
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程池里面的线程池的线程"+Thread.currentThread().getName());
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程池里面的线程池的线程"+Thread.currentThread().getName());
            }
        });

    }
}
