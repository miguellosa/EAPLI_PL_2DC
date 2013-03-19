/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * This class is responsible to create instances of DebitCards
 * @author Miguel Ladeiro - 1050782
 * @author Luis Alves - 1111217
 */

public class PaymentMethodDebitCard extends PaymentMethod {
    
    private int cardID;

    public PaymentMethodDebitCard(int cardID, String description) {
        super(description, PaymentType.DebitCard);
        this.cardID = cardID;
    }
    
    public int getCardID()
    {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    @Override
    public String toString() {
        return super.toString() + "Card Identification: " +cardID;
    }
    
}
