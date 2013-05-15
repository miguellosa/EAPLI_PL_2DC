package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.Calendar;
import eapli.util.DateTime;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;

/**
 *
 * @author Magano
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Movement implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private String description;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateOcurred;
    private BigDecimal amount;

    public Movement() {
    }

    public Movement(String description, Date dateOcurred, BigDecimal amount) {
        if (description == null || dateOcurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        if (amount.signum() == -1 || amount.signum() == 0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.dateOcurred = dateOcurred;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public Date getDateOcurred() {
        return dateOcurred;
    }

    public BigDecimal getAmount() {
        return amount;
    }
   
}
