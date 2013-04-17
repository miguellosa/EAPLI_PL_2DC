package Presentation;

import Controllers.*;
import Model.*;
import eapli.util.Console;
import java.util.*;
import java.math.BigDecimal;

/**
 * Class that will show the graph with monthly expenses in a chart
 * @author André Silva 1100859
 * @author Tiago Pacheco 1110333
 * @version 1.0
 */
public class DisplayGraphUI extends BaseUI {
    
    /**
     * Method that will calculate the max sum of a list of sums
     * @author André Silva 1100859
     * @author Tiago Pacheco 1110333
     * @version 1.0
     * @since 1.0
     * @param sums list of sums
     * @return return a max of a list of sums
     */
    protected BigDecimal maxSum(List<BigDecimal> sums){
       BigDecimal max = BigDecimal.ZERO;
        
       for(int i=0;i<sums.size();i++)
           if(sums.get(i).compareTo(max) > 0)
                max=sums.get(i);                
        
       return max;
    }
    
    /**
     * Method that will create a line of asterisks based on coefficient of max sum
     * @author André Silva 1100859
     * @author Tiago Pacheco 1110333
     * @version 1.0
     * @since 1.0
     * @param coef coefficient of max sum
     * @param sum sum of type to be written
     * @return a line with asterisks
     */
    protected String createLine(BigDecimal coef, BigDecimal sum){
       String line="";
       
       while(sum.compareTo(BigDecimal.ZERO) > 0){
            line += "*";
            sum = sum.subtract(coef);
       }
       
       return line;
    }
    
    /**
     * Method that will call the necessary methods to write the graph
     * @author André Silva 1100859
     * @author Tiago Pacheco 1110333
     * @version 1.0
     * @since 1.0
     * @param month month to be queried
     * @param year year to be queried
     */
    protected void displayGraphUI(int month, int year){
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
    
    /**
     * Constructor of base controller
     * @author André Silva 1100859
     * @author Tiago Pacheco 1110333
     * @version 1.0
     * @since 1.0
     * @return null
     */
    
    private BaseController controller = new BaseController();
    
   @Override
    public BaseController controller(){
        return controller;
    }

    /**
     * Method that will call the necessary methods to write the graph
     * @author André Silva 1100859
     * @author Tiago Pacheco 1110333
     * @version 1.0
     * @since 1.0
     */
    @Override
    public void show() {
        headline();
        System.out.println("Semana: "+controller.showWeeklyExpenses()+"            |||            "+"Mês: "+controller.getCurrentMonthExpenses());
        mainLoop();
    }
    
    /**
     * Method that will write the headline in console
     * @author André Silva 1100859
     * @author Tiago Pacheco 1110333
     * @version 1.0
     * @since 1.0
     */
    @Override
    protected void headline() {
        System.out.println("======================");
        System.out.println("Display Aggregated Expenses by Graphic");
        System.out.println("======================\n");
    }

    /**
     * Method that will write the body in console
     * @author André Silva 1100859
     * @author Tiago Pacheco 1110333
     * @version 1.0
     * @since 1.0
     */
    @Override
    public void mainLoop() {
        
        
        int year  = Console.readInteger("Year?");
        int month = Console.readInteger("Month?");
             
        displayGraphUI(month, year);
        
        System.out.println("End of graph!!!");
    }

    /**
     * Method that will write the graph in the console
     * @author André Silva 1100859
     * @author Tiago Pacheco 1110333
     * @version 1.0
     * @since 1.0
     * @param grafico array that will be written 
    */
    protected void printGraph(String[][] grafico) {
        for(int i=0;i<grafico.length;i++){
            System.out.println(grafico[i][0] + "" + grafico[i][1]);
        }
    }
    
}
