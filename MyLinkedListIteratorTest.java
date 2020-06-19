import java.util.*;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyLinkedListIteratorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyLinkedListIteratorTest{
    @Test
    public void testHasNext(){
        MyLinkedList<Integer> list = new MyLinkedList<Integer>(Integer.valueOf(0));
        for(int i = 1; i<20; i++){
            list.addEnd(Integer.valueOf(i));
        }

        MyLinkedList<Integer> list2 = new MyLinkedList<Integer>();

        MyLinkedListIterator<Integer> ite = new MyLinkedListIterator<Integer>(list);
        while(ite.hasNext()){
            assert ite.hasNext() == true;
            ite.next();
        }
        assert ite.hasNext() == false;

        MyLinkedListIterator<Integer> ite2 = new MyLinkedListIterator<Integer>(list2);
        ite2.next();
        assert ite2.hasNext() == false;

    }

    @Test
    public void testNext(){
        MyLinkedList<Integer> list = new MyLinkedList<Integer>(Integer.valueOf(0));
        for(int i = 1; i<20; i++){
            list.addEnd(Integer.valueOf(i));
        }

        MyLinkedList<Integer> list2 = new MyLinkedList<Integer>();

        MyLinkedListIterator<Integer> ite = new MyLinkedListIterator<Integer>(list);
        int x = 0;
        while(ite.hasNext()){
            assert ite.next() == list.getElement(x);
            x++;
        }

        MyLinkedListIterator<Integer> ite2 = new MyLinkedListIterator<Integer>(list2);
        assert ite2.next() == null;
    }
}
