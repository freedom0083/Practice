package com.happy.practice.concurrent.utils.latch.sample01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;

public class Latch {
    final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch end = new CountDownLatch(2);

        Worker worker1 = new Worker("Worker1", 5000, start, end);
        Worker worker2 = new Worker("Worker2", 8000, start, end);

        new Thread(worker1).start();
        new Thread(worker2).start();

        start.countDown();

        end.await();

        System.out.printf("All workers completed at: " + sdf.format(new Date()));
    }
}
