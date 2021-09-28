package com.bridgelabz.StacksandQueuesdemo;


public class StackMain  {
    public static void main(String args[]){
        //  stack implement use linked list
        System.out.println("Welcome to Stacks and Queues");
        //create object and give the push method value
        DataStructureStack StacksandQueuesdemo = new DataStructureStack();
        StacksandQueuesdemo.push(56);
        StacksandQueuesdemo.push(30);
        StacksandQueuesdemo.push(70);
        StacksandQueuesdemo.display();

            System.out.println("top value"+StacksandQueuesdemo.peek());
        StacksandQueuesdemo.pop();
        StacksandQueuesdemo.pop();
        StacksandQueuesdemo.display();
    }
}