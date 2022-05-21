import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class coffeeTEST {
    @Test
    public void Test_coffee(){
        CoffeeMachine coff = new CoffeeMachine();
        for(int i=0;i<100;i++){
            coff.insert_money(i);
            coff.brew_coffee();
            System.out.println("");
        }
    }
}