/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author i090566
 */
public class IncomeType extends MovementType{
	
    public IncomeType(){}
    
    public IncomeType(String shortName, String description) {
            super (shortName, description);
    }


    public void setDescription(String description) {
        this.description = description;
    }
    
}

