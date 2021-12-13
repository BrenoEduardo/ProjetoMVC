package com.example.alomundo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class alomundo {
    
    @RequestMapping("/alo")
    public String metodoMapeado(Model modelo){
        modelo.addAttribute("nro", 1);
        modelo.addAttribute("nro2", 100);
        modelo.addAttribute("x", "alo mundo");
        return "home";
    }
    @RequestMapping("/teste")
    public String metodoTeste(){
        return "teste";
    }
}
