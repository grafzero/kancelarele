
package com.kancelarele.config.dao;

import com.kancelarele.model.event.Event;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.log4j.Logger;


public class EventDaoImpl implements EventDao {
    
      @PersistenceContext(unitName = "entityManagerFactory")
    private EntityManager em;

    private static final Logger log = Logger.getLogger(EventDaoImpl.class);

    @Override
    public List<Event> getEventsForCase(Long caseId) {
        
        log.info("Getting all events...");
        Query query = em.createQuery("Select e FROM Event e where e.eventCase.id=" + caseId + "order by e.happenedat DESC");
        List<Event> results = (List<Event>) query.getResultList();
        log.info("Cases found: " + results.size());
        System.out.println("Cases found: " + results.size());

//        for (Case cs : results) {
//           cs.getEvents().isEmpty(); // initalize collection
//         
//        }
        return results;
        
        
        
    }
    
    
    
    

}
