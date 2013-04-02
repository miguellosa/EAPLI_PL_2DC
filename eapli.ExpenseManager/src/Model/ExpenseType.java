
package Model;

/**
 *
 * @author i110557
 */
public class ExpenseType {
    
    private String description;
    
    protected ExpenseType() {}
    
    public ExpenseType(String description){
        
        if(description==null){
            throw new IllegalArgumentException();
        }    
        this.description=description;
    }

    public String getDescription() {
        return description;
    }
    
}
