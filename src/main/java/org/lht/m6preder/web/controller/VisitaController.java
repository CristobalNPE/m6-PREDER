package org.lht.m6preder.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.lht.m6preder.domain.dto.Inspection;
import org.lht.m6preder.domain.service.InspectionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/visita")
public class VisitaController {

  private final InspectionService service;

  public VisitaController(InspectionService service) {
    this.service = service;
  }

  @GetMapping("/nuevo")
  public String mostrarFormularioNuevaVisita() {
    return "views-profesional/formulario_visita";
  }

  @PostMapping("/nuevo")
  public String addVisita(Inspection inspection) {

    log.info("Visita creada; {}", inspection.toString());

    this.service.save(inspection);
    return "redirect:/visita/listar";
  }

  @GetMapping("/listar")
  public String listar(Model model) {
    model.addAttribute("listarVisitas", this.service.findAll());
    return "views-profesional/lista_visitas";
  }

  @ModelAttribute(name = "visita")
  public Inspection visita() {
    return new Inspection();
  }


/*
* Profesional -> crea Visita
* Pofesional ->Lista con visitas
*
*       -Visita al jumbo
*       -Visita al sodimac
*
* Administrativo -> crea checklist(revisiones)
*
* */




}