package org.lht.m6preder.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/contacto")
public class ContactoController {

  @GetMapping
  public String mostrarFormularioContacto(){
    return "contacto";
  }


}
