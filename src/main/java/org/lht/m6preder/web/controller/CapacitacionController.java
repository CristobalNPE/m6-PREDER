package org.lht.m6preder.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.lht.m6preder.domain.dto.Training;

import org.lht.m6preder.domain.service.TrainingService;

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

  private final TrainingService service;

  public CapacitacionController(TrainingService service) {
    this.service = service;
  }

  @GetMapping("/nueva")
  public String mostrarFormularioNuevaCapacitacion() {
    return "views-cliente/formulario_capacitacion";
  }

  @GetMapping("/editar")
  public String mostrarFormularioEditarCapacitacion() {
    return "views-cliente/formulario_editarCapacitacion";
  }

  @PostMapping("/nueva")
  public String addCapacitacion(Training training) {
    log.info("Capacitacion creada: {}", training);

    this.service.save(training);
    return "redirect:/capacitacion/listar";
  }

  @GetMapping("/listar")
  public String listar(Model model) {
    model.addAttribute("listaCapacitaciones", this.service.findAll());
    return "views-cliente/lista_capacitaciones";
  }

  @ModelAttribute(name = "capacitacion")
  public Training capacitacion() {
    return new Training();
  }


}
