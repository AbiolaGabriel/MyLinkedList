import java.util.*;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyListIntegerContainerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyListIntegerContainerTest {
    @Test
    public void testAddToBack(){
        MyListIntegerContainer listCon = new MyListIntegerContainer(0);
        for(int i = 1; i<=22; i++){
            listCon.addToBack(i);
        }

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i<=22; i++){
            arr.add(i);
        }
        int count = 0;
        for(Integer x: listCon.list){
            //System.out.println(x +""+""+ arr.get(count));
            assert x == arr.get(count);
            count++;
        }

    }

    @Test
    public void testAddToFront(){
        MyListIntegerContainer listCon = new MyListIntegerContainer(0);
        for(int i = 1; i<=22; i++){
            listCon.addToFront(i);
        }

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i<=22; i++){
            arr.add(0,i);
        }
        int count = 0;
        for(Integer x: listCon.list){
            //System.out.println(x +""+""+ arr.get(count));
            assert x == arr.get(count);
            count++;
        }
    }

    @Test
    public void testSearchIte(){
        MyListIntegerContainer listCon = new MyListIntegerContainer(0);
        for(int i = 1; i<=22; i++){
            listCon.addToFront(i);
        }
        int count = 0;
        for(int i = 22; i>=0; i--){
            assert count == listCon.searchIte(i);
            count++;
        }

        MyListIntegerContainer listCon2 = new MyListIntegerContainer(0);
        for(int i = 1; i<=22; i++){
            listCon2.addToBack(i);
        }

        count = 0;
        for(int i = 0; i<=22; i++){
            assert count == listCon2.searchIte(i);
            count++;
        }

        MyListIntegerContainer listCon3 = new MyListIntegerContainer(0);
        assert listCon3.searchIte(0) == 0;
        assert listCon3.searchIte(200) == -1;

        MyListIntegerContainer listCon4 = new MyListIntegerContainer();
        //because the list is empty searchIte() method would not work because there's nothing to search for 
        assert listCon4.list.isEmpty() == true;
    }

    @Test
    public void testSearch(){
        MyListIntegerContainer listCon = new MyListIntegerContainer(0);
        for(int i = 1; i<=22; i++){
            listCon.addToFront(i);
        }
        int count = 0;
        for(int i = 22; i>=0; i--){
            assert count == listCon.search(i);
            count++;
        }

        MyListIntegerContainer listCon2 = new MyListIntegerContainer(0);
        for(int i = 1; i<=22; i++){
            listCon2.addToBack(i);
        }

        count = 0;
        for(int i = 0; i<=22; i++){
            assert count == listCon2.search(i);
            count++;
        }

        MyListIntegerContainer listCon3 = new MyListIntegerContainer(0);
        assert listCon3.search(0) == 0;
        assert listCon3.search(200) == -1;

        MyListIntegerContainer listCon4 = new MyListIntegerContainer();
        //because the list is empty searchIte() method would not work because there's nothing to search for 
        assert listCon4.list.isEmpty() == true;

    }
}
