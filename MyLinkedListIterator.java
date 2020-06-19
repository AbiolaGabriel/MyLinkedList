import java.util.*;
/**
 * 
 */
public class MyLinkedListIterator<A> implements Iterator<A>{
    Node<A> current;
    public MyLinkedListIterator(MyLinkedList<A> list){
        this.current = list.returnHead();
    }
    //this returns true or false whether the current node has a next 
    public boolean hasNext(){
        return current !=null;
    }
    
    //this returns the value of the current node then updates the current node to the next node 
    public A next(){
        A element = this.current.getCurrentValue();
        //System.out.println(element);
        this.current = this.current.getNext();
        return element;
    }
    
}