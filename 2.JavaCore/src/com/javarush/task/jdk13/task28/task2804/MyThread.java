package com.javarush.task.jdk13.task28.task2804;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {

    private static volatile AtomicInteger priority = new AtomicInteger(MIN_PRIORITY);

    public MyThread() {
        corrPriority();
    }

    public MyThread(Runnable target) {
        super(target);
        corrPriority();
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        corrPriority();
    }

    public MyThread(String name) {
        super(name);
        corrPriority();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        corrPriority();
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        corrPriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        corrPriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        corrPriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals) {
        super(group, target, name, stackSize, inheritThreadLocals);
        corrPriority();
    }

    private synchronized void corrPriority(){
        int currentPriority = priority.getAndIncrement();
        currentPriority = getThreadGroup() != null && currentPriority > getThreadGroup().getMaxPriority()
                ? getThreadGroup().getMaxPriority() : currentPriority;
        setPriority(currentPriority);
        if (priority.intValue() > MAX_PRIORITY) priority.set(MIN_PRIORITY);

    }

}