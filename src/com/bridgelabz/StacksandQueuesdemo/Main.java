package com.bridgelabz.StacksandQueuesdemo;

public class Main<T> {


        //creating linked list node

        private class Node {
            T data;
            Node list;
        }
        Node topper;
        //default constructor give null value at top
    public Main() {
            this.topper = null;
        }
        /* create  in class push method
         * push stack operation to add the element at top
         */
        public void push (T x){
            //create temp node and give top value
            Node temp = new Node();
            if (temp == null) {
                System.out.println("stack underflow");
            }
            temp.data = x;
            temp.list = topper;
            topper = temp;

        }
        //display method to give the stack data
        public void display () {
            Node temp = null;
            if (topper == null) {
                System.out.println("stack overflow");
            }
            temp = topper;
            while (temp != null) {
                System.out.print(temp.data);
                System.out.print("->");
                temp = temp.list;
            }
        }

    public static void main(String[] args) {
        System.out.println("Welcome to Stacks and Queues");
    }
}





