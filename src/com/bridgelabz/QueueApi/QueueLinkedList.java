package com.bridgelabz.QueueApi;

// linked list node to store the queue entry
class QueueLinkedList{
    int key;
    QueueLinkedList next;

    public QueueLinkedList(int key) {
        this.key = key;
        this.next = null;
    }
}
class QueueMainLinked {
    //create QueueMain data of front and rear value
    QueueLinkedList front,rear;
    //constructor to give value to front and rear
    public QueueMainLinked() {
        this.front = front;
        this.rear = rear;
    }
    //method to add key to the queue
    public void enqueue(int key){
        QueueLinkedList temp = new QueueLinkedList(key);
        // check the  queue is empty
        if(this.rear == null){
            this.front=this.rear = temp;
        }
        //add new node at end of the queue
        this.rear.next = temp;
        this.rear = temp;
    }
    // dqueue method to remove front data
    public void dqueue() {
        if (this.front == null) {
            System.out.println("queue does not have the value");
        }
        QueueLinkedList temp = this.front;
        this.front = this.front.next;
        if(this.front == null){
            this.rear = null;
        }
    }
    //dislay the queue data
    public void display(){
        QueueLinkedList temp = front;
        if(this.front == null){
            System.out.println("queue has no value");
        }
        while(temp.next != null){
            System.out.println(temp.key);
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println(temp.key);
        }
    }
}

