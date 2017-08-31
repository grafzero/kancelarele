/*

 */

package com.kancelarele.model.event;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("letter_send")
public class EventLetterSend extends Event {
    
   // private static final String EVENT_NAME  = "Wysłanie pisma";    
    @Transient
    private String eventName = "Wyslanie pisma";
    private String letterTo;

    public String getLetterTo() {
        return letterTo;
    }

    public void setLetterTo(String letterTo) {
        this.letterTo = letterTo;
    }

//    public static String getEVENT_NAME() {
//        return EVENT_NAME;
//    }

    public String getEventName() {
        return eventName;
    }
    
    

    
}
