/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;

/**
 *
 * @author Miguel
 */
public abstract class BaseUI {
    
    public abstract void show();
    
    protected abstract void headline();
    
    protected abstract void mainLoop();
    
    public abstract BaseController controller();
    
}
