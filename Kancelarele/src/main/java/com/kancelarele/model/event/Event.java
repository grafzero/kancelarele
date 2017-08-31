
package com.kancelarele.model.event;

import com.kancelarele.model.Case;
import java.util.Date;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance
@DiscriminatorColumn(name = "EVENT_TYPE")
@Table(name="events")
public abstract class Event {
    
    @Id
    @GeneratedValue
    private Long id;
    
//@ManyToOne
  //  @JoinColumn(name="EVENT_TYPE_NAME")
    @Embedded
    private EventType eventType;
  
    @Temporal(TemporalType.TIMESTAMP)
    private Date happenedat; 
    
    
    private String remarks;
    
    @OneToOne
    @JoinColumn(name="cases_id")
    private Case eventCase;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getHappenedat() {
        return happenedat;
    }

    public void setHappenedat(Date happenedat) {
        this.happenedat = happenedat;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Case getEventCase() {
        return eventCase;
    }

    public void setEventCase(Case eventCase) {
        this.eventCase = eventCase;
    }

   

    @Override
    public String toString() {
        return "Event{" + "id=" + id + ", happenedat=" + happenedat + ", remarks=" + remarks + '}';
    }
    
    
    

}
