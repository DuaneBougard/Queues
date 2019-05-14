/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duane
 */
public class ArrayQueue<E> {
    
    private int front = 0,rear = 0;
    private E[] Array;
    
    public ArrayQueue(int size){Array = (E[]) new Object[size+1];}
    
    public int size(){return ((Array.length - front + rear)%Array.length);}
        
    public boolean isEmpty(){return (front == rear);}
    
    public boolean isFull(){return (this.size() == Array.length-1);}
    
    public void Enqueue(E item){
        if (this.isFull()){System.out.println("Queue is full");}
        else{
            Array[rear] = item;
            rear = (rear +1)%Array.length;
        }
    }
    
    public E Dequeue() throws EmptyQueueException{
        E item = null;
        try{
        if (this.size() == 0){throw new EmptyQueueException("Queue is empty");}
        else
        {
            item = Array[front];
            Array[front]= null;
            front = (front +1) % Array.length;}
        }
        catch(EmptyQueueException e){System.out.println(e.getMessage());}
        return item;
    }  
    
    public E front(){return Array[this.front];}
    
    public void Display(){
        for (int i = 0; i < Array.length-1; i++){System.out.println(Array[i]);}
    } 
}