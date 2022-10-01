package com.javarush.task.jdk13.task20.task2011;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public Goods goods;
    public int count;
    public double profit;
    public List<String> secretData;

    //В классе Shop.Goods должен быть создан список строк names.
    public static class Goods {
        public List<String> names = new ArrayList<>();
    }
}
