
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
public class PriorityQueueDriver {
       public static void main(String[] args){
            Scanner key = new Scanner(System.in);
            int ans;
            PriorityQueue tester = new  PriorityQueue();
            do{
                System.out.println("Which method would you like to perform?");
                System.out.println("1.enqueue(QueueElement)");
                System.out.println("2.dequeue()");
                System.out.println("3.isEmpty()");
                System.out.println("4.getSize()");
                System.out.println("5.front()");
                System.out.println("6.Display()");
                System.out.println("Or 0 to exit");
                ans = key.nextInt();
                if (ans ==1){
                    System.out.println("Enter an task to enqueue");
                    String ans1 = key.next();
                    System.out.println("What is the priority of that task?");
                    int ans2 = key.nextInt();
                    tester.Enqueue(new QueueElement(ans2,ans1));
                    System.out.println("Added " + ans1 + " to the queue");}
                if (ans ==2){
                    tester.Dequeue();}
                if (ans ==3){
                    System.out.println(tester.isEmpty());}
                if (ans ==4){
                    System.out.println('\n' +"Size of the queue is " +tester.getSize());}
                if (ans ==5){
                    if(tester.isEmpty()){System.out.println("Queue is Empty!");}
                    else{
                    System.out.println("The task in the front position of the queue is: " + tester.front());
                    }
                }
                if (ans ==6){
                    tester.Display();}
            }while(ans!=0);
        }
}

