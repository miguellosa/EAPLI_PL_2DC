package Presentation;

/**
 * User interface to be called when functions aren't implemented yet
 * @author João Carreira
 */
public class UnavailableFunctionUI extends BaseUI {

    @Override
    public void show() {
        headline();
        mainLoop();
    }
    
    @Override
    protected void headline() {
        System.out.println("======================");
        System.out.println("  Configurations  ");
        System.out.println("======================\n");
    }

    @Override
    public void mainLoop(){
        System.out.println("Unavailable function!\nPlease try again!\n\n");
    }
}
