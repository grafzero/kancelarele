package com.kancelarele.config.dao;

import com.kancelarele.model.event.Event;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface EventDao {
    
    List<Event> getEventsForCase(Long caseId);
    
}
