package com.javarush.task.jdk13.task28.task2816;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task implements Callable<String> {

    private final char letter;
    private final Future<String> future;

    public Task(char letter, Future<String> future) {
        this.letter = letter;
        this.future = future;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(new Random().nextInt(20));
        System.out.println(letter);
        return "" + future.get().substring(0, future.get().indexOf(letter));
    }
}
