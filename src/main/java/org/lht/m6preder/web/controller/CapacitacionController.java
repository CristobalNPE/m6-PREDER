package org.lht.m6preder.web.controller;


import lombok.extern.slf4j.Slf4j;
import org.lht.m6preder.domain.service.CapacitacionService;
import org.lht.m6preder.persistence.entity.Capacitacion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/capacitacion")
public class CapacitacionController {

  private final CapacitacionService service;

  public CapacitacionController(CapacitacionService service) {
    this.service = service;
  }

  @GetMapping("/nueva")
  public String mostrarFormularioNuevaCapacitacion(){
    return "formulario_capacitacion";
  }


  @PostMapping("/nueva")
  public String addCapacitacion(Capacitacion capacitacion){
    log.info("Capacitacion creada: {}", capacitacion);

    this.service.save(capacitacion);
    return "redirect:/capacitacion/listar";
  }

  @GetMapping("/listar")
  public String listar(Model model){
    model.addAttribute("listaCapacitaciones", this.service.getAll());


    return "lista_capacitaciones";
  }

  @ModelAttribute(name = "capacitacion")
  public Capacitacion capacitacion(){
    return new Capacitacion();
  }


}
