import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class atmTEST {
    @Test
    public void Test_atm(){
        AtmMachine atm = new AtmMachine();
        atm.add_new_account("ahmed,1234,123,10000");
        atm.add_new_account("adham,12345,123,10000");
        atm.add_new_account("amr,12345678,123,10000");
        atm.add_new_account("omar,123456789,123,10000");
        atm.add_new_account("mohammed,1234567891,123,10000");
        atm.add_new_account("abdulraof,12345678912,123,10000");
        atm.add_new_account("abdulrahman,1234567,123,10000");
        atm.add_new_account("osama,123456789123,123,10000");
        String cc[] = {"1234","12345","1234567","12345678","123456789","1234567891","12345678912","123456789123"};
        for(int i=0;i<8;i++) {
            System.out.println("\nEnter Card Number:");
            System.out.println(cc[i]);
            atm.insert_card(cc[i]);
            atm.print_info();
            System.out.println("\nEnter Amount to Deposit:");
            System.out.println(Integer.toString(i*200));
            atm.deposit(i*200);
            atm.print_info();
            System.out.println("\nEnter Amount to Withdraw:");
            System.out.println(Integer.toString(i*400));
            atm.withdraw(i*400);
            atm.print_info();
            System.out.println("\nRetrieving Card......\n");
            atm.retrieve_card();
            atm.print_info();
        }
    }
}