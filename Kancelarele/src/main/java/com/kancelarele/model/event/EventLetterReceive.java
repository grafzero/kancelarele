/*

 */

package com.kancelarele.model.event;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("letter_receive")
public class EventLetterReceive extends Event {
    
  //  private static final String EVENT_NAME  = "Otrzymanie pisma";    
    @Transient
    private String eventName = "Otrzymanie pisma";
    private String letterFrom;

    public String getLetterFrom() {
        return letterFrom;
    }

    public void setLetterFrom(String letterFrom) {
        this.letterFrom = letterFrom;
    }

//    public static String getEVENT_NAME() {
//        return EVENT_NAME;
//    }

    public String getEventName() {
        return eventName;
    }
    
    
    
    

}
