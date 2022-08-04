package org.lht.m6preder.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.lht.m6preder.domain.dto.Manager;
import org.lht.m6preder.domain.service.ManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/administrativo")
public class AdministrativoController {

  private final ManagerService service;


  public AdministrativoController(ManagerService service) {
    this.service = service;
  }

  @GetMapping("/nuevo")
  public String mostrarFormularioNuevoAdministrativo() {
    return "views-administrativo/formulario_administrativo";
  }

  @PostMapping("/nuevo")
  public String addAdministrativo(Manager manager) {
    log.info("Administrativo creado: {}", manager);

    this.service.save(manager);
    return "redirect:/usuario/listar";
  }


  @GetMapping("/editar")
  public String mostrarFormularioEditarAdministrativo() {
    return "views-administrativo/formulario_editarAdministrativo";
  }

  @ModelAttribute(name = "administrativo")
  public Manager administrativo() {
    return new Manager();
  }


}
