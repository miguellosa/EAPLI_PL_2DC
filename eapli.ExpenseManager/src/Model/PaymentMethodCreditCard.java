/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * This class allows you to create instances of
 * Credit Cards Payment Methods
 * @author Diogo Leite 1100570
 * @author João Machado 1100596
 */
public class PaymentMethodCreditCard {

    private int numeroIdentificacao;
    
    public PaymentMethodCreditCard (int numeroIdentificacao)
    {
        this.numeroIdentificacao = numeroIdentificacao;
    }
    
    public PaymentMethodCreditCard()
    {
        
    }

    /**
     * @return the numeroIdentificacao
     */
    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    /**
     * @param numeroIdentificacao the numeroIdentificacao to set
     */
    public void setNumeroIdentificacao(int numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }
    
}
