package Model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * 
 * @author i110557
 */
@Entity
public class ExpenseType extends MovementType {
    /*
    @Id
    @GeneratedValue
    private long Id;

    private String description;
    private String shortname;
*/
    protected ExpenseType() {
    }
    
     public ExpenseType(String shortName, String description) {
            super (shortName, description);
    }
/*
    public ExpenseType(String description, String shortname) {

	if (description == null || shortname == null)
	    throw new IllegalArgumentException();
	this.description = description;
	this.shortname = shortname;
    }

    public String getDescription() {
	return description;
    }
*/
}
