/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.IncomeType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author i090566
 */
public class IncomeTypeRepository implements IIncomeTypeRepository 
{
    
    private static List<IncomeType> listIncomeType = new ArrayList<IncomeType>();


    public IncomeTypeRepository(){
    }

    public void save(IncomeType incomeType){

            if(incomeType==null) throw new IllegalArgumentException();
            getListIncomeType().add(incomeType);

    }
    
    public static List<IncomeType> getListIncomeType() {
        return listIncomeType;
    }
}
