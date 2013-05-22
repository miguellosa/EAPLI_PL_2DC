/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;

/**
 *
 * @author 1100447
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Card extends PaymentMean{
    
    String cardName;
    String bank;
    String cardNumber;
    String nameOnCard;
    @Temporal (javax.persistence.TemporalType.DATE)
    Calendar validUntil;

    public Card() {
    }

    public Card(String cardName, String bank, String cardNumber, String nameOnCard, Calendar validUntil) {
        
       /* if (Validations.isNullOrEmpty(cardName)||Validations.isNullorEmpty(bank)
            ||Validations.isNullorEmpty(cardName)||Validations.isNullorEmpty(nameOnCard)
            ||validUntil == null){
            
            throw new IllegalArgumentException();
        }*/
        
        this.cardName = cardName;
        this.bank = bank;
        this.cardNumber = cardNumber;
        this.nameOnCard = nameOnCard;
        this.validUntil = validUntil;
    }
    
    
}
