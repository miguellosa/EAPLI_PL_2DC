package Model;

import java.util.Date;


public class Income {
    
    private IncomeType incomeType;
    private double incomeValue;
    private Date incomeDate;
    private String incomeDescription;

    public Income(IncomeType incomeType, double incomeValue, Date incomeDate, String incomeDescription) {
        this.incomeType = incomeType;
        this.incomeValue = incomeValue;
        this.incomeDate = incomeDate;
        this.incomeDescription = incomeDescription;
    }

    @Override
    public String toString() {
        return "Income Type: "+ incomeType + "\nDate: "+ incomeDate+"\n Description: "+ incomeDescription + "\nValue: "+ incomeValue+"\n";
    }
    
    

    
    
    
    
}
