package com.happy.practice.concurrent.utils.futureTask.sample01;

import java.util.concurrent.Callable;

public class ComputeTask implements Callable<Integer> {
    private Integer result = 0;
    private String taskName = "";

    public ComputeTask(Integer result, String taskName) {
        this.result = result;
        this.taskName = taskName;

        System.out.println("Generate main thread compute task: " + taskName);
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public Integer call() throws Exception {

        for (int i = 0; i < 100; i++) {
            result =+ i;
        }

        Thread.sleep(5000);
        System.out.println("Sub thread compute task: " + taskName + " complete!");
        return result;
    }
}
