package com.tfc.project.controller;

import com.tfc.project.entity.CTO;
import com.tfc.project.service.CTOservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class controller {

    private final CTOservice ctoService;


    public controller(CTOservice ctoService) {
        this.ctoService = ctoService;
    }

    @GetMapping("")
    public String login(){
        return "login";
    }

    @GetMapping("/criar_1")
    public String criar_cto_1(){
        return "criar_cto_1";
    }

    @GetMapping("/criar_2")
    public String criar_cto_2(){
        return "criar_cto_2";
    }

    @GetMapping("/cto's")
    public String cto_list(){
        return "cto_list";
    }

    @GetMapping("/estatisticas")
    public String estatisticas(){
        return "estatisticas";
    }
}
