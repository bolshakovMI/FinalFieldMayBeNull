package org.example;

public class SimpleObject {
    final String string;

    SimpleObject(String string) throws InterruptedException {
        System.out.println("Начало выполнения конструктора");
        CollectionHolder.list.add(this);
        Thread.sleep(1000);
        this.string = string;
        System.out.println("Конец выполнения конструктора");
    }

    @Override
    public String toString() {
        return "SimpleObject{" +
                "string='" + string + '\'' +
                '}';
    }
}
