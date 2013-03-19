/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Luis Mendes
 */
public class CashMethod extends PaymentMethod {

    public CashMethod (String description){
        super (description, PaymentType.Cash);
    }

}
