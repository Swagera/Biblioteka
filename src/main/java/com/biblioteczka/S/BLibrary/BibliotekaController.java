package com.biblioteczka.S.BLibrary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BibliotekaController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

}
