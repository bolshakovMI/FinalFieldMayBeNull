package org.example;

public class SimpleObject2 {
    final String string;

    SimpleObject2(String string, CollectionHolder2 holder) throws InterruptedException {
        System.out.println("Начало выполнения конструктора");
        holder.list.add(this);
        Thread.sleep(1000);
        this.string = string;
        System.out.println("Конец выполнения конструктора");
    }

    @Override
    public String toString() {
        return "SimpleObject2{" +
                "string='" + string + '\'' +
                '}';
    }
}
