/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager;

import Presentation.MainMenu;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author Paulo Gandra Sousa
 */
public class ExpenseManager {

    /**
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        loadProperties();
	// ExpenseBootstrapper e=new ExpenseBootstrapper();
	// ExpenseTypeBootstraper eT=new ExpenseTypeBootstraper();
	MainMenu menu = new MainMenu();
	menu.show();
    }
    
    private static Properties applicationProperties = new Properties();
    
    public static Properties getApplicationProperties() {
        return applicationProperties;
    }
    
    private static void loadProperties() {
        try{
            applicationProperties.load(new FileInputStream("./src/eapli/expensemanager/expensemanager.properties"));
        } catch(IOException ex){
            applicationProperties.setProperty("persistence.repositoryFactory", "eapli.ExpenseManager.Persistence.JpaRepositoryFactory");
            
            ex.printStackTrace();
        }
    }
    
    private static void doBootStrap() {
        
       /* Bootstrap referenceDataBootstrap = new Bootstrap();
        
        SomeIncomesBootstrap sampleIncomesBootstrap = new SomeIncomesBootstrap();
        
        SomeExpensesBootstrap sampleExpensesBootstrap = new SomeExpensesBootstrap();
        
        SomeDefaultAlertLimitBootstrap defaultAlertLimits = new SomeDefaultAlertLimitBootstrap();*/
    }
}