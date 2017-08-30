

package com.kancelarele.config.dao;

import com.kancelarele.model.Case;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseDao {
    
    List<Case> getAll();
    List<Case> getByUser();
    Case getOneCase(Long caseId);
    void addCase(Case newCase);
    void updateCase(Case updatedCase);

}
