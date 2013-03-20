/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;

/**
 * This class allows you to create instances of
 * Credit Cards Payment Methods
 * @author Diogo Leite 1100570
 * @author João Machado 1100596
 */
public class PaymentMethodCreditCard extends PaymentMethod {

    private int identificationNumber;
    private String bank;
    private BigDecimal plafon;
    
    public PaymentMethodCreditCard (String description, int identificationNumber, String bank, BigDecimal plafon)
    {
        super(description, PaymentType.CreditCard);
        this.identificationNumber = identificationNumber;
        this.bank = bank;
        this.plafon = plafon;
        
    }

    /**
     * @return the identificationNumber
     */
    public int getNumeroIdentificacao() {
        return identificationNumber;
    }

    /**
     * @return the bank
     */
    public String getBank() {
        return bank;
    }

    /**
     * @return the plafon
     */
    public BigDecimal getPlafon() {
        return plafon;
    }
    
}
