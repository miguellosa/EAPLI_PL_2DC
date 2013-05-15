/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Luis Mendes
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class MovementType implements Serializable{
    @Id
    @GeneratedValue
    private long Id;
    String shortName;
    String description;
    

    
    
    protected MovementType(){}
    
    public MovementType(String shortName, String description){
        if(shortName==null || description == null){
            throw new IllegalArgumentException();
            
        }
        if(shortName.trim().length()==0){
            throw new IllegalArgumentException();
        }
        this.shortName = shortName;
        this.description = description;
    }
    
    public long getId(){
        return Id;
    }
    
    public String getShortName(){
        return shortName;
    }
    
    public String getDescription(){
        return description;
    
    }
    
    public String toXml(){
            return "<description>"+description+"</description>";
      
    }
    
    public String toCsv(){
        return description +",";
    }
    
}
