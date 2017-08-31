

package com.kancelarele.model.event;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("conversation")
public class EventConversation extends Event {
    
   //private final String EVENT_NAME = "Rozmowa";
    @Transient
    private String eventName = "Rozmowa";
    private String person;

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

//    public String getEVENT_NAME() {
//        return EVENT_NAME;
//    }

    public String getEventName() {
        return eventName;
    }
    
    
    
    
    

}
