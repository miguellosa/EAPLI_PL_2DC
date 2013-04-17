/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.DisplayGraphController;
import Controllers.ExpenseTypeController;
import Model.ExpenseType;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Scare
 */
public class DisplayExpensesByTypeUI extends BaseUI{
    
    
    
    
    /**
     * Method that will calculate the max sum of a list of sums
     * @author Ricardo Brandão 1111121
     * @author Vitor Sousa 1111116
     */
    private BigDecimal maxSum(List<BigDecimal> sums){
       BigDecimal max = BigDecimal.ZERO;
        
       for(int i=0;i<sums.size();i++)
           if(sums.get(i).compareTo(max) > 0)
                max=sums.get(i);                
        
       return max;
    }
    
    /**
     * Method that will create a line of asterisks based on coefficient of max sum
     * @author Ricardo Brandão 1111121
     * @author Vitor Sousa 1111116
     * @return a line with asterisks
     */
    private String createLine(BigDecimal coef, BigDecimal sum){
       String line="";
       
       while(sum.compareTo(BigDecimal.ZERO) > 0){
            line += "*";
            sum = sum.subtract(coef);
       }
       
       return line;
    }
    
    /**
     * Method that will call the necessary methods to write the graph
     * @author Ricardo Brandão 1111121
     * @author Vitor Sousa 1111116
     */
    private void displayExpenseByTypeUI(int month, int year){
        ExpenseTypeController typesController = new ExpenseTypeController();
        List<ExpenseType> types = typesController.getRegisterExpenseTypeList();
        
        DisplayGraphController dispController = new DisplayGraphController();
        List<BigDecimal> sums = dispController.getSum(year, month, types);
        
        String [][] tabela=new String [types.size()][2];
        BigDecimal max=maxSum(sums);
        BigDecimal coef=max.divide(new BigDecimal(30));

        for(int i=0;i<types.size();i++)
        {
            tabela[i][0] = types.get(i).getDescription() + "\t";
            tabela[i][1] = createLine(coef, sums.get(i));
        }
        
        printTable(tabela);
    }
    
    /**
     * Constructor of base controller
     * @author Ricardo Brandão 1111121
     * @author Vitor Sousa 1111116
     */
    
    private BaseController controller = new BaseController();
    
   @Override
    public BaseController controller(){
        return controller;
    }

    /**
     * Method that will call the necessary methods to write the graph
     * @author Ricardo Brandão 1111121
     * @author Vitor Sousa 1111116
     */
    @Override
    public void show() {
        headline();
        //System.out.println("Semana: "+controller.showWeeklyExpenses()+"            |||            "+"Mês: "+controller.getCurrentMonthExpenses());
        mainLoop();
    }
    
    /**
     * Method that will write the headline in console
     * @author Ricardo Brandão 1111121
     * @author Vitor Sousa 1111116
     */
    @Override
    protected void headline() {
        System.out.println("======================");
        System.out.println("Display Aggregated Expenses this month");
        System.out.println("======================\n");
    }

    /**
     * Method that will write the body in console
     * @author Ricardo Brandão 1111121
     * @author Vitor Sousa 1111116
     */
    @Override
    public void mainLoop() {
        Calendar today = eapli.util.DateTime.today();
        displayExpenseByTypeUI(today.MONTH, today.YEAR);
    }

    /**
     * Method that will write the graph in the console
     * @author Ricardo Brandão 1111121
     * @author Vitor Sousa 1111116
    */
    private void printTable(String[][] tabela) {
        for(int i=0;i<tabela.length;i++){
            System.out.println(tabela[i][0] + "" + tabela[i][1]);
        }
    }
    
}
