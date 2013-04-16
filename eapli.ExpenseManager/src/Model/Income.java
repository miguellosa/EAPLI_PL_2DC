package Model;

import java.math.BigDecimal;
import java.util.Date;


public class Income {
    
    private IncomeType incomeType;
    private BigDecimal incomeValue;
    private Date incomeDate;
    private String incomeDescription;

    public Income(IncomeType incomeType, BigDecimal incomeValue, Date incomeDate, String incomeDescription) {
        this.incomeType = incomeType;
        this.incomeValue = incomeValue;
        this.incomeDate = incomeDate;
        this.incomeDescription = incomeDescription;
    }

    @Override
    public String toString() {
        return "Income Type: "+ incomeType + "\nDate: "+ incomeDate+"\n Description: "+ incomeDescription + "\nValue: "+ incomeValue+"\n";
    }
    
    public IncomeType getIncomeType(){
        return incomeType;
    }

    public BigDecimal getIncomeValue(){
        return incomeValue;
    }
    
    public Date getIncomeDate(){
        return incomeDate;
    }
    
    public String getIncomeDescription(){
        return incomeDescription;
    }
    
    public String toStringXML(){
        return "<income>"
                + "<description>"+incomeDescription+"<\\description>"
                + "<date>"+incomeDate+"<\\date>"
                + "<amount> "+incomeValue+"<\\amount>"
                + "<type>"+incomeType+"<\\type>"
                + "<\\income>";
    }
}
