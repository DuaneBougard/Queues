/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duane
 */
public class PriorityQueue {
    
    Node front = null;
    int size = 0;
    
    public void Enqueue(QueueElement q){
        if(size ==0){front = new Node(q,null);}
        else{
            Node start = front;
            Node NewNode;
            while(start!=null){
                
                if(start.getData().getPriority()<=q.getPriority() && start.getNext()== null){
                    start.setNext(new Node(q,null));
                    break;}
                
                else if(start.getData().getPriority()<=q.getPriority() && q.getPriority()< start.getNext().getData().getPriority()){
                    NewNode = new Node(q,start.getNext());
                    start.setNext(NewNode);
                    break;}
                
                else if(start.getData().getPriority()>q.getPriority()){
                    NewNode = new Node(q,start);
                    front = NewNode;
                    break;}

                else{
                    start = start.getNext();}
            }       
        }  
        size = size +1;}
   
    public Node Dequeue(){
        Node LowestPrio;
        if(this.size == 0)
            {System.out.println("Queue is empty");
            return null;}
        else{
            LowestPrio = front;
            System.out.println("Item removed: "+LowestPrio);
            front = front.getNext();}
        size = size -1;
        return LowestPrio;}

    public boolean isEmpty(){return (front==null);}
    
    public int getSize() {return size;}
            
    public Node front(){return front;}
    
    public void Display(){
        if(front==null){System.out.println("Queue is Empty");}
        else{
            System.out.println("Printing queue.......");
            Node start = front;
            while(start!= null){
                System.out.println(start);
                start = start.getNext();
            } 
        }
    }
}
