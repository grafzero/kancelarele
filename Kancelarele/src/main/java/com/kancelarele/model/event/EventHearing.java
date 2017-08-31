package com.kancelarele.model.event;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("hearing")
public class EventHearing extends Event {
    
//private static final String EVENT_NAME  = "Rozprawa";    
    
    @Transient
    private String eventName = "Rozprawa";
    
private String court;

    public String getCourt() {
        return court;
    }

    public void setCourt(String court) {
        this.court = court;
    }

//    public static String getEVENT_NAME() {
//        return EVENT_NAME;
//    }

    public String getEventName() {
        return eventName;
    }
    
    
    
    




}
