package com.springbootfundamentals.web;

import com.springbootfundamentals.service.IApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class webController {
    private final  IApplicationService iApplicationService;
    @Autowired
    public webController(IApplicationService iApplicationService) {
        this.iApplicationService = iApplicationService;
    }

    @GetMapping("/applications")
    public String retrieveApplications(Model model){
        model.addAttribute("applications", iApplicationService.listApplications());
        return "applications";
    }

}
