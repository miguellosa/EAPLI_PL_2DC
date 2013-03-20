/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Class that will instantiate the predefined payment types: Credit Card, Debit Card, Check, Cash.
 * @author Andre 1100859
 * @author Tiago 1110333
 * @version 1.0
 */
public class PaymentType {
    public static final PaymentType CreditCard = new PaymentType("Credit Card");
    public static final PaymentType DebitCard = new PaymentType("Debit Card");
    public static final PaymentType Check = new PaymentType("Check");
    public static final PaymentType Cash = new PaymentType("Cash");
    
    private String type;

    /**
     * Method that will create a new object of type of payment.
     * @param type the new type of payment that will be created.
     * @author Andre 1100859
     * @author Tiago 1110333
     * @version 1.0
     * @since 1.0
     */
    private PaymentType(String type) {
        this.type = type;
    }
    
   
    
}
