package com.bridgelabz.StacksandQueuesdemo;

public class DataStructureStack<T> {

    //creating linked list node

    private class Node {
        T data;
        Node link;
    }

    Node topper;

    //default constructor give null value at topper
    public DataStructureStack() {
        this.topper = null;
    }

    /* create  in class push method
     * push stack operation to add the element at top
     */
    public void push(T x) {
        //create temp node and give top value
        Node temp = new Node();
        if (temp == null) {
            System.out.println("stack overflow");
        }
        temp.data = x;
        temp.link = topper;
        topper = temp;

    }

    //pop method to pop the stack value
    public void pop(){
        if(topper == null){
            System.out.println("stack underflow");
        }
        else
            topper = (topper).link;
    }
    //peek method give topper value

    public T peek(){
        if(topper != null){
            return topper.data;
        }
        else{
            System.out.println("stack underflow");
            return null;
        }
    }

    //display method to give the stack data
    public void display() {
        Node temp = null;
        if (topper == null) {
            System.out.println("stack underflow");
        }
        temp = topper;
        while (temp != null) {
            System.out.print(temp.data);
            System.out.print("->"+temp.data);
            temp = temp.link;
        }
    }
}



