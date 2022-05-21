import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class watchTEST {
    @Test
    public void Test_watch(){
        WatchClock w = new WatchClock();
        w.GetData();
        String[] options = {"a","b","c","d"};
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter Option: ");
        String curr_op = options[(int) (Math.random() * options.length)];
        System.out.println(curr_op+"\n");
        int i =0;
        while (i<100){
            w.BtnPress(curr_op);
            w.GetData();
            System.out.println("\nEnter Option: ");
            curr_op = options[(int) (Math.random() * options.length)];
            System.out.println(curr_op+"\n");
            i++;
        }
    }
}
