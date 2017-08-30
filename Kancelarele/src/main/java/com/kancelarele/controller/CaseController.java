package com.kancelarele.controller;

import com.kancelarele.config.service.CaseService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CaseController {
    
    @Autowired private CaseService caseService;
    
    private static final Logger log = Logger.getLogger(CaseController.class);
    
    @GetMapping(value = "/cases")
    public String showCases(Model model) {

        log.info("Requested list of all cases (/cases)");
        System.out.println("klocek");
        
        model.addAttribute("cases", caseService.getAllCases());

       // model.addAttribute("downloadPageForm", new DownloadPage());
       // model.addAttribute("downloadPages", downloadService.getAllDownloadPages());
       
       
       
        return "allCases";
    }

}
