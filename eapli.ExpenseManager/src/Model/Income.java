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
    
    public String toStringCSV()
    {
        StringBuilder buffer = new StringBuilder();
        buffer.append(incomeDescription);
        buffer.append(";");
        buffer.append(incomeValue);
        buffer.append(";");
        buffer.append(incomeType);
        buffer.append(";");
        buffer.append(incomeDate);
      
        return buffer.toString();
       
    }
    
    public String toStringXML(){
        return "<income\n>"
                + " <description>"+incomeDescription+"<\\description\n>"
                + " <date>"+incomeDate+"<\\date\n>"
                + " <amount> "+incomeValue+"<\\amount\n>"
                + " <type>"+incomeType+"<\\type\n>"
                + "<\\income>";
    }
}
