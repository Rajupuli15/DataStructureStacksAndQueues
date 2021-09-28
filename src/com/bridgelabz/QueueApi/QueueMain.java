package com.bridgelabz.QueueApi;

public class QueueMain  {
    public static void main(String args[]) {
        // stack implement use linkedlist

        System.out.println("Welcome to queue ");
        //create object and give the push method value
        QueueMainLinked queueMainLinked = new QueueMainLinked();

        queueMainLinked.enqueue(56);
        queueMainLinked.enqueue(30);
        queueMainLinked.enqueue(60);
        queueMainLinked.display();
        System.out.println("queue front" + queueMainLinked.front.key);


        QueueMainLinked.dqueue();
        QueueMainLinked.dqueue();
        System.out.println("queue front"+ queueMainLinked.front.key);

    }
}