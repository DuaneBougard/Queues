
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duane
 */
public class ArrayQueueDriver{
    public static void main(String[] args) throws EmptyQueueException{
    Scanner key = new Scanner(System.in);
    System.out.println("What is the size of your the array?");
    int ans = key.nextInt();
    ArrayQueue tester = new ArrayQueue(ans);
    
    do{
    System.out.println("Which method would you like to perform?");
    System.out.println("1.enqueue(object)");
    System.out.println("2.dequeue()");
    System.out.println("3.front()");
    System.out.println("4.size()");
    System.out.println("5.isEmpty()");
    System.out.println("6.isFull()");
    System.out.println("7.Display()");
    System.out.println("Or 0 to exit");
    ans = key.nextInt();
        if (ans ==1){
            
            if(tester.isFull()){
                System.out.println("Cannot add more items");}
            else{
                System.out.println("Enter an item to add to the queue");
                String ans1=key.next();
                tester.Enqueue(ans1);
                System.out.println("Added " + ans1 + " to the queue");
            }
        }
        if (ans ==2){
            tester.Dequeue();}
        if (ans ==3){
            if(tester.isEmpty()){System.out.println("Queue is Empty!");}
            else{
                System.out.println("The task in the front position of the queue is: " + tester.front());
            }
        }
        if (ans ==4){
            System.out.println('\n' +"Size of the queue is " +tester.size());}
        if (ans ==5){
            System.out.println(tester.isEmpty());}
        if (ans ==6){
            System.out.println(tester.isFull());}
           if (ans ==7){
            System.out.println("Printing queue.......");
            tester.Display();}
    }while(ans!=0);
        
        
    }
}