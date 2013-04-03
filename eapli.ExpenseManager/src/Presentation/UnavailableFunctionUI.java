package Presentation;

import Controllers.BaseController;

/**
 * User interface to be called when functions aren't implemented yet
 * @author João Carreira
 */
public class UnavailableFunctionUI extends BaseUI {

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
        System.out.println("  Unavailable function!  ");
        System.out.println("======================\n");
    }

    @Override
    public void mainLoop(){
        System.out.println("Please try again!\n\n");
    }
}
