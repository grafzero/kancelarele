package com.kancelarele.config;

import com.kancelarele.config.dao.CaseDao;
import com.kancelarele.config.dao.CaseDaoImpl;
import com.kancelarele.config.dao.EventDao;
import com.kancelarele.config.dao.EventDaoImpl;
import com.kancelarele.config.service.CaseService;
import com.kancelarele.config.service.CaseServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@Configuration
@ComponentScan({"com.kancelarele.service", "com.kancelarele.dao"})
public class Beans {
    
    @Bean
    public CaseDao caseDao(){
    return new CaseDaoImpl();
    }
    
    @Bean
    public CaseService caseService(){
    return new CaseServiceImpl();
    }
    
     @Bean
    public EventDao eventDao(){
    return new EventDaoImpl();
    }

   

}
