/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;

/**
 *
 * @author i100447
 */
public class Account {
    
    String client;
    BigDecimal balance;
    
    protected Account(){}
    
    public Account(String client,BigDecimal balance){
        if(client==null||balance==null){
            throw new IllegalArgumentException();
        }
        this.client=client;
        this.balance=balance;
    }
    
    public void updateBalace(BigDecimal increment){
        if(increment==null){
            throw new IllegalArgumentException();
        }
        balance=balance.add(increment);
    }
}
