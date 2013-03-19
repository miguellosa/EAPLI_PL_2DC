/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;

/**
 *
 * @author Vítor
 */
public class PaymentMethodCheck {
    private DateTime checkDate;
    private double value;
    private int checkNumber;
    
    
    public PaymentMethodCheck(){
        checkDate=new DateTime();
        value=0;
        int chekNumber=0;
    }
    
    public PaymentMethodCheck(DateTime date, double value, int number){
        checkDate=date;
        this.value=value;
        checkNumber=number;
    }

    public DateTime getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(DateTime checkDate) {
        this.checkDate = checkDate;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(int checkNumber) {
        this.checkNumber = checkNumber;
    }
    
}
