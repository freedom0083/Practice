package com.happy.practice.concurrent.utils.latch.sample01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
    private String name;
    private int workTime;
    private CountDownLatch start;
    private CountDownLatch end;

    public Worker(String name, int workTime, CountDownLatch start, CountDownLatch end) {
        this.name = name;
        this.workTime = workTime;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        try {
            start.await();
            System.out.println("Worker " + name + " works at: " + sdf.format(new Date()));

            Thread.sleep(workTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Worker " + name + " works complete at: " + sdf.format(new Date()));

            end.countDown();
        }
    }
}
