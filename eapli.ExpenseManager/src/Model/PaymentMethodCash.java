/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Luis Mendes
 */
public class PaymentMethodCash extends PaymentMethod {

    public PaymentMethodCash (String description){
        super (description, PaymentType.Cash);
        
    }

}
