
/**
 * In this class, I am creating a 
 *
 * @Abiola Gabriel Olofin
 * 
 */
public class MyListIntegerContainer{
    MyLinkedList<Integer> list;
    public MyListIntegerContainer(){
        this.list = new MyLinkedList<Integer>();
    }

    public MyListIntegerContainer(Integer x){
        this.list = new MyLinkedList<Integer>(x);
    }

    /**
     * This method adds an integer to the end of the list
     * 
     * @param - Integer x which will be added to the end of the list as a node
     */
    public void addToBack(Integer x){
        list.addEnd(x);
    }

    /**
     * This methods adds an integer to the beginning of the list and makes it the head
     * 
     * @param - Integer x which will be added to the beginning of the list as a node
     */
    public void addToFront(Integer x){
        list.addFirst(x);
    }

    /**
     * This method searches through the list for a the first occurence of the integer x and returns the index of the first occurence
     * This method also uses the iterator to search through the list
     * 
     * @param - Integer x which is the value you are looking for in the list 
     */
    public int searchIte(Integer x){
        MyLinkedListIterator<Integer> ite = new MyLinkedListIterator(this.list);
        int index = 0;
        while(ite.hasNext()){
            int y = ite.next();
            //System.out.println(y);
            if(y == x){
                return index;
            }
            index++;
        }
        return -1;
    }

    /**
     * This method searches through the list for a the first occurence of the integer x and returns the index of the first occurence
     * This method does not use an iterator to search
     * 
     * @param - Integer x which is the value you are looking for in the list
     */
    public int search(Integer x){
        int index = 0;
        Node<Integer> current = this.list.head;
        while(current != null){
            int y = current.getCurrentValue();
            if(y == x){
                return index;
            }
            index++;
            current = current.getNext();
        }
        return -1;
    }
}
