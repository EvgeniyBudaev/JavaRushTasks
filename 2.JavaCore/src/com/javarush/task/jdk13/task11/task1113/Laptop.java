package com.javarush.task.jdk13.task11.task1113;

public class Laptop {
    private final String name;
    private final OperatingSystem os;

    public Laptop(String laptopName, String osName, String osVersion) {
        //напишите тут ваш код
        this.name = laptopName;
        this.os = new OperatingSystem(osName, osVersion);
    }

    public String getName() {
        return name;
    }

    public void updateOS(String version) {
        os.setVersion(version);
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(os.getName());
        System.out.println(os.getVersion());
    }
}
