import java.util.*;
/**
 * This class will be measuring how long it takes each search method to look for an element
 *
 * @author Abiola Gabriel Olofin
 */
public class ExperimentController{
    private MyListIntegerContainer list;
    //int x;
    public ExperimentController(int x){
        Random r = new Random(23);
        //this.x = x;
        int y = r.nextInt();
        this.list = new MyListIntegerContainer(y);
        while(x>0){
            //System.out.println("This is the next randomInt: "+y);
            y = r.nextInt();
            //System.out.println("This is the next randomInt: "+y);
            list.addToBack(y);
            x--;
        }
    }

    public static void main(String[]args){
        ExperimentController a = new ExperimentController(10000);
        //ExperimentController b = new ExperimentController(5000);
        //ExperimentController c = new ExperimentController(10000);
        boolean running = true;
        int x = 1;
        int tempInt = 0;
        while(x<11){
            System.out.print("This is trial "+ x);
            while(running){
                System.out.print(" This is the tempInt: "+tempInt);
                int temp = a.list.list.getElement(tempInt);
                //System.out.println("This is the temp: "+temp);
                System.out.print("  This is the timeSearchIte: "+a.timeSearchIte(temp));
                System.out.println("  This is the timeSearch: "+a.timeSearch(temp));
                tempInt = tempInt +5000;
                if(tempInt > 10000){
                    running = false;
                }
            }
            running = true;
            tempInt = 0;
            x++;
        }
    }

    /**
     * This method uses the searchIte(int x) method to search for a value and measures how long it takes to search for the element
     * It returns the amount of milliseconds it takes to search for the value
     * 
     * @param - int x which is the value the searchIte method will be looking for
     */
    public long timeSearchIte(int x){
        long startTime = System.currentTimeMillis();
        this.list.searchIte(x);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    /**
     * This method uses the search(int x) method to search for a value and measures how long it takes to search for the element
     * It returns the amount of milliseconds it takes to search for the value
     * 
     * @param - int x which is the value the search method will be looking for
     */
    public long timeSearch(int x){
        long startTime = System.currentTimeMillis();
        this.list.search(x);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }
}
