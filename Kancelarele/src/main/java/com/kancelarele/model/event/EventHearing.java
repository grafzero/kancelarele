package com.kancelarele.model.event;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("hearing")
public class EventHearing extends Event {
    
private String court;


}
