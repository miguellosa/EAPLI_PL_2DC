/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.*;
import Model.*;
import eapli.util.Console;
import java.util.*;
import java.math.BigDecimal;

/**
 *
 * @author Tiago
 */
public class DisplayGraphUI extends BaseUI {
    
    public BigDecimal maxSum(List<BigDecimal> sums){
       BigDecimal max = BigDecimal.ZERO;
        
       for(int i=0;i<sums.size();i++)
           if(sums.get(i).compareTo(max) > 0)
                max=sums.get(i);                
        
       return max;
    }
    
    private String createLine(BigDecimal coef, BigDecimal sum){
       String line="";
       
       while(sum.compareTo(BigDecimal.ZERO) > 0){
            line += "*";
            sum = sum.subtract(coef);
       }
       
       return line;
    }
    
    public void displayGraphUI(int month, int year){
        ExpenseTypeController typesController = new ExpenseTypeController();
        List<ExpenseType> types = typesController.getRegisterExpenseTypeList();
        
        DisplayGraphController dispController = new DisplayGraphController();
        List<BigDecimal> sums = dispController.getSum(year, month, types);
        
        String [][] grafico=new String [types.size()][2];
        BigDecimal max=maxSum(sums);
        BigDecimal coef=max.divide(new BigDecimal(30));

        for(int i=0;i<types.size();i++)
        {
            grafico[i][0] = types.get(i).getDescription() + "\t\t\t\t";
            grafico[i][1] = createLine(coef, sums.get(i));
        }
        
        printGraph(grafico);
    }
    

   @Override
    public BaseController controller(){
        return null;
    }

    @Override
    public void show() {
        headline();
        mainLoop();
    }
    
    @Override
    protected void headline() {
        System.out.println("======================");
        System.out.println("Display Aggregated Expenses by Graphic");
        System.out.println("======================\n");
    }

    @Override
    public void mainLoop() {
        
        
        int year  = Console.readInteger("Year?");
        int month = Console.readInteger("Month?");
             
        displayGraphUI(month, year);
        
        System.out.println("End of graph!!!");
    }

    private void printGraph(String[][] grafico) {
        for(int i=0;i<grafico.length;i++){
            System.out.println(grafico[i][0] + "" + grafico[i][1]);
        }
    }
    
}
