import java.util.*;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyLinkedListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyLinkedListTest{
    @Test
    public void testAddFirst(){
        MyLinkedList<Integer> listOne = new MyLinkedList<>(Integer.valueOf(0));
        ArrayList one = new ArrayList();
        one.add(0,0);
        for(int i = 1; i<20; i++){
            listOne.addFirst(Integer.valueOf(i));
            one.add(0,Integer.valueOf(i));
        }
        int y = 0;
        for(Integer x: listOne){
            assert x == one.get(y);
            y++;
        }
        y=0;
        MyLinkedList<String> listTwo = new MyLinkedList<>("a");
        ArrayList<String> two = new ArrayList<String>();
        two.add(0,"a");
        for(int i = 1; i<26; i++){
            listTwo.addFirst("x");
            two.add(0,"x");
        }
        for(String x: listTwo){
            //System.out.print(x);
            assert x.equals(two.get(y));
            y++;
        }

    }

    @Test
    public void testAddEnd(){
        MyLinkedList<Integer> listOne = new MyLinkedList<>(Integer.valueOf(0));
        ArrayList one = new ArrayList();
        one.add(0);
        for(int i = 1; i<20; i++){
            listOne.addEnd(Integer.valueOf(i));
            one.add(Integer.valueOf(i));
        }
        int y = 0;
        for(Integer x: listOne){
            assert x == one.get(y);
            y++;
        }
        y=0;
        MyLinkedList<String> listTwo = new MyLinkedList<>("a");
        ArrayList<String> two = new ArrayList<String>();
        two.add(0,"a");
        for(int i = 1; i<26; i++){
            listTwo.addEnd("x");
            two.add("x");
        }
        for(String x: listTwo){
            //System.out.print(x);
            assert x.equals(two.get(y));
            y++;
        }
        
        
    }
}
