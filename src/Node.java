/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duane
 */
public class Node {
    QueueElement data;
    Node next;
    
    public Node(QueueElement d, Node n){
        this.data = d;
        this.next = n;}

    public QueueElement getData() {
        return data;
    }

    public void setData(QueueElement data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "(" + data+")";
    }
}
