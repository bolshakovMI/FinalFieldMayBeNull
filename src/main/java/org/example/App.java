package org.example;


public class App {


    public static void main(String[] args) throws InterruptedException {
        methodWithStaticHolder();
//        methodWithInstanceHolder();
    }

    static void methodWithStaticHolder() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {

            public void run() {
                try {
                    SimpleObject simpleObject = new SimpleObject("строка есть");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();

        Thread.sleep(100);
        System.out.println("Количество элементов в CollectionHolder.list: " + CollectionHolder.list.size());
        System.out.println(CollectionHolder.list.get(0));

        Thread.sleep(1000);
        System.out.println("Количество элементов в CollectionHolder.list: " + CollectionHolder.list.size());
        System.out.println(CollectionHolder.list.get(0));
    }

    static void methodWithInstanceHolder() throws InterruptedException {
        CollectionHolder2 holder = new CollectionHolder2();
        Thread thread = new Thread(new Runnable() {

            public void run() {
                try {
                    SimpleObject2 simpleObject = new SimpleObject2("строка есть", holder);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();

        Thread.sleep(100);
        System.out.println("Количество элементов в CollectionHolder2.list: " + holder.list.size());
        System.out.println(holder.list.get(0));

        Thread.sleep(1000);
        System.out.println("Количество элементов в CollectionHolder2.list: " + holder.list.size());
        System.out.println(holder.list.get(0));
    }

}
