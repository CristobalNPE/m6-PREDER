package org.lht.m6preder.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.lht.m6preder.domain.dto.Professional;
import org.lht.m6preder.domain.service.ProfessionalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("profesional")
public class ProfesionalController {

  private final ProfessionalService service;


  public ProfesionalController(ProfessionalService service) {
    this.service = service;
  }

  @GetMapping("/nuevo")
  public String mostrarFormularioNuevoProfesional() {
    return "views-administrativo/formulario_administrativo";
  }

  @PostMapping("/nuevo")
  public String addProfesional(Professional professional ) {
    log.info("Profesional creado: {}", professional);

    this.service.save(professional);
    return "redirect:/usuario/listar";
  }

  @GetMapping("/editar")
  public String mostrarFormularioEditarProfesional() {
    return "views-profesional/formulario_editarProfesional";
  }

  @ModelAttribute(name = "profesional")
  public Professional profesional() {
    return new Professional();
  }
}
