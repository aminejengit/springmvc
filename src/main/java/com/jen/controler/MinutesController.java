/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jen.controller;

import com.jen.model.Exercice;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author amine.jendoubi
 */
@Controller
public class MinutesController {
    @RequestMapping(value = "/minutes")
    public String addMinutes(@ModelAttribute ("exercice") Exercice exercice){
        System.out.print(exercice.getMinutes());
        return "minutes";
    }
}
