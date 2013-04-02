/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;

/**
 *
 * @author Vítor
 * @author Ricardo
 */
public class PaymentMethodCheck extends PaymentMethod{
    private int checkNumber;
    
    
    public PaymentMethodCheck(){
        super("",PaymentType.Check);
        checkNumber=0;
    }
    
    public PaymentMethodCheck(String description, int number){
        super(description, PaymentType.Check);
        checkNumber=number;
    }
    
    public int getCheckNumber(){
        return checkNumber;
    }
    
    public void setCheckNumber(int number){
        checkNumber=number;
    }
    
}
