package com.happy.practice.concurrent.utils.futureTask.sample01;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FutureTaskForMultiCompute {
    public static void main(String[] args) {
        List<FutureTask<Integer>> taskList = new ArrayList<FutureTask<Integer>>();

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {

            FutureTask<Integer> ft = new FutureTask<Integer>(new ComputeTask(i, "" + i));
            taskList.add(ft);

            executor.submit(ft);
        }

        System.out.println("Submitted all of task, main thread will do another thing!");

        Integer totalResult = 0;

        for (FutureTask<Integer> ft : taskList){
            try {
                totalResult += ft.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();

        System.out.println("Multi task total amount is: " + totalResult);
    }
}
