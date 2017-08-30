package com.kancelarele.config.service;

import com.kancelarele.config.dao.CaseDao;
import com.kancelarele.model.Case;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class CaseServiceImpl implements CaseService {

    @Autowired
    private CaseDao caseDao;

    private static final Logger log = Logger.getLogger(CaseDao.class);

    @Transactional
    @Override
    public List<Case> getAllCases() {
        List<Case> allCases = caseDao.getAll();

        for (Case c : allCases) {
            System.out.println("Case info: " + c);
        }

        return allCases;
    }

    @Override
    public List<Case> getAllCasesForUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Case getCaseById(Long caseId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addOrUpdateCase(Case caseForUpdateOrPersist) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
