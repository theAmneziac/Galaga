/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transaction;

import assignment5.Main;
import account.CheckingAccount;

/**
 *
 * @author KidA
 */
public class DepositCharge extends ServiceCharge {
    
    public static final double AMOUNT = 0.10;
    
    public DepositCharge (int transNum)
    {
        super(transNum);
        this.transAmt = AMOUNT;
    }
    
//    @Override
//    public String toString()
//    {
//        String str = "Transaction #" + (transNum + 1) + " (Deposit Charge): $"
//                + Assignment2.format.format(transAmt);
//        
//        return str;
//    }
    
}
