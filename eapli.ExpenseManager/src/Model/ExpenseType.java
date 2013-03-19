
package Model;


public class ExpenseType {
    
    String description;
    
    protected ExpenseType() {}
    
    public ExpenseType(String description){
        
        if(description==null){
            throw new IllegalArgumentException();
        }    
        this.description=description;
    }
}
