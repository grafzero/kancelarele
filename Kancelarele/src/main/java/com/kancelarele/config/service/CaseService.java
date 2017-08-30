package com.kancelarele.config.service;

import com.kancelarele.model.Case;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface CaseService {
    
    List<Case> getAllCases();
    List<Case> getAllCasesForUser(); 
    Case getCaseById(Long caseId);
    void addOrUpdateCase(Case caseForUpdateOrPersist);

}
