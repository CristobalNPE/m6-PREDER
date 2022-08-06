package org.lht.m6preder.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.lht.m6preder.domain.service.ChecklistService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/revision")
public class RevisionController {

  private final ChecklistService service;

  public RevisionController(ChecklistService service) {
    this.service = service;
  }
//
//  @GetMapping("/nueva")
//  public String mostrarFormularioNuevaRevison() {
//    return "views-views-views-views-views-views-views-views-views-views-views-views-views-"
//  }

  @GetMapping("/listar")
  public String listar(Model model) {
    model.addAttribute("listaRevisiones", this.service.findAll());
    return "views-profesional/lista_revisiones";
  }

}
