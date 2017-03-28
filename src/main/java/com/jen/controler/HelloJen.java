/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jen.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author amine.jendoubi
 */
@Controller
public class HelloJen {

    @RequestMapping(value = "/param")
    public String sayHello(Model model) {
        model.addAttribute("param", "hello jen");
        return "hello";
    }
}
