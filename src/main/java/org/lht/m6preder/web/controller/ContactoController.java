package org.lht.m6preder.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.lht.m6preder.persistence.entity.Contacto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/contacto")
public class ContactoController {

  @GetMapping
  public String mostrarFormularioContacto(){
    return "contacto";
  }


  @PostMapping
  public String procesarContacto(Contacto contacto){
    log.info("Contacto Solicitado: {}", contacto);
    return "redirect:/views-cliente/contacto";
  }


  @ModelAttribute(name = "contacto")
  public Contacto contacto(){
    return new Contacto();
  }
}
