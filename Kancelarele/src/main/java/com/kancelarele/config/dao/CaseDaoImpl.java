package com.kancelarele.config.dao;

import com.kancelarele.model.Case;
import com.kancelarele.model.event.Event;
import java.util.Comparator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.log4j.Logger;


public class CaseDaoImpl implements CaseDao {
    
       @PersistenceContext(unitName = "entityManagerFactory")
    private EntityManager em;

    private static final Logger log = Logger.getLogger(CaseDao.class);

    @Override
    public List<Case> getAll() {
       log.info("Getting all cases...");
        Query query = em.createQuery("Select c FROM Case c");
        List<Case> results = (List<Case>) query.getResultList();
        log.info("Cases found: " + results.size());
        System.out.println("Cases found: " + results.size());

        for (Case cs : results) {
           cs.getEvents().isEmpty(); // initalize collection
         
        }
        return results;
    }

    @Override
    public List<Case> getByUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Case getOneCase(Long caseId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addCase(Case newCase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCase(Case updatedCase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
