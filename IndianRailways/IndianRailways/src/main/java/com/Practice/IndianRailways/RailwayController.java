package com.Practice.IndianRailways;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RailwayController {

    @Autowired
    RailwayService railwayService ;

    @RequestMapping
    public String rail(Model model){
        model.addAttribute("Trains" , railwayService.getStats());
        return  "Rail" ;
    }
}
