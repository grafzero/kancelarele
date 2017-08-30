
package com.kancelarele.model.event;

import com.kancelarele.model.Case;
import java.util.Date;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance
@DiscriminatorColumn(name = "EVENT_TYPE")
public abstract class Event {
    
    @Id
    @GeneratedValue
    private int id;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date happenedAt; 
    
    
    private String remarks;
    
    @OneToOne
    @JoinColumn(name="cases_id")
    private Case eventCase;
    

}
