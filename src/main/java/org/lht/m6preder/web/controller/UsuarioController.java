package org.lht.m6preder.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.lht.m6preder.domain.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Slf4j
@Controller
@RequestMapping("/usuario")
public class UsuarioController {

  private final UserService service;

  public UsuarioController(UserService service) {
    this.service = service;
  }

  @GetMapping("/listar")
  public String listar(Model model) {
    model.addAttribute("listarUsuarios", this.service.findAll());
    return "views-administrativo/lista_usuarios";
  }

}



