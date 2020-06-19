import java.util.*;
/**
 * 
 */
public class Node<A>{
    //Variable to store node after current node
    Node<A> next;  

    A a;

    /**
     * Node default constructor sets next to null
     * and sets a to null as well
     */
    public Node(){
        next = null;
        this.a = null;
    }

    /**
     * Node constructor creates sets next to null
     * and sets this.a to the a in the param
     * 
     * @param   a variable 'a' is a object of a generic class
     */
    public Node(A a){
        this.next = null;
        this.a = a;
    }

    /**
     * getCurrentValue function gets the value of the current node
     * 
     * @return an object of the a generic class which is stored in the node
     * @param is nothing
     */
    public A getCurrentValue(){
        return this.a;
    }

    /**
     * getNext function gets the next node in the linked list
     * 
     * @return a node which is the next node
     * @param is nothing
     */
    public Node getNext(){
        return this.next;
    }

    /**
     * setValue function sets the value of a node to variable 'a'
     * which is an object of a generic class called A
     * 
     * @return  void
     * @param   a   variable 'a' is an object of a generic class
     */
    public void setValue(A a){
        this.a = a;
    }

    /**
     * setNext function sets a new node as the next node 
     * that a previous node will point to 
     * 
     * @return  void
     * @param   Node n  n is a Node which the previous node will point to when n is set as next
     */
    public void setNext(Node n){
        this.next = n;
    }
}